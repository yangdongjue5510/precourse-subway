package subway.validChecker;

import java.util.Arrays;

import subway.view.ErrorView;

public class MenuValidChecker {

	public static boolean fourMenuExceptionCheck(String inputLine) {
		String[] menus = {"1", "2", "3", "B"};
		try {
			fourMenuValidCheck(inputLine, menus);
			return true;
		} catch (IllegalArgumentException exception) {
			ErrorView.menuInputError();
			return false;
		}
	}

	private static void fourMenuValidCheck(String inputLine, String[] menus) {
		if (!containsMenu(inputLine, menus)) {
			throw new IllegalArgumentException();
		}
	}

	private static boolean containsMenu(String inputLine, String[] menus) {
		return Arrays.stream(menus).anyMatch(menu -> menu.equals(inputLine));
	}
}
