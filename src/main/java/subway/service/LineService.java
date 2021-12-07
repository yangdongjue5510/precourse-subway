package subway.service;

import subway.domain.Line;
import subway.domain.LineRepository;
import subway.domain.Station;


public class LineService {
	public static boolean isFirstOrEnd(Station station) {
		boolean isFirst = LineRepository.getFirstStationNamesInLines().stream()
			.anyMatch(name -> name.equals(station.getName()));
		boolean isLast = LineRepository.getLastStationNamesInLines().stream()
			.anyMatch(name -> name.equals(station.getName()));
		return isFirst || isLast;
	}

	public static void addLine(String name, Station start, Station end) {
		Line line = new Line(name);
		line.getStations().add(start);
		line.getStations().add(end);
	}

	public static void deleteLine(String name) {
		LineRepository.deleteLineByName(name);
	}
}
