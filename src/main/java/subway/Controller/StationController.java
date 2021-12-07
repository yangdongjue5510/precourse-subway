package subway.Controller;

import static subway.Constants.*;

import java.util.Arrays;
import java.util.Scanner;

import subway.enums.StationMenu;
import subway.service.StationService;
import subway.validChecker.StationValidChecker;
import subway.view.CommonView;
import subway.view.ErrorView;
import subway.view.StationView;

public class StationController {
	public static void startStation(Scanner scanner) {
		CommonView.displayMenu(MESSAGE_STATION_MENU);
		findMenu(inputStationMenu(scanner), scanner);
	}

	private static String inputStationMenu(Scanner scanner) {
		return scanner.nextLine();
	}

	private static void findMenu(String inputLine, Scanner scanner) {
		if (inputLine.equals(StationMenu.ADD.getMenuDigit())) {
			addStation(scanner);
		}
	}

	private static void addStation(Scanner scanner) {
		StationView.addStationView();
		boolean addTrial = StationService.addStation(inputStationName(scanner));
		if (!addTrial) {
			ErrorView.addStationError();
			addStation(scanner);
		} else if (addTrial) {
			StationView.addStationSuccess();
			MainController.startMain(scanner);
		}
	}

	private static String inputStationName(Scanner scanner) {
		String inputLine;
		do {
			inputLine = scanner.nextLine();
		} while(!StationValidChecker.stationNameLengthCheck(inputLine));
		return inputLine;
	}
}
