package subway.view;

import static subway.Constants.*;

public class MainView {
	public static void displayMainView() {
		printMainMenuView();
		printMainSelectView();
	}

	private static void printMainMenuView() {
		System.out.println(MESSAGE_MAIN_MENU);
	}

	private static void printMainSelectView() {
		System.out.println(MESSAGE_MAIN_SELECT);
	}
}
