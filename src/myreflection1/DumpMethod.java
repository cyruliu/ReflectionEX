package myreflection1;
import java.lang.reflect.Method;


public class DumpMethod {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//ʹ��Class��ľ�̬����forName��Class.forName("java.lang.String")
		Class<?>classType=Class.forName("java.lang.reflect.Method");//��ȡһ�����Class���󣬷���ĵ�һ��
		Method[] methods=classType.getDeclaredMethods();
		
		for(Method method:methods){
			System.out.println(method);			
		}
		
   
	}

}
