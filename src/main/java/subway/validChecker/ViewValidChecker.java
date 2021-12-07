package subway.validChecker;

import java.util.NoSuchElementException;

import subway.domain.LineRepository;
import subway.view.ErrorView;
import subway.view.LineView;

public class ViewValidChecker {
	public static boolean checkAddLineName(String inputLine) {
		try {
			LineRepository.findLineByName(inputLine);
			ErrorView.lineError();
			return false;
		} catch (NoSuchElementException exception) {
			return true;
		}
	}
}
