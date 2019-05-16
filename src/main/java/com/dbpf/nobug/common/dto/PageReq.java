package com.dbpf.nobug.common.dto;

public class PageReq {

	protected Integer start;

	protected Integer size;

	protected Integer page;

	protected Integer rows;

	/**
	 * @return the start
	 */
	public Integer getStart() {
		return start;
	}

	/**
	 * @param start
	 *          the start to set
	 */
	public void setStart(Integer start) {
		this.start = start;
	}

	/**
	 * @return the size
	 */
	public Integer getSize() {
		return size;
	}

	/**
	 * @param size
	 *          the size to set
	 */
	public void setSize(Integer size) {
		this.size = size;
	}

	/**
	 * @return the page
	 */
	public Integer getPage() {
		return page;
	}

	/**
	 * @param page
	 *          the page to set
	 */
	public void setPage(Integer page) {
		this.page = page;
	}

	/**
	 * @return the rows
	 */
	public Integer getRows() {
		return rows;
	}

	/**
	 * @param rows
	 *          the rows to set
	 */
	public void setRows(Integer rows) {
		this.rows = rows;
	}

}
