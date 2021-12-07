package subway.view;

import static subway.Constants.*;

public class MainView {
	public static void displayMainView() {
		printMainMenuView();
		CommonView.printMenuSelectView();
	}

	private static void printMainMenuView() {
		System.out.println(MESSAGE_MAIN_MENU);
	}

}
