package exercise;

import java.util.Arrays;

public class ComparableDemo {

	public static void main(String[] args) {
		Worker[] workers=new Worker[5];
		workers[0]=new Worker("test1",25,2000);
		workers[1]=new Worker("test2",24,2100);
		workers[2]=new Worker("test3",26,2100);
		workers[3]=new Worker("test4",27,2200);
		workers[4]=new Worker("test5",28,1900);
		
		Arrays.sort(workers);
		for(Worker w:workers)
			System.out.println(w);
	}

}
