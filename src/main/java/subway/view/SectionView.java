package subway.view;

public class SectionView {
	public static void addSectionView() {
		System.out.println("삽입할 구간을 입력하라");
	}

	public static void addSectionIndexView() {
		System.out.println("순서를 입력하세요.");
	}

	public static void addSectionSuccessView() {
		System.out.println("구간이 등록되었음.");
	}

	public static void deleteSectionView() {
		System.out.println("삭제할 구간 노선 입력");
	}

	public static void deleteSectionStationView() {
		System.out.println("구간에서 삭제할 역 이름 입력");
	}
}
