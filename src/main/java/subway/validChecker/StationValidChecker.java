package subway.validChecker;

import java.util.NoSuchElementException;

import subway.domain.StationRepository;
import subway.view.ErrorView;

public class StationValidChecker {
	public static boolean stationNameLengthCheck(String name) {
		try {
			isNameLongerThanTwo(name);
			return true;
		} catch (IllegalArgumentException exception) {
			ErrorView.addStationError();
			return false;
		}
	}

	public static boolean stationExist(String name) {
		try {
			StationRepository.findStationById(name);
			return true;
		} catch (NoSuchElementException exception) {
			ErrorView.stationError();
			return false;
		}
	}

	private static void isNameLongerThanTwo(String name) {
		if (name.length() < 2) {
			throw new IllegalArgumentException();
		}
	}
}
