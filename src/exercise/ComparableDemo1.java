package exercise;
import java.util.Arrays;

public class ComparableDemo1 {

	public static void main(String[] args) {
/*		Student stu[]=new Student[4];		
		stu[0]=new Student("Bob",20,90.0f);
		stu[1]=new Student("Jacob",22,90.f);
		stu[2]=new Student("Susan",20,99.0f);
		stu[3]=new Student("Sara",22,100.0f);	
*/		
		Student stu[]={new Student("Bob",20,90.0f),
				       new Student("Jacob",22,90.f),
				       new Student("Susan",20,99.0f),
				       new Student("Sara",22,100.0f)};	
		
/*		Arrays.sort(stu);
*/		Arrays.sort(stu,new StudentComparator());
		for(Student s:stu)
			System.out.println(s);
	}
	


}
