package cn.px.dao;

import java.util.List;

import cn.px.bean.User;

public interface UserDao {
   
	public boolean isExistUser(User user);
	
	public List<User>  queryAllUser();
}
