package cn.px.dao;

public class BaseDaoTest { 
	
	 public static void main(String[] args) {
		  BaseDao dao = new BaseDao();
		  ReturnResult mr = new MyReturnResult();
		  Object obj = dao.queryObjectById("t_stu",1,mr);
	      System.out.println(obj);
	}

}
