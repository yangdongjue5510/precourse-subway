package subway.view;

import static subway.ErrorConstants.*;

public class ErrorView {
	public static void menuInputError() {
		System.out.println(ERROR_MENU_INPUT);
	}
	public static void addStationError() {
		System.out.println(ERROR_ADD_STATION);
	}
	public static void deleteStationError() {
		System.out.println(ERROR_DELETE_STATION);
	}
	public static void lineError() {
		System.out.println(ERROR_LINE);
	}
	public static void stationError() {
		System.out.println(ERROR_STATION);
	}
}
