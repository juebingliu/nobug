package com.dbpf.nobug.database.dto;

import com.dbpf.nobug.database.cache.GlobalDataBuf;
import com.dbpf.nobug.database.constants.SystemConstant;

import java.io.Serializable;
import java.util.Date;

public class AuthInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1485173196307824837L;

	private Integer id;

	private Integer userId;

	private Integer roleId;

	private Integer creater;

	private Date createTime;

	private String roleCode;

	private String roleName;

	private String systemTag;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the userId
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/**
	 * @return the roleId
	 */
	public Integer getRoleId() {
		return roleId;
	}

	/**
	 * @param roleId
	 *            the roleId to set
	 */
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
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
	 * @return the roleCode
	 */
	public String getRoleCode() {
		return roleCode;
	}

	/**
	 * @param roleCode
	 *            the roleCode to set
	 */
	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}

	/**
	 * @return the roleName
	 */
	public String getRoleName() {
		return roleName;
	}

	/**
	 * @param roleName
	 *            the roleName to set
	 */
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getSystemTag() {
		return systemTag;
	}

	public void setSystemTag(String systemTag) {
		this.systemTag = systemTag;
	}

	public String getSystemTagName() {
		if (this.getSystemTag() == null) {
			return null;
		}
		return GlobalDataBuf.getDictNameCache(SystemConstant.SYSTEM_TAG,
				this.getSystemTag());
	}

}
