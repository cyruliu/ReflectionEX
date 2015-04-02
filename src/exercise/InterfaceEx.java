package exercise;


public class InterfaceEx {

	public static void main(String[] args) {
		Object[] objects={new Tiger(),new Apple(),new Chicken(),new Orange()};
	for(int i=0;i<objects.length;i++){
		if(objects[i] instanceof Animal)
			System.out.println(((Animal)objects[i]).howToEat());	
		else System.out.println(((Fruit)objects[i]).howToEat());
	
		
		
	}	
		
	}
   
}

abstract class Animal {
	public abstract String howToEat();
}

abstract class Fruit implements Edible{}

class Tiger extends Animal{
	public String howToEat(){
		return "Sorry,the Tiger is not allowed to be eaten,it's illegal!";		
	}
}

class Chicken extends Animal implements Edible{
	public String howToEat(){
		return "Chiken: Fry it";		
	}	
}

class Apple extends Fruit {
	public String howToEat(){
		return "Apple: Make apple cider";		
	}	
}

class Orange extends Fruit {
	public String howToEat(){
		return "Orange: Make orange juice ";		
	}	
}
