package subway.validChecker;

import subway.view.ErrorView;

public class StationValidChecker {
	public static boolean stationNameLengthCheck(String name) {
		try {
			isValidStationName(name);
			return true;
		} catch (IllegalArgumentException exception) {
			ErrorView.addStationError();
			return false;
		}
	}

	private static void isValidStationName(String name) {
		if (name.length() < 2) {
			throw new IllegalArgumentException();
		}
	}
}
