package com.dbpf.nobug.database.dto;

import java.io.Serializable;

public class DictCache implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4143263495057192097L;
	private String type;
	private String code;
	private String name;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
