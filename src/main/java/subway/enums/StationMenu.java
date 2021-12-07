package subway.enums;

public enum StationMenu {
	ADD("1"),
	DELETE("2"),
	SHOW("3"),
	BACK("B");

	private String menuDigit;

	StationMenu(String menuNum) {
		this.menuDigit = menuNum;
	}

	public String getMenuDigit() {
		return menuDigit;
	}
}
