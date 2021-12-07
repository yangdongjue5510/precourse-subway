package subway.view;

import static subway.Constants.*;

public class CommonView {
	public static void displayMenu(String menu) {
		System.out.println(menu);
		printMenuSelectView();
	}
	private static void printMenuSelectView() {
		System.out.println(MESSAGE_MENU_SELECT);
	}
}
