package cn.px.dao;

import java.sql.ResultSet;
import java.util.Date;

import cn.px.bean.Stu;

public class MyReturnResult implements ReturnResult{

	@Override
	public Object returnObj(ResultSet rs)  {
		Stu stu= null;
		try{
			int id = rs.getInt("id");
			String username =rs.getString("usename");
			String password = rs.getString("password");
			Date birthday = rs.getDate("birthday");
			stu = new Stu(id,username,password,birthday);
		
		}catch(Exception e){
			 e.printStackTrace();
		}
		       return stu;
	}

}
