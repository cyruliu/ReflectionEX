package myreflection1;

import java.lang.reflect.Array;

public class ArrayTest2 {

	public static void main (String[] args) throws Exception{
	
		int[] dims=new int[]{5,10,15};
		Object array=Array.newInstance(Integer.TYPE, dims);
		System.out.println(array instanceof int[][][]);
		Object arrayObj=Array.get(array, 3);
		/*Class<?>classType=arrayObj.getClass().getComponentType();
		System.out.println(classType);*/
		
		arrayObj=Array.get(arrayObj, 5);
		Array.setInt(arrayObj,10,37);
		int[][][] arrayCast=(int[][][])array;
		System.out.println(arrayCast[3][5][10]);		
		
		
	/*	//Integer.TYPE���ص���int����Integer.class���ص���Integer������Ӧ��Class����
        System.out.println(Integer.TYPE);
        System.out.println(Integer.class);
		*/
		
		
		
		
		
		
		
		
	}

}
