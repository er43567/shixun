package cn.px.jdbc;

public class UseStatic {
    
	
	//��̬�����,���е�����ֻ���ʼ��һ��
	static{
	    System.out.println("static");	
	}
	public static void main(String[] args) {
		 UseStatic us1 = new UseStatic();
		 UseStatic us2 = new UseStatic();
		 UseStatic us3= new UseStatic();
		 
	}
}
