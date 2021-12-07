package subway.Controller;

import static subway.Constants.*;

import java.util.Scanner;

import subway.domain.Line;
import subway.domain.LineRepository;
import subway.domain.Station;
import subway.domain.StationRepository;
import subway.enums.FourMenu;
import subway.service.LineService;
import subway.validChecker.MenuValidChecker;
import subway.validChecker.StationValidChecker;
import subway.validChecker.ViewValidChecker;
import subway.view.CommonView;
import subway.view.LineView;

public class LineController {
	public static void startLine(Scanner scanner) {
		CommonView.displayMenu(MESSAGE_LINE_MENU);
		findMenu(inputMenu(scanner), scanner);
	}

	private static String inputMenu(Scanner scanner) {
		String inputLine;
		do {
			inputLine = scanner.nextLine();
		} while (!MenuValidChecker.fourMenuExceptionCheck(inputLine));
		return inputLine;
	}

	private static void findMenu(String inputLine, Scanner scanner) {
		if (inputLine.equals(FourMenu.ADD.getMenuDigit())) {
			addLine(scanner);
		} else if (inputLine.equals(FourMenu.DELETE.getMenuDigit())) {
			deleteLine(scanner);
		} else if (inputLine.equals(FourMenu.SHOW.getMenuDigit())) {
			showLine(scanner);
		} else if (inputLine.equals(FourMenu.BACK.getMenuDigit())) {
			MainController.startMain(scanner);
		}
	}

	private static void showLine(Scanner scanner) {
		LineView.showLines(LineRepository.lines());
		MainController.startMain(scanner);
	}

	private static void deleteLine(Scanner scanner) {
		LineView.deleteLineView();
		LineService.deleteLine(scanner.nextLine());
		LineView.deleteLineSuccess();
		MainController.startMain(scanner);
	}

	private static void addLine(Scanner scanner) {
		LineView.addLineView();
		String lineName = inputLineName(scanner);
		LineView.addLineStartStationView();
		Station startStation = findStationByName(scanner);
		LineView.addLineEndStationView();
		Station endStation = findStationByName(scanner);
		LineService.addLine(lineName, startStation, endStation);
		LineView.addLineSuccess();
		MainController.startMain(scanner);
	}

	private static String inputLineName(Scanner scanner) {
		String inputLine;
		do {
			inputLine = scanner.nextLine();
		} while (!ViewValidChecker.checkAddLineName(inputLine));
		return inputLine;
	}

	private static Station findStationByName(Scanner scanner) {
		String inputLine;
		do {
			inputLine = scanner.nextLine();
		} while (!StationValidChecker.stationExist(inputLine));
		return StationRepository.findStationById(inputLine);
	}

}
