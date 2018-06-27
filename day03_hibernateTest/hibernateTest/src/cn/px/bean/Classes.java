package cn.px.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
// 一对多关系 (單向)
public class Classes implements Serializable{
    private String id;
    private String className; //班级名称
    private List<Student> students = new ArrayList<Student>();
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
    
    
}
