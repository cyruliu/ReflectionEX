package myreflection;
class X{
	
	
}

public class Refelction {
	public static void main(String[] args){
		Class<?>class1=null;
		Class<?>class2=null;
		Class<?>class3=null;
		try{
			class1=Class.forName("myreflection.X");
		}catch(ClassNotFoundException e){
			e.printStackTrace();			
		}
		class2=new X().getClass();
		class3=X.class;
		System.out.println("�����ƣ�"+class1.getName());
		System.out.println("�����ƣ�"+class2.getName());
		System.out.println("�����ƣ�"+class3.getName());
	}
	

}
