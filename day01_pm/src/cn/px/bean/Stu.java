package cn.px.bean;

import java.util.Date;

public class Stu {
     int id;
     String usename;
     String password;
     Date birthday;  //java.util.Date;
     //构造器
     Stu(){
    	 
     }
     //有参
     public Stu(int id, String usename, String password, Date birthday) {
		super();
		this.id = id;
		this.usename = usename;
		this.password = password;
		this.birthday = birthday;
	}




	@Override
	public String toString() {
		return "Stu [id=" + id + ", usename=" + usename + ", password=" + password + ", birthday=" + birthday + "]";
	}
	//getter ,setter  
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsename() {
		return usename;
	}
	public void setUsename(String usename) {
		this.usename = usename;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
     
     
     
}
