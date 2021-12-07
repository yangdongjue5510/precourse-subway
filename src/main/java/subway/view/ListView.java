package subway.view;

import static subway.Constants.*;

import java.util.List;

import subway.domain.LineRepository;
import subway.domain.Station;

public class ListView {
	public static void displayListView() {
		System.out.println(MESSAGE_LIST_FIRST);
		displayLine();
	}

	private static void displayLine() {
		LineRepository.lines().stream().forEach(line -> {
			LineView.showLine(line);
			System.out.println("[INFO] ---");
			displayStations(line.getStations());
			System.out.println();
		});
	}

	private static void displayStations(List<Station> stationList) {
		stationList.stream().forEach(station -> StationView.showStation(station));
	}
}
