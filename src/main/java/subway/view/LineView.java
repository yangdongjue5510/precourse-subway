package subway.view;

import static subway.Constants.*;

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
}
