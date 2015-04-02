package myreflection1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectTester {
	//该方法实现对Customer对象的拷贝操作
	public Object copy(Object object) throws Exception{
		Class<?>classType=object.getClass();		
		
		
		//对于有参的构造方法，只能通过这种形式来生成对象
		/*Constructor cons=classType.getConstructor(new Class[]{String.class,int.class});
		Object obj=cons.newInstance(new Object[]{"Cyrus",18});*/
		
		//构造方法如果接受参数，没有无参构造方法，这这样是无法实例化对象的！
//		Object obj1=classType.newInstance();
//		System.out.println(obj);		
		
		
		//也可一步完成：
		Object objectCopy=classType.getConstructor(new Class[]{}).newInstance(new Object[]{});

		//获得对象的所有成员变量
		
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