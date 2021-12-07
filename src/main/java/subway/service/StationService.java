package subway.service;

import java.util.List;

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
		if (containsStation(stationName) && LineService.isFirstOrEnd(findStationById(stationName))) {
			StationRepository.deleteStation(stationName);
			return true;
		}
		return false;
	}

	public static List<Station> getAllStations() {
		List<Station> stationList = StationRepository.stations();
		return stationList;
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

	private static Station findStationById(String name) {
		return StationRepository.stations().stream()
			.filter(station -> station.getName().equals(name)).findFirst().get();
	}
}
