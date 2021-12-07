package subway.Controller;

import java.util.Scanner;

import subway.validChecker.MainValidChecker;
import subway.view.ErrorView;
import subway.view.MainView;

public class MainController {
	public static void startMain() {
		MainView.displayMainView();
	}

	public static void inputMain(Scanner scanner) {
		String inputLine;
		do {
			inputLine = scanner.nextLine();
		} while (!MainValidChecker.mainMenuExceptionCheck(inputLine));
	}

}
