package cn.px.bean;

import java.io.Serializable;

/**
 * 实体对象User
 * 
 * @author Administrator
 * 
 */
public class User implements Serializable {
	private Integer id;
	private String userName;
	private String password;

	// setter,getter
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
