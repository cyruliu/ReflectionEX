package myreflection1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectTester {
	//�÷���ʵ�ֶ�Customer����Ŀ�������
	public Object copy(Object object) throws Exception{
		Class<?>classType=object.getClass();		
		
		
		//�����вεĹ��췽����ֻ��ͨ��������ʽ�����ɶ���
		/*Constructor cons=classType.getConstructor(new Class[]{String.class,int.class});
		Object obj=cons.newInstance(new Object[]{"Cyrus",18});*/
		
		//���췽��������ܲ�����û���޲ι��췽�������������޷�ʵ��������ģ�
//		Object obj1=classType.newInstance();
//		System.out.println(obj);		
		
		
		//Ҳ��һ����ɣ�
		Object objectCopy=classType.getConstructor(new Class[]{}).newInstance(new Object[]{});

		//��ö�������г�Ա����
		
		Field[] fields=classType.getDeclaredFields();
		for(Field field:fields){
			String name=field.getName();
			String firstLetter=name.substring(0, 1).toUpperCase();
			
			String getMethodName="get"+firstLetter+name.substring(1,name.length());
			String setMethodName="set"+firstLetter+name.substring(1);
			
			Method getMethod=classType.getMethod(getMethodName,new Class[]{});
			Method setMethod=classType.getMethod(setMethodName,new Class[]{field.getType()});
			
			Object value=getMethod.invoke(object,new Object[]{});
			setMethod.invoke(objectCopy,new Object[]{value});
			
//			System.out.println(getMethodName+","+setMethodName);
			
		}		
		
		return objectCopy;	
		
	}
	
	public static void main(String[] args) throws Exception{
		Customer customer=new Customer("Cyrus",20);
		customer.setId(1L);
//		customer.setId(new Long(1));
		ReflectTester test=new ReflectTester();
		Customer customer1=(Customer)test.copy(customer);
		System.out.println(customer1.getId()+","+customer1.getName()+","+customer1.getAge());		
	}	
	

}


class Customer{
	private Long id;
	private String name;	
	private int age;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Customer(){}
	public Customer(String name,int age){
		this.name=name;
		this.age=age;		
	}
	
	
	
}