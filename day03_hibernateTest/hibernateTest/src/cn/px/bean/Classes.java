package cn.px.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
// һ�Զ��ϵ (����)
public class Classes implements Serializable{
    private String id;
    private String className; //�༶����
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
