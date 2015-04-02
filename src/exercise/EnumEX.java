package exercise;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

enum Color{
	Red,Blue,Green;	
}
public class EnumEX {

	public static void main(String[] args) {
		Set<Color>t=new TreeSet<Color>();
		t.add(Color.Blue);
		t.add(Color.Red);
		t.add(Color.Green);
		Iterator<Color>iter=t.iterator();
		while(iter.hasNext()){
			System.out.print(iter.next()+", ");
		}
		System.out.println(Color.Blue);		
		for(Color color:Color.values())
			System.out.print(color.ordinal()+", ");
	}

}
