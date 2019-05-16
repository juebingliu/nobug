package com.dbpf.nobug.common.dto;

import java.io.Serializable;

public class OnlineSession {
	/**
	 * 
	 */
	private Serializable id;
	private String username;
	private String host;
	private String lastAccessTime;

	/**
	 * @return the id
	 */
	public Serializable getId() {
		return id;
	}

	/**
	 * @param id
	 *          the id to set
	 */
	public void setId(Serializable id) {
		this.id = id;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username
	 *          the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the host
	 */
	public String getHost() {
		return host;
	}

	/**
	 * @param host
	 *          the host to set
	 */
	public void setHost(String host) {
		this.host = host;
	}

	/**
	 * @return the lastAccessTime
	 */
	public String getLastAccessTime() {
		return lastAccessTime;
	}

	/**
	 * @param lastAccessTime
	 *          the lastAccessTime to set
	 */
	public void setLastAccessTime(String lastAccessTime) {
		this.lastAccessTime = lastAccessTime;
	}

}
