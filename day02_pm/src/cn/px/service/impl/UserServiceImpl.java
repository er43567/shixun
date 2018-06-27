package cn.px.service.impl;

import cn.px.bean.User;
import cn.px.dao.UserDao;
import cn.px.dao.impl.UserDaoImpl;
import cn.px.service.UserService;
/**
 * 业务层
 * @author Administrator
 *
 */
public class UserServiceImpl implements UserService {

	@Override
	public boolean isExistUser(User user) {
	    UserDao userDao = new UserDaoImpl();
	    return userDao.isExistUser(user);
		
	}

}
