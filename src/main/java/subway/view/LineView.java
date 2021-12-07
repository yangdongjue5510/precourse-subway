package subway.view;

import static subway.Constants.*;

import java.util.List;

import subway.domain.Line;

public class LineView {
	public static void addLineView() {
		System.out.println("호선 이름을 입력해주세요.");
	}
	public static void addLineSuccess() {
		System.out.println(INFO_ADD_LINE_SUCCESS);
	}

	public static void addLineStartStationView() {
		System.out.println("시작할 역 이름을 말하라.");
	}

	public static void addLineEndStationView() {
		System.out.println("종점 역 이름을 말하라.");
	}

	public static void deleteLineView() {
		System.out.println("삭제할 호선 이름 입력");
	}

	public static void deleteLineSuccess() {
		System.out.println("호선을 삭제했음.");
	}

	public static void showLines(List<Line> lines) {
		System.out.println("노선 목록");
		lines.stream().forEach(line -> showLine(line));
	}

	public static void showLine(Line line) {
		System.out.println("[INFO] " + line.getName());
	}
}
