package subway.validChecker;

import java.util.NoSuchElementException;

import subway.domain.LineRepository;
import subway.view.ErrorView;
import subway.view.LineView;

public class LineValidChecker {
	public static boolean checkAddLineName(String inputLine) {
		try {
			isNameDistinct(inputLine);
			isNameLongerThanTwo(inputLine);
			return true;
		} catch (Exception exception) {
			ErrorView.lineError();
			return false;
		}
	}

	private static void isNameDistinct(String name) {
		if (LineRepository.countLineByName(name) != 0) {
			throw new IllegalArgumentException();
		}
	}

	private static void isNameLongerThanTwo(String name) {
		if (name.length() < 2) {
			throw new IllegalArgumentException();
		}
	}
}
