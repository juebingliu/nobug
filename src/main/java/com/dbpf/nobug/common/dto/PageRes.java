package com.dbpf.nobug.common.dto;

import java.util.List;

public class PageRes {

	private List<?> rows;

	private Long total;

	private String sort;

	private String order;

	/**
	 * @return the total
	 */
	public Long getTotal() {
		return total;
	}

	/**
	 * @param total
	 *          the total to set
	 */
	public void setTotal(Long total) {
		this.total = total;
	}

	/**
	 * @return the sort
	 */
	public String getSort() {
		return sort;
	}

	/**
	 * @param sort
	 *          the sort to set
	 */
	public void setSort(String sort) {
		this.sort = sort;
	}

	/**
	 * @return the order
	 */
	public String getOrder() {
		return order;
	}

	/**
	 * @param order
	 *          the order to set
	 */
	public void setOrder(String order) {
		this.order = order;
	}

	/**
	 * @return the rows
	 */
	public List<?> getRows() {
		return rows;
	}

	/**
	 * @param rows
	 *          the rows to set
	 */
	public void setRows(List<?> rows) {
		this.rows = rows;
	}

}
