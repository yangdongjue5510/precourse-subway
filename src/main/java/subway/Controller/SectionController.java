package subway.Controller;

import static subway.Constants.*;

import java.util.Scanner;

import subway.view.CommonView;

public class SectionController {
	public static void startSection(Scanner scanner) {
		CommonView.displayMenu(MESSAGE_SECTION_MENU);
	}
}
