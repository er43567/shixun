package cn.px.dao;

import java.sql.Connection;
import java.sql.ResultSet;

import java.sql.PreparedStatement;

import cn.px.jdbc.utils.JdbcUtils;

public class BaseDao {
  
	
	public Object queryObjectById(String tableName,int id,ReturnResult result){
		Object obj = null;
		try{
			Connection conn =JdbcUtils.getConnection();
			String sql = "select * from "+ tableName +" where id =?";
		    PreparedStatement pstmt  = conn.prepareStatement(sql);
			pstmt.setInt(1,id);
			ResultSet rs  = pstmt.executeQuery();
			//策略设计模式
			if(rs.next()){
			   return result.returnObj(rs);
			}
		}catch(Exception e){
			throw new RuntimeException();
		}
		     return null;
	}  




}

