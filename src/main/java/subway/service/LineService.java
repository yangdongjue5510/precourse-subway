package subway.service;

import subway.domain.LineRepository;
import subway.domain.Station;

public class LineService {

	public static boolean isFirstOrEnd(Station station) {
		boolean isFirst = LineRepository.lines().stream()
			.anyMatch(line -> line.getStations().get(0) == station);
		boolean isLast = LineRepository.lines().stream()
			.anyMatch(line -> line.getStations().indexOf(station) == line.getStations().size()-1);
		return isFirst || isLast;
	}
}
