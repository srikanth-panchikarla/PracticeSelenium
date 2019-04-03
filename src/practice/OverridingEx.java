package practice;

public class OverridingEx {

	public static void main(String[] args) {

	OverridingEx o=new Animal();
	
	Animal animal=new Animal();
	animal.makeSound();
	
	Dog dog=new Dog();
	dog.makeSound();
	
	Cat cat=new Cat();
	cat.makeSound();
	
		
	}

	
	 static class Animal extends OverridingEx{
	
		public void makeSound()
		{
			
			System.out.println("Animal making sound");
		}
		
	}
	
	
	 static class Dog extends Animal{
		
		public void makeSound()
		{
			
			System.out.println("Dog making sound");
			
		}
		
	}
	
	 static class Cat extends Animal
	{
		
		public void makeSound()
	{
		
		System.out.println("Cat making sound");
		
	}}
	
}


