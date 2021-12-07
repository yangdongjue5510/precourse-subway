package subway.view;

import static subway.Constants.*;

public class StationView {
	public static void disaplayStationView() {
		printStationMenu();
		CommonView.printMenuSelectView();
	}

	private static void printStationMenu() {
		System.out.println(MESSAGE_STATION_MENU);
	}
}
