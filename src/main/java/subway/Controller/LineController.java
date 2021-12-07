package subway.Controller;

import static subway.Constants.*;

import java.util.Scanner;

import subway.view.CommonView;

public class LineController {
	private static String[] lineMenus = {};
	public static void startLine(Scanner scanner) {
		CommonView.displayMenu(MESSAGE_LINE_MENU);
	}
}
