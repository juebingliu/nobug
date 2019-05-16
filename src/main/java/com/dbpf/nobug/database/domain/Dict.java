package com.dbpf.nobug.database.domain;

import com.dbpf.nobug.database.cache.GlobalDataBuf;
import com.dbpf.nobug.database.constants.DictConstant;

import java.util.Date;

public class Dict {
	private Integer id;

	private String dictType;

	private String dictTypeName;

	private String dictName;

	private String dictCode;

	private String dictStatus;

	private Integer orderNum;

	private Integer createrTime;

	private Date createTime;

	private Integer operator;

	private Date operateTime;

	private Integer version;

	private String remark;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDictType() {
		return dictType;
	}

	public void setDictType(String dictType) {
		this.dictType = dictType;
	}

	public String getDictTypeName() {
		return dictTypeName;
	}

	public void setDictTypeName(String dictTypeName) {
		this.dictTypeName = dictTypeName;
	}

	public String getDictName() {
		return dictName;
	}

	public void setDictName(String dictName) {
		this.dictName = dictName;
	}

	public String getDictCode() {
		return dictCode;
	}

	public void setDictCode(String dictCode) {
		this.dictCode = dictCode;
	}

	public String getDictStatus() {
		return dictStatus;
	}

	public void setDictStatus(String dictStatus) {
		this.dictStatus = dictStatus;
	}

	public Integer getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
	}

	public Integer getCreaterTime() {
		return createrTime;
	}

	public void setCreaterTime(Integer createrTime) {
		this.createrTime = createrTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getOperator() {
		return operator;
	}

	public void setOperator(Integer operator) {
		this.operator = operator;
	}

	public Date getOperateTime() {
		return operateTime;
	}

	public void setOperateTime(Date operateTime) {
		this.operateTime = operateTime;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getDictStatusName() {
		if (this.getDictStatus() == null) {
			return null;
		}
		return GlobalDataBuf.getDictNameCache(DictConstant.DICT_STATUS,
				this.getDictStatus());
	}
}