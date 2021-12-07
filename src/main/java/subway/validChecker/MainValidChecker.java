package subway.validChecker;

import static subway.Constants.*;

import java.util.Arrays;

import subway.exception.NotInMenuException;
import subway.view.ErrorView;

public class MainValidChecker {
	public static boolean mainMenuExceptionCheck(String inputLine) {
		try {
			isValidMenuInput(inputLine);
			return true;
		} catch (IllegalArgumentException exception) {
			ErrorView.menuInputError();
			return false;
		}
	}

	private static void isValidMenuInput(String inputLine) {
		if (!isInMenu(inputLine)) {
			NotInMenuException.throwException();
		}
	}

	private static boolean isInMenu(String inputLine) {
		String[] menuArray = {MENU_STATION, MENU_LINE, MENU_SECTION, MENU_LIST, MENU_QUIT};
		return Arrays.stream(menuArray).anyMatch(menu -> menu.equals(inputLine));
	}
}
