package myreflection1;

import java.lang.reflect.Array;

public class ArrayTest1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Class<?>classType=Class.forName("java.lang.String");
		Object array=Array.newInstance(classType, 10);
		Array.set(array,5,"hello!");
		String str=(String)Array.get(array,5);
		System.out.println(str);

	}

}
