package cn.px.jdbc.utils;

import java.sql.Connection;

import org.junit.Test;

public class JdbcTest {
     @Test
	 public void test01(){
		 System.out.println(JdbcUtils.className);
	 }
     @Test
     public void test02(){
    	 Connection conn= JdbcUtils.getConnection();
    	 System.out.println(conn);
     }
}
