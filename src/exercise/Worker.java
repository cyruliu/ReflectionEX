package exercise;

public class Worker implements Comparable<Worker>{
	private int age;
	private int salary;
	private String name;
	
	public Worker(String name,int age,int salary){
		this.name=name;
		this.age=age;
		this.salary=salary;		
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	public int getSalary(){
		return salary;
	}
	
	@Override
	public int compareTo(Worker other){
		if(this.salary<other.getSalary()){
			return -1;
		}else if(this.salary>other.getSalary()){
			return 1;
		}else{
			if(this.age<other.getAge()){
				return 1;
			}else if(this.age>=other.getAge()){
				return -1;
			}
		}
		return 0;
	}
	
	@Override
	public String toString(){
		return this.name+"\t"+this.age+"\t"+this.salary;		
	}

}
