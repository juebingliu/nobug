package com.dbpf.nobug.common.dto;

import java.io.Serializable;

public class DataMsg implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2745578957588414443L;

	private String res_code;
	private String res_msg;
	private Object res_data;

	public String getRes_code() {
		return res_code;
	}

	public void setRes_code(String res_code) {
		this.res_code = res_code;
	}

	public String getRes_msg() {
		return res_msg;
	}

	public void setRes_msg(String res_msg) {
		this.res_msg = res_msg;
	}

	public Object getRes_data() {
		return res_data;
	}

	public void setRes_data(Object res_data) {
		this.res_data = res_data;
	}

	@Override
	public String toString() {
		return "DataMsg [res_code=" + res_code + ", res_msg=" + res_msg + ", res_data=" + res_data + "]";
	}
}
