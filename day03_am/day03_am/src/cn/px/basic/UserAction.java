package cn.px.basic;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import cn.px.bean.User;
import cn.px.service.UserService;
import cn.px.service.impl.UserServiceImpl;
import cn.px.utils.VsUtils;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.ValueStack;

public class UserAction extends ActionSupport implements ModelDriven<User>{
	
	private User user = new User();
	@Override
	public User getModel() {
		return user;
	}  
	 
	/**
       * 判断用户是否存在
       * @return
       */
	  public String  isExistUser(){
		  UserService userService = new UserServiceImpl();
		  //如果用户存在
		  if(userService.isExistUser(user)){
			  
			  HttpSession session = ServletActionContext.getRequest().getSession();
			  session.setAttribute("user",user.getUserName());
			  return "success";
		  }else{
			  this.addFieldError("errors","用户或密码错误" );
			  return "login";
		  }
		  
	  }
      public String queryAllUser(){
    	  
    	  UserService userService = new UserServiceImpl();
    	  List<User> list = userService.queryAllUser();
    	  //request对象如何获取
    	  /*ActionContext context = ActionContext.getContext();
    	  ValueStack valueStack = context.getValueStack();*/
    	  VsUtils.set(ActionContext.getContext(),list);
    	  return "list";
      }
	 
}
