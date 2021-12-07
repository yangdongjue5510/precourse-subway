package subway.service;

import subway.domain.Line;
import subway.domain.LineRepository;
import subway.domain.Station;
import subway.domain.StationRepository;
import subway.view.ErrorView;

public class LineService {
	public static boolean isFirstOrEnd(Station station) {
		boolean isFirst = LineRepository.lines().stream()
			.anyMatch(line -> line.getStations().get(0) == station);
		boolean isLast = LineRepository.lines().stream()
			.anyMatch(line -> line.getStations().indexOf(station) == line.getStations().size()-1);
		return isFirst || isLast;
	}

	public static void addLine(String name, Station start, Station end) {
		Line line = new Line(name);
		line.getStations().add(start);
		line.getStations().add(end);
	}
}
