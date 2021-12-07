package subway;

public class Constants {
	public static final String HASH_TAG = "\n##";
	public static final String MESSAGE_MAIN_MENU = HASH_TAG + " 메인 화면\n1. 역 관리\n2. 노선 관리\n"
		+ "3. 구간 관리\n4. 지하철 노선도 출력\nQ. 종료\n";
	public static final String MESSAGE_MENU_SELECT = HASH_TAG + " 원하는 기능을 선택하세요.";
	public static final String MENU_STATION = "1";
	public static final String MENU_LINE = "2";
	public static final String MENU_SECTION = "3";
	public static final String MENU_LIST = "4";
	public static final String MENU_QUIT = "Q";
	public static final String INFO = "[INFO]";
	public static final String MESSAGE_STATION_MENU = HASH_TAG + "  역 관리 화면\n"
		+ "1. 역 등록\n"
		+ "2. 역 삭제\n"
		+ "3. 역 조회\n"
		+ "B. 돌아가기\n";
	public static final String MESSAGE_ADD_STATION = HASH_TAG + " 등록할 역 이름을 입력하세요.";
	public static final String INFO_ADD_STATION_SUCCESS = INFO + " 지하철 역이 등록되었습니다.";
	public static final String MESSAGE_DELETE_STATION = HASH_TAG + " 삭제할 역 이름을 입력하세요.";
	public static final String INFO_DELETE_STATION = INFO + " 지하철 역이 삭제되었습니다.";
	public static final String MESSAGE_LINE_MENU = HASH_TAG + " 노선 관리 화면\n"
		+ "1. 노선 등록\n"
		+ "2. 노선 삭제\n"
		+ "3. 노선 조회\n"
		+ "B. 돌아가기\n";
	public static final String MESSAGE_SECTION_MENU = HASH_TAG + " 구간 관리 화면\n"
		+ "1. 구간 등록\n"
		+ "2. 구간 삭제\n"
		+ "B. 돌아가기\n";
	public static final String MESSAGE_LIST_FIRST = HASH_TAG + " 지하철 노선도";

}
