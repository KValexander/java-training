package polymorphism;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Animal animal;
		
		System.out.println("What animal do you want?");
		System.out.println("1 = dog || 2 = cat :");
		int choice = scanner.nextInt();
		scanner.close();
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(dog);
		animals.add(cat);
		
		if(choice == 1) {
			animal = new Dog();
		} else if (choice == 2) {
			animal = new Cat();
		} else {
			animal = new Animal();
		}
		
		animals.add(animal);
		
		animal.speak();
		
		for(Animal x : animals) {
			System.out.println(x);
		}
		
		
	}
}
