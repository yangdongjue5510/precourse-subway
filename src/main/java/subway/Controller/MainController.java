package subway.Controller;

import subway.validChecker.MainValidChecker;
import subway.view.ErrorView;
import subway.view.MainView;

public class MainController {
	public static void startMain() {
		MainView.displayMainView();
	}

	public static void inputMain(String inputLine) {
		if (!MainValidChecker.mainMenuExceptionCheck(inputLine)) {
			ErrorView.mainMenuInputError();
		}
	}

}
