package cn.px.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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

}
