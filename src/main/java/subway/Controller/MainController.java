package subway.Controller;

import static subway.Constants.*;

import java.util.Arrays;
import java.util.Scanner;

import subway.validChecker.MainValidChecker;
import subway.view.MainView;

public class MainController {
	public static void startMain(Scanner scanner) {
		MainView.displayMainView();
		String menu = inputMain(scanner);
		findMenu(menu, scanner);
	}

	private static String inputMain(Scanner scanner) {
		String inputLine;
		do {
			inputLine = scanner.nextLine();
		} while (!MainValidChecker.mainMenuExceptionCheck(inputLine));
		return inputLine;
	}

	private static void findMenu(String menu, Scanner scanner) {
		String[] menus = {MENU_STATION, MENU_LINE, MENU_SECTION, MENU_LIST};
		if (menu.equals(MENU_STATION)) {
			StationController.startStation(scanner);
		}
	}

}
