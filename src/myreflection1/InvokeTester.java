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
		// �����ĵ�����ķ���
		/*InvokeTester test=new InvokeTester();
		System.out.println(test.add(1, 2));
		System.out.println(test.echo("Cyrus"));*/
		
		//������Ƶ�����ķ���
		Class<?>classType=InvokeTester.class;//��ȡһ�����Class����ĵڶ��ַ�����java���õ��﷨,string.class��
		Object invokeTester=classType.newInstance();//ʵ����InvokTester�ࣻ
	//	System.out.println(invokeTester instanceof InvokeTester);//�����Ƿ���Ī�����ʵ��
	
		Method addMethod=classType.getMethod("add", new Class[]{int.class,int.class});		//��������Ӧ��Method����	
		Object result=addMethod.invoke(invokeTester, new Object[]{1,2});
		System.out.println((Integer)result);			
		System.out.println("-----------------------------------");
		
		
		Method echoMethod=classType.getMethod("echo", new Class[]{String.class});//���ɶ�Ӧecho������Method����
		Object result1=echoMethod.invoke(invokeTester, new Object[]{"Cyrus"});
		System.out.println((String)result1);
		

	}

}
