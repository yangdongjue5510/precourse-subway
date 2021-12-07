package subway.service;

import subway.domain.Station;
import subway.domain.StationRepository;
import subway.view.StationView;

public class StationService {
	public static boolean addStation(String stationName) {
		if (containsStation(stationName)) {
			return false;
		}
		StationRepository.addStation(new Station(stationName));
		return true;
	}

	public static boolean deleteStation(String stationName) {
		if (containsStation(stationName)) {
			StationRepository.deleteStation(stationName);
			return true;
		}
		return false;
	}

	private static boolean containsStation(String name) {
		long count = StationRepository.stations().stream()
			.filter(station -> station.getName().equals(name))
			.count();
		if (count > 0) {
			return true;
		}
		return false;
	}
}
