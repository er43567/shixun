package cn.px.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

//�����ݿ��������
public class ConnectionOper {
      
	 public static void main(String args[]){
		 try{
		    String className = "org.gjt.mm.mysql.Driver";
			//1:��������
			 Class.forName(className);
			//���������ݿ������
		    String url = "jdbc:mysql://localhost:3306";
		    String username = "root";
		    String password = "root";
			Connection connection = DriverManager.getConnection(url,username,password);
		    System.out.println(connection);
		 }catch(Exception e){
			 e.printStackTrace();
		 }
		 
		 
	 }
}
