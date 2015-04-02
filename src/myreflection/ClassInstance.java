package myreflection;

import java.lang.reflect.Constructor;


//Class类可以通过一个给定的字符串来实例化一个类的对象,必须存在无参构造方法
interface China{
	public static final String NATIONAL_STRING="China";
	public static final String AUTHOR_STRING="Cyrus";
	public void sayChina();
	public String sayHello(String name,int age);
	
}
 class Person implements China{
	private String name;
	private int age;
	
	public Person(){
		
		
	}
	
	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	public String getName(){
		return this.name;		
	}	
	public void setName(String name){
		this.name=name;		
	}
	
	public int getAge(){
		return this.age;		
	}
	public void setAge(int age){
		this.age=age;		
	}
	
	public String tostring(){
		return "姓名："+this.name+";"+"年龄："+this.age;		
	}
	
	@Override
	public void sayChina(){
		System.out.println("Author:"+AUTHOR_STRING+"National:"+NATIONAL_STRING);		
	}
	
	@Override
	public String sayHello(String name, int age){
		return name +", hello ! I'm"+age+"years old.";
		
	}
}
public class ClassInstance {
	public static void main(String[] args){
		Class<?>class1=null;
		try{
			class1=Class.forName("myreflection.Person");			
		}catch(Exception e){
			e.printStackTrace();			
		}
		/*Person person=null;		
		Constructor<?>constructions[]=null;
		constructions=class1.getConstructors();*/
		
		Class<?>class2[]=class1.getInterfaces();
		for(int i=0;i<class2.length;i++){
			System.out.println("实现的接口名称："+class2[i].getName());
			
		}
		/*try{			
			//person=(Person)class1.newInstance();
			person=(Person)constructions[0].newInstance("Cyrus",23);
		}catch(Exception e){
			e.printStackTrace();			
		}
		//person.setName("Cyrus");
		//person.setAge(23);
		System.out.println(person.tostring());
		System.out.println(person);*/
	}
	

}
