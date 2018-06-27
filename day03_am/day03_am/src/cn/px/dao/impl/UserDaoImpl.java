package cn.px.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import cn.px.bean.User;
import cn.px.dao.UserDao;
import cn.px.utils.JdbcUtils;

public class UserDaoImpl implements UserDao {

	@Override
	public boolean isExistUser(User user) {
		Connection connection =null; 
		PreparedStatement pstmt = null;
		ResultSet rs =null;
		try{
			connection = JdbcUtils.getConnection();
			String sql ="select * from t_stu where usename=? and password =?";
			pstmt = connection.prepareStatement(sql);
			pstmt.setString(1,user.getUserName());
			pstmt.setString(2,user.getPassword());
			rs = pstmt.executeQuery();
			if(rs.next()){
				return true; 
			}else{
				return false;
			}
		}catch(Exception e){
			throw new RuntimeException(e);
		}finally{
			JdbcUtils.close(rs, pstmt, connection);
		}
		
	}

	@Override
	public List<User> queryAllUser() {
		Connection connection =null; 
		PreparedStatement pstmt = null;
		ResultSet rs =null;
		List<User> users = null;
		try{
			users = new ArrayList<User>();
			connection = JdbcUtils.getConnection();
			String sql ="select * from t_stu ";
			pstmt = connection.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()){
				User user = new User();
				user.setUserName(rs.getString("usename"));
				user.setPassword(rs.getString("password"));
				users.add(user);
			}
			return users;
		}catch(Exception e){
			throw new RuntimeException(e);
		}finally{
			JdbcUtils.close(rs, pstmt, connection);
		}
		
	}

}
