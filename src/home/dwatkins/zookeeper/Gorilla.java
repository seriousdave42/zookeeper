package home.dwatkins.zookeeper;

public class Gorilla extends Mammal {
	public void throwSomething() {
		System.out.println("The gorilla has thrown something. Hopefully not a guest!");
		this.energyLevel -= 5;
	}
	
	public void eatBananas() {
		System.out.println("Mmmmmm! Bananas!");
		this.energyLevel += 10;
	}
	
	public void climb() {
		System.out.println("The gorilla has climbed a tree. Hopefully not with a guest!");
		this.energyLevel -= 10;
	}
}
