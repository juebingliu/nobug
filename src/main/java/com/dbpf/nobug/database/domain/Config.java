package com.dbpf.nobug.database.domain;

import com.dbpf.nobug.database.cache.GlobalDataBuf;
import com.dbpf.nobug.database.constants.ConfigConstant;

import java.util.Date;

public class Config {
	private Integer id;

	private String configStatus;

	private String configKey;

	private String configValue;

	private Integer creater;

	private Date createTime;

	private Integer operator;

	private Date operateTime;

	private String remark;

	private Integer version;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getConfigStatus() {
		return configStatus;
	}

	public void setConfigStatus(String configStatus) {
		this.configStatus = configStatus;
	}

	public String getConfigKey() {
		return configKey;
	}

	public void setConfigKey(String configKey) {
		this.configKey = configKey;
	}

	public String getConfigValue() {
		return configValue;
	}

	public void setConfigValue(String configValue) {
		this.configValue = configValue;
	}

	public Integer getCreater() {
		return creater;
	}

	public void setCreater(Integer creater) {
		this.creater = creater;
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

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getConfigStatusName() {
		if (this.getConfigStatus() == null) {
			return null;
		}
		return GlobalDataBuf.getDictNameCache(ConfigConstant.CONFIG_STATUS,
				this.getConfigStatus());
	}
}