package subway.Controller;

import static subway.Constants.*;

import java.util.Scanner;

import subway.validChecker.MainValidChecker;
import subway.view.CommonView;

public class MainController {
	public static void startMain(Scanner scanner) {
		CommonView.displayMenu(MESSAGE_MAIN_MENU);
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
		if (menu.equals(MENU_STATION)) {
			StationController.startStation(scanner);
		}
	}

}
