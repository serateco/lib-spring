package com.khh.project.operator.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.google.gson.annotations.Expose;
import com.khh.DefaultVO;

@Entity
@Table(name = "TB_RIGHT_GROUP")
public class RightGroupVO extends DefaultVO {
	private static final long serialVersionUID = 1L;
	@Expose @Column(name="SORT")	Integer sort	;//	NUMBER
	@Expose @Column(name="ICON")	String icon	;//	VARCHAR2
	@Expose @Column(name="CODE")	String code	;//????	VARCHAR2
	@Expose @Column(name="NAME")	String name	;//???	VARCHAR2
	@Expose @Id @Column(name="GROUP_ID")	Integer group_id	;//??ID	NUMBER
	public Integer getSort() {
		return sort;
	}
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getGroup_id() {
		return group_id;
	}
	public void setGroup_id(Integer group_id) {
		this.group_id = group_id;
	}
	
	
}
