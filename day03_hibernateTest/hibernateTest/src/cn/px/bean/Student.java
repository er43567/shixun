package cn.px.bean;

import java.io.Serializable;

public class Student implements Serializable {
	
    private String id;
    private String studentName;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
     
	  
	
}
