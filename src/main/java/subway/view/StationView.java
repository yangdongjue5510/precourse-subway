package subway.view;

import static subway.Constants.*;

import subway.domain.Station;

public class StationView {
	public static void addStationView() {
		System.out.println(MESSAGE_ADD_STATION);
	}

	public static void addStationSuccess() {
		System.out.println(INFO_ADD_STATION_SUCCESS);
	}

	public static void deleteStationView() {
		System.out.println(MESSAGE_DELETE_STATION);
	}

	public static void deleteStationSuccess() {
		System.out.println(INFO_DELETE_STATION);
	}

	public static void showStation(Station station) {
		System.out.println(INFO + station.getName());
	}

	public static void addStationToLine() {
		System.out.println("역이름 입력하세요.");
	}
}
