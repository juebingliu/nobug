package com.dbpf.nobug.common.enums;

public enum ErrorEnum {
	RES_0000("0000", "处理成功!", null), //
	RES_0001("0001", "处理失败!", null), //
	RES_0002("0002", "非法请求!", null), //
	RES_0003("0003", "用户名或密码错误!", null), //
	RES_0004("0004", "原始密码错误!", null), //
	RES_0005("0005", "用户名重复!", null), //
	RES_0006("0006", "已经存在数据!", null), //
	RES_0007("0007", "不存在数据!", null), //
	RES_0008("0008", "账户错误次数过多,暂时禁止登录!", null), //
	RES_0009("0009", "验证码错误!", null), //
	RES_0010("0010", "账户不存在!", null), //
	RES_0011("0011", "不可以踢出当前登录账户!", null), //
	RES_0012("0012", "kEY名重复!", null), //

	RES_1001("1001", "提交参数不合法!", null), //
	RES_1002("1002", "加解密失败!", null), //
	RES_1003("1003", "签名验证失败!", null), //
	RES_1004("1004", "非法报文!", null), //

	RES_2001("2001", "任务[%s]不存在", null), //
	RES_2002("2002", "设备组[%s]不存在", null), //
	RES_2003("2003", "设备[%s]不存在", null), //

	RES_9999("9999", "系统未知异常,请联系技术人员!", null);

	private ErrorEnum(String errorCode, String errorMsg, String mappingCode) {
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
		this.mappingCode = mappingCode;
	}

	private String errorCode;

	private String errorMsg;

	private String mappingCode;

	/**
	 * @return the errorCode
	 */
	public String getErrorCode() {
		return errorCode;
	}

	/**
	 * @param errorCode
	 *            the errorCode to set
	 */
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	/**
	 * @return the errorMsg
	 */
	public String getErrorMsg() {
		return errorMsg;
	}

	/**
	 * @param errorMsg
	 *            the errorMsg to set
	 */
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	/**
	 * @return the mappingCode
	 */
	public String getMappingCode() {
		return mappingCode;
	}

	/**
	 * @param mappingCode
	 *            the mappingCode to set
	 */
	public void setMappingCode(String mappingCode) {
		this.mappingCode = mappingCode;
	}

}
