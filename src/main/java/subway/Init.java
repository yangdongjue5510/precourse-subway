package subway;

import java.util.List;

import subway.domain.Line;
import subway.domain.LineRepository;
import subway.domain.Station;
import subway.domain.StationRepository;

public class Init {
	public static void init() {
		StationRepository.addStation(new Station("교대역"));
		StationRepository.addStation(new Station("강남역"));
		StationRepository.addStation(new Station("역삼역"));
		StationRepository.addStation(new Station("남부터미널역"));
		StationRepository.addStation(new Station("양재역"));
		StationRepository.addStation(new Station("양재시민의숲역"));
		StationRepository.addStation(new Station("매봉역"));

		LineRepository.addLine(new Line("2호선"));
		LineRepository.addLine(new Line("3호선"));
		LineRepository.addLine(new Line("신분당선"));

		addStation(LineRepository.lines().get(0), "교대역");
		addStation(LineRepository.lines().get(0), "강남역");
		addStation(LineRepository.lines().get(0), "역삼역");

		addStation(LineRepository.lines().get(1), "교대역");
		addStation(LineRepository.lines().get(1), "남부터미널역");
		addStation(LineRepository.lines().get(1), "양재역");
		addStation(LineRepository.lines().get(1), "매봉역");

		addStation(LineRepository.lines().get(2), "강남역");
		addStation(LineRepository.lines().get(2), "양재역");
		addStation(LineRepository.lines().get(2), "양재시민의숲역");
	}

	private static void addStation(Line line, String name) {
		line.getStations().add(StationRepository.findStationById(name));
	}
}
