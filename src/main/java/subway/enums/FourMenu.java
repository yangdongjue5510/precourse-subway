package subway.enums;

public enum FourMenu {
	ADD("1"),
	DELETE("2"),
	SHOW("3"),
	BACK("B");

	private String menuDigit;

	FourMenu(String menuNum) {
		this.menuDigit = menuNum;
	}

	public String getMenuDigit() {
		return menuDigit;
	}
}
