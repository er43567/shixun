package cn.px.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConnectionOper02 {
     public static void main(String[] args) {
    	 try{
 		    String className = "org.gjt.mm.mysql.Driver";
 			//1:��������
 			 Class.forName(className);
 			//���������ݿ������
 			//jdbc:mysql://���ݿ�mysql���ڵ�IP(localhostΪ����),3306Ϊmysql�Ķ˿ں�/���ݿ������
 		    String url = "jdbc:mysql://localhost:3306/crm";
 		    String username = "root"; //���ݿ���û���
 		    String password = "root"; //���ݿ������
 			Connection connection = DriverManager.getConnection(url,username,password);
 		    String sql ="select * from t_stu";
 		    //����prepareStatement����
 		    PreparedStatement pstmt = connection.prepareStatement(sql);
 		    //���ز�ѯ�����
 		    ResultSet rs = pstmt.executeQuery();
 		    //�Խ�������б���,������
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
