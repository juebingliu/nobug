package com.dbpf.nobug.database.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 权限树
 * 
 * @author showersx
 *
 */
public class TreePermission implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4407931088199191894L;

	private Integer id;

	private String permissionName;

	private String permissionType;

	private String permissionTypeName;

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

	private List<TreePermission> children;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	/**
	 * @return the permissionName
	 */
	public String getPermissionName() {
		return permissionName;
	}

	/**
	 * @param permissionName
	 *            the permissionName to set
	 */
	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}

	/**
	 * @return the permissionType
	 */
	public String getPermissionType() {
		return permissionType;
	}

	/**
	 * @param permissionType
	 *            the permissionType to set
	 */
	public void setPermissionType(String permissionType) {
		this.permissionType = permissionType;
	}

	/**
	 * @return the permissionTypeName
	 */
	public String getPermissionTypeName() {
		return permissionTypeName;
	}

	/**
	 * @param permissionTypeName
	 *            the permissionTypeName to set
	 */
	public void setPermissionTypeName(String permissionTypeName) {
		this.permissionTypeName = permissionTypeName;
	}

	/**
	 * @return the permissionTag
	 */
	public String getPermissionTag() {
		return permissionTag;
	}

	/**
	 * @param permissionTag
	 *            the permissionTag to set
	 */
	public void setPermissionTag(String permissionTag) {
		this.permissionTag = permissionTag;
	}

	/**
	 * @return the permissionUri
	 */
	public String getPermissionUri() {
		return permissionUri;
	}

	/**
	 * @param permissionUri
	 *            the permissionUri to set
	 */
	public void setPermissionUri(String permissionUri) {
		this.permissionUri = permissionUri;
	}

	/**
	 * @return the permissionIcon
	 */
	public String getPermissionIcon() {
		return permissionIcon;
	}

	/**
	 * @param permissionIcon
	 *            the permissionIcon to set
	 */
	public void setPermissionIcon(String permissionIcon) {
		this.permissionIcon = permissionIcon;
	}

	/**
	 * @return the orderNum
	 */
	public Integer getOrderNum() {
		return orderNum;
	}

	/**
	 * @param orderNum
	 *            the orderNum to set
	 */
	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
	}

	/**
	 * @return the creater
	 */
	public Integer getCreater() {
		return creater;
	}

	/**
	 * @param creater
	 *            the creater to set
	 */
	public void setCreater(Integer creater) {
		this.creater = creater;
	}

	/**
	 * @return the createTime
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * @param createTime
	 *            the createTime to set
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * @return the operator
	 */
	public Integer getOperator() {
		return operator;
	}

	/**
	 * @param operator
	 *            the operator to set
	 */
	public void setOperator(Integer operator) {
		this.operator = operator;
	}

	/**
	 * @return the operateTime
	 */
	public Date getOperateTime() {
		return operateTime;
	}

	/**
	 * @param operateTime
	 *            the operateTime to set
	 */
	public void setOperateTime(Date operateTime) {
		this.operateTime = operateTime;
	}

	/**
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * @param remark
	 *            the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * @return the children
	 */
	public List<TreePermission> getChildren() {
		return children;
	}

	/**
	 * @param children
	 *            the children to set
	 */
	public void setChildren(List<TreePermission> children) {
		this.children = children;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
