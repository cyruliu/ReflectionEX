package exercise;

import java.util.Comparator;

public class Student implements Comparable<Student>{
	private String name;
	private int age;
	private float score;
	
	public Student(String name,int age, float score){
		this.name=name;
		this.age=age;
		this.score=score;		
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


	public float getScore() {
		return score;
	}


	public void setScore(float score) {
		this.score = score;
	}


	public String toString(){
		return name+"\t\t"+age+"\t\t"+score;		
	}
	
	@Override
	public int compareTo(Student o){
		if(this.score>o.score)
			return -1;
		else if(this.score<o.score)
			return 1;
		else{
			if(this.age>o.age)
				return 1;
			else if(this.age<o.age)
				return -1;
			else return 0;
		}
		
	}
	
}

class StudentComparator implements Comparator<Student>{
	@Override
	public int compare(Student o1,Student o2){
		if(o1.getScore()>o2.getScore())
			return -1;
		else if(o1.getScore()<o2.getScore())
			return 1;
		else{
			if(o1.getAge()>o2.getAge())
				return 1;
			else if(o1.getAge()<o2.getAge())
				return -1;
			else return 0;
		}
	}
	
}
