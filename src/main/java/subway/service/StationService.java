package subway.service;

import java.util.List;

import subway.domain.Station;
import subway.domain.StationRepository;

public class StationService {
	public static boolean addStation(String stationName) {
		if (StationRepository.containsStation(stationName)) {
			return false;
		}
		StationRepository.addStation(new Station(stationName));
		return true;
	}

	public static boolean deleteStation(String stationName) {
		if (StationRepository.containsStation(stationName)
			&& LineService.isFirstOrEnd(StationRepository.findStationById(stationName))) {
			StationRepository.deleteStation(stationName);
			return true;
		}
		return false;
	}

	public static List<Station> getAllStations() {
		List<Station> stationList = StationRepository.stations();
		return stationList;
	}
}
