package cn.px.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConnectionOper02 {
     public static void main(String[] args) {
    	 try{
 		    String className = "org.gjt.mm.mysql.Driver";
 			//1:加载驱动
 			 Class.forName(className);
 			//创建和数据库的连接
 			//jdbc:mysql://数据库mysql所在的IP(localhost为本机),3306为mysql的端口号/数据库的名称
 		    String url = "jdbc:mysql://localhost:3306/crm";
 		    String username = "root"; //数据库的用户名
 		    String password = "root"; //数据库的密码
 			Connection connection = DriverManager.getConnection(url,username,password);
 		    String sql ="select * from t_stu";
 		    //创建prepareStatement对象
 		    PreparedStatement pstmt = connection.prepareStatement(sql);
 		    //返回查询结果集
 		    ResultSet rs = pstmt.executeQuery();
 		    //对结果集进行遍历,输出结果
 		    while(rs.next()){
 		    	int id = rs.getInt("id");
 		    	String user = rs.getString("usename");
 		    	System.out.println("id="+id+",username="+user);
 		    	
 		    }
 		    
    	 }catch(Exception e){
 			 e.printStackTrace();
 		 }
	}
}
