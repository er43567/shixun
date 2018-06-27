package cn.px.utils;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.util.ValueStack;

public class VsUtils { 
	  
	  public static void set(ActionContext context,Object object){
		     ValueStack vs = context.getValueStack();
		     vs.set("userLists",object);
	  }

}
