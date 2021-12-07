package subway.Controller;

import static subway.Constants.*;

import java.util.Scanner;

import com.sun.tools.javadoc.Main;

import subway.domain.Line;
import subway.domain.LineRepository;
import subway.domain.Station;
import subway.domain.StationRepository;
import subway.enums.MenuEnum;
import subway.service.StationService;
import subway.validChecker.MenuValidChecker;
import subway.view.CommonView;
import subway.view.SectionView;
import subway.view.StationView;

public class SectionController {
	public static void startSection(Scanner scanner) {
		CommonView.displayMenu(MESSAGE_SECTION_MENU);
		checkMenu(inputMenu(scanner), scanner);
	}

	private static String inputMenu(Scanner scanner) {
		String inputLine;
		do {
			inputLine = scanner.nextLine();
		} while (!MenuValidChecker.threeMenuValidCheck(inputLine));
		return inputLine;
	}

	private static void checkMenu(String menu, Scanner scanner) {
		if (menu.equals(MenuEnum.ADD.getMenuDigit())) {
			addSection(scanner);
		} else if (menu.equals(MenuEnum.DELETE.getMenuDigit())) {
			deleteSection(scanner);
		} else if (menu.equals(MenuEnum.BACK.getMenuDigit())) {
			MainController.startMain(scanner);
		}
	}

	private static void deleteSection(Scanner scanner) {
		SectionView.deleteSectionView();
		Line line = inputLine(scanner);
		SectionView.deleteSectionStationView();
		Station station = inputStation(scanner);
		LineRepository.deleteStationInLine(line, station);
		MainController.startMain(scanner);
	}

	private static void addSection(Scanner scanner) {
		SectionView.addSectionView();
		Line line = inputLine(scanner);
		StationView.addStationToLine();
		Station station = inputStation(scanner);
		SectionView.addSectionIndexView();
		int index = inputIndex(scanner);
		LineRepository.addSectioninLine(line, station, index);
		SectionView.addSectionSuccessView();
		MainController.startMain(scanner);
	}

	private static Line inputLine(Scanner scanner) {
		SectionView.addSectionView();
		return LineRepository.findLineByName(scanner.nextLine());
	}

	private static Station inputStation(Scanner scanner) {
		StationView.addStationToLine();
		return StationRepository.findStationById(scanner.nextLine());
	}

	private static int inputIndex(Scanner scanner) {
		SectionView.addSectionIndexView();
		return scanner.nextInt();
	}
}
