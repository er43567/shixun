package cn.px.service;

import java.util.List;

import cn.px.bean.User;

public interface UserService {
    //判断用户是否存在
	public boolean isExistUser(User user);
	
    public List<User>  queryAllUser();
	
	
	 
}
