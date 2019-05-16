package com.dbpf.nobug.database.domain;

import com.dbpf.nobug.database.cache.GlobalDataBuf;
import com.dbpf.nobug.database.constants.PermissionConstant;

import java.util.Date;

public class Permission {
	private Integer id;

	private String permissionName;

	private String permissionType;

	private String permissionTag;

	private String permissionUri;

	private String permissionIcon;

	private Integer parentId;

	private Integer orderNum;

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

	public String getPermissionName() {
		return permissionName;
	}

	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}

	public String getPermissionType() {
		return permissionType;
	}

	public void setPermissionType(String permissionType) {
		this.permissionType = permissionType;
	}

	public String getPermissionTag() {
		return permissionTag;
	}

	public void setPermissionTag(String permissionTag) {
		this.permissionTag = permissionTag;
	}

	public String getPermissionUri() {
		return permissionUri;
	}

	public void setPermissionUri(String permissionUri) {
		this.permissionUri = permissionUri;
	}

	public String getPermissionIcon() {
		return permissionIcon;
	}

	public void setPermissionIcon(String permissionIcon) {
		this.permissionIcon = permissionIcon;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public Integer getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
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

	public String getPermissionTypeName() {
		if (this.getPermissionType() == null) {
			return null;
		}
		return GlobalDataBuf.getDictNameCache(
				PermissionConstant.PERMISSION_TYPE, this.getPermissionType());
	}
}