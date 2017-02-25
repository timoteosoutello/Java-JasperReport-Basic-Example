package com.github.constants;

/**
 * Constants
 * @author Timóteo Soutello
 *
 */
public enum ReportEnum {
	REPORT_GENERATE_DIR("C:\\reports\\result\\"),
	REPORT_SOURCE_DIR("C:\\reports\\source\\"),
	REPORT_USER_NAME("users.jasper");
	private String value;

	ReportEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}
}
