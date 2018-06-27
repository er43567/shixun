package cn.px.jdbc;

public class UseStatic {
    
	
	//静态代码块,其中的内容只会初始化一次
	static{
	    System.out.println("static");	
	}
	public static void main(String[] args) {
		 UseStatic us1 = new UseStatic();
		 UseStatic us2 = new UseStatic();
		 UseStatic us3= new UseStatic();
		 
	}
}
