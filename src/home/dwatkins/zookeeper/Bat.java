package home.dwatkins.zookeeper;

public class Bat extends Mammal {
	public Bat() {
		this.energyLevel = 300;
	}
	
	public void fly() {
		System.out.println("Woosh!");
		this.energyLevel -= 50;
	}
	
	public void eatHumans() {
		System.out.println("Yum! Humans!");
		this.energyLevel += 25;
	}
	
	public void attackTown() {
		System.out.println("The bat has attacked Shelbyville! Hooray!");
		this.energyLevel -= 100;
	}
}