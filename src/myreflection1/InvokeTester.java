package myreflection1;

import java.lang.reflect.Method;

public class InvokeTester {
	public int add(int param1,int param2){
		return param1+param2;		
	}
	
	public String echo(String message){
		return "Hello:"+message;		
	}

	public static void main(String[] args) throws Exception {
		// 正常的调用类的方法
		/*InvokeTester test=new InvokeTester();
		System.out.println(test.add(1, 2));
		System.out.println(test.echo("Cyrus"));*/
		
		//反射机制调用类的方法
		Class<?>classType=InvokeTester.class;//获取一个类的Class对象的第二种方法。java内置的语法,string.class；
		Object invokeTester=classType.newInstance();//实例化InvokTester类；
	//	System.out.println(invokeTester instanceof InvokeTester);//测试是否是莫个类的实例
	
		Method addMethod=classType.getMethod("add", new Class[]{int.class,int.class});		//方法所对应的Method对象	
		Object result=addMethod.invoke(invokeTester, new Object[]{1,2});
		System.out.println((Integer)result);			
		System.out.println("-----------------------------------");
		
		
		Method echoMethod=classType.getMethod("echo", new Class[]{String.class});//生成对应echo方法的Method对象
		Object result1=echoMethod.invoke(invokeTester, new Object[]{"Cyrus"});
		System.out.println((String)result1);
		

	}

}
