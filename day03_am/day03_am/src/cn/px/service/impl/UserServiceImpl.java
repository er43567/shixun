package cn.px.service.impl;

import java.util.List;

import cn.px.bean.User;
import cn.px.dao.UserDao;
import cn.px.dao.impl.UserDaoImpl;
import cn.px.service.UserService;
/**
 * 业务�?
 * @author Administrator
 *
 */
public class UserServiceImpl implements UserService {

	@Override
	public boolean isExistUser(User user) {
	    UserDao userDao = new UserDaoImpl();
	    return userDao.isExistUser(user);
		
	}

	@Override
	public List<User> queryAllUser() {
		 UserDao userDao = new UserDaoImpl();
		 return userDao.queryAllUser();
	}

}
