package com.visualkhh.common.code;

public enum Code {
	M00001(""),
	M00002(""),
	M00003(""),
	M00004(""),
	M00005(""),
	M00006(""),
	M00007(""),
	M00008(""),
	M00009(""),
	M00011(""),
	M00012(""),
	M00013(""),

	/** 성공*/
	R00000("word.success"),

	/** 공통 필수 데이터가 존재하지 않습니다.*/
	E10001("msg.error.no.data"), //

	/** 필수 데이터가 존재하지 않습니다.*/
	E10002("msg.error.required.data"),

	/** 데이터가 존재하지 않습니다.*/
	E10003("msg.error.exist.data"),

	/** 데이터가 올바르지 않습니다.*/
	E10004("msg.error.invalid.data"),

	/** 등록되지 않은 디바이스 입니다.*/
	E10101("msg.error.unreg.device"),

	/** 등록되지 않은 사용자 입니다.*/
	E10102("msg.error.unreg.user"),

	/** 사용 중지 된 사용자입니다.*/
	E10103("msg.error.disabled.user"),

	/** 인증되지 않은 사용자 입니다.*/
	E10104("msg.error.unauth.user"),

	/** 공통 헤더가 존재하지 않습니다.*/
	E20001("msg.error.common.header.exist"),

	/** 공통 헤더 파싱 실패*/
	E20002("msg.error.common.header.fail"),

	/** DB 오류*/
	E30000("msg.error.db"),

	/** DB 처리 중 오류가 발생했습니다. */
	E30001("msg.error.dbprocessing"),

	/** 알수 없음 오류*/
	E99999("msg.error.unknown");

	private final String value;
	Code(String value) {
		this.value = value;
	}
	public String value() {
		return this.value;
	}

}
