package myreflection1;
import java.lang.reflect.Method;


public class DumpMethod {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//使用Class类的静态方法forName：Class.forName("java.lang.String")
		Class<?>classType=Class.forName("java.lang.reflect.Method");//获取一个类的Class对象，反射的第一步
		Method[] methods=classType.getDeclaredMethods();
		
		for(Method method:methods){
			System.out.println(method);			
		}
		
   
	}

}
