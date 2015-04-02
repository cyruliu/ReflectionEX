package myreflection;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Array;
public class ReflectionEx {
	public static void main(String[] args){
		//Foo f = new Foo();		
		//Foo.print2();
		
    	//((Foo)f).print();
		
	 /*  final Foo f = new Foo();
		f.print();
		f = new Foo();
		f.print2();*/
		
		//Foo f=new Foo();
		//System.out.println(f.getClass().getName());	
		//Method method;
		//		Class<?>c=null;
		//		try{			
		//			//method =f.getClass().getMethod("print", new Class<?>[5]{"","","","",""});
		//			//method.invoke(f);
		//			c=Class.forName("myreflection.Foo");
		//		}catch (Exception e){
		//			e.printStackTrace();			
		//		}
		//		//create instance of "Foo"
		//		Foo f1=null;
		//		Foo f2=null;
		//		
		//		//get all constructors
		//		Constructor<?>cons[]=c.getConstructors();
		//		try{
		//			f1=(Foo)cons[0].newInstance();	
		//			f2=(Foo)cons[1].newInstance("abc");
		//		}catch(Exception e){			
		//			e.printStackTrace();
		//		}
		//		f1.print();
		//		f2.print();
		//		
		//	int [] intArray={1,2,3,4,5};
		//    int [] newIntArray=(int [])changeArraySize(intArray,5);
		//    print(newIntArray);
		//    
		//    String[] str={"a","b","c","d","e"};
		//    String[] str1=(String[])changeArraySize(str,10);
		//    print(str1);		

	}

	//change array size
	public static Object changeArraySize(Object obj,int len){
		Class<?>arr=obj.getClass().getComponentType();
		Object newArray=Array.newInstance(arr,len);

		//do array copy
		int co=Array.getLength(obj);
		System.arraycopy(obj,0,newArray,0,co);
		return newArray;
	}
	//print
	public static void print(Object obj){
		//反射获取obj的类
		Class<?>c=obj.getClass();
		//判断该内是否是Array
		if(!c.isArray()){
			return;		
		}
		System.out.println("\nArray length:"+Array.getLength(obj));
		for(int i=0;i<Array.getLength(obj);i++){
			System.out.print(Array.get(obj, i)+" ");

		}

	}

}

class Foo{
	String s;
	public static int i;
	
	static {
		System.out.println("00");
	}
	public Foo(){
		System.out.println("111");
	}
	public Foo(String s){	
		System.out.println("22");
		this.s=s;
	}
	public void print(){
		System.out.println("abc");    		
	}
	public static void print2(){
		System.out.println("ABC");
	}
}
