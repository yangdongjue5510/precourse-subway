package subway.enums;

public enum MenuEnum {
	ADD("1"),
	DELETE("2"),
	SHOW("3"),
	BACK("B");

	private String menuDigit;

	MenuEnum(String menuNum) {
		this.menuDigit = menuNum;
	}

	public String getMenuDigit() {
		return menuDigit;
	}
}
