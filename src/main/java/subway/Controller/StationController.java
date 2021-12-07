package subway.Controller;

import static subway.Constants.*;

import java.util.List;
import java.util.Scanner;

import subway.domain.Station;
import subway.enums.MenuEnum;
import subway.service.StationService;
import subway.validChecker.MenuValidChecker;
import subway.validChecker.StationValidChecker;
import subway.view.CommonView;
import subway.view.ErrorView;
import subway.view.ListView;
import subway.view.StationView;

public class StationController {
	public static void startStation(Scanner scanner) {
		CommonView.displayMenu(MESSAGE_STATION_MENU);
		findMenu(inputMenu(scanner), scanner);
	}

	private static String inputMenu(Scanner scanner) {
		String inputLine;
		do {
			inputLine = scanner.nextLine();
		} while(!MenuValidChecker.fourMenuExceptionCheck(inputLine));
		return inputLine;
	}

	private static void findMenu(String inputLine, Scanner scanner) {
		if (inputLine.equals(MenuEnum.ADD.getMenuDigit())) {
			addStation(scanner);
		} else if (inputLine.equals(MenuEnum.DELETE.getMenuDigit())) {
			deleteStation(scanner);
		} else if (inputLine.equals(MenuEnum.SHOW.getMenuDigit())) {
			showStations(scanner);
		} else if (inputLine.equals(MenuEnum.BACK.getMenuDigit())) {
			MainController.startMain(scanner);
		}
	}

	private static void showStations(Scanner scanner) {
		List<Station> allStations = StationService.getAllStations();
		if (allStations == null) {

		} else if (allStations != null) {
			ListView.displayListView();
			allStations.stream().forEach(station -> StationView.showStation(station));
			MainController.startMain(scanner);
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

	private static void deleteStation(Scanner scanner) {
		StationView.deleteStationView();
		boolean deleteTrial = StationService.deleteStation(inputStationName(scanner));
		if (!deleteTrial) {
			ErrorView.deleteStationError();
			deleteStation(scanner);
		} else if (deleteTrial) {
			StationView.deleteStationSuccess();
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
