package cn.px.test;

import org.hibernate.Session;
import org.junit.Test;
import cn.px.bean.User;
import cn.px.utils.HibernateUtils;
/*
  ���,ɾ������Ҫ������������,�Ż�ִ�ж����ݿ�Ĳ���
 */
public class HibernateTest {
     @Test
	 public void test01(){
		  Session session = HibernateUtils.getSession();
	      System.out.println(session);
	      HibernateUtils.closeSession(session);
     }
     //ʵ����ı���
     @Test
     public void test02(){
    	  Session session = HibernateUtils.getSession();
          User user = new User();
          user.setUsername("123224");
          session.beginTransaction();
          session.save(user);
          session.getTransaction().commit();
          session.close();
     }
     @Test
     public void test03(){
    	 Session session = HibernateUtils.getSession();
    	 User user = (User)session.get(User.class,"40280582643f199201643f1996b00000");
    	// User user = (User)session.load(User.class,"40280582643f199201643f1996b00000");
    	 System.out.println(user.getUsername());
         session.close();
     }
     @Test
     public void test04(){
    	 Session session = HibernateUtils.getSession();
    	 User user = new User();
    	 user.setId("40280582643f199201643f1996b00000");
    	 session.beginTransaction();
    	 session.delete(user);
    	 session.getTransaction().commit();
    	 session.close();
     }
     
}
