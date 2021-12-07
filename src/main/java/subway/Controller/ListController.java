package subway.Controller;

import java.util.Scanner;

import subway.view.ListView;

public class ListController {
	public static void startList(Scanner scanner) {
		ListView.displayListView();
		MainController.startMain(scanner);
	}
}
