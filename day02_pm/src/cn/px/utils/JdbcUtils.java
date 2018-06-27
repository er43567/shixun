package cn.px.utils;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import java.sql.PreparedStatement;

public class JdbcUtils {
	
	static String className = null;
	static String URL = null;
	static String username = null;
	static String password = null;
	static {
		InputStream in = null;
		try {
			in = JdbcUtils.class.getResourceAsStream("jdbc.properties");
			Properties pro = new Properties();
			pro.load(in);
			className = pro.getProperty("className");
			URL = pro.getProperty("url");
			username = pro.getProperty("username");
			password = pro.getProperty("password");
		} catch (Exception e) {
               e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}

	}

	public static Connection getConnection() {
		try {
			Class.forName(className);
			return DriverManager.getConnection(URL, username, password);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("��������ʧ��");
		}
		    return null;

	}
	public static void close(ResultSet rs,PreparedStatement pstmt,Connection conn){
		  if(rs!=null){
			  try {
				rs.close();
			} catch (SQLException e) {
			    e.printStackTrace();
			}
		  }
		  if(pstmt!=null){
			  try {
				  pstmt.close();
			} catch (SQLException e) {
			    e.printStackTrace();
			}
		  }
		  if(conn!=null){
			  try {
				  conn.close();
			} catch (SQLException e) {
			    e.printStackTrace();
			}
		  }
	}

}
