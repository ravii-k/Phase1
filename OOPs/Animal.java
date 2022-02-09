package OOPs;
// Polymorphism
public class Animal {


	public void makeNoise() {
		System.out.println("Some sound");
	}
}

class Dog extends Animal {
	public void makeNoise() {
		System.out.println("Bark");
	}
}

class Cat extends Animal {
	public void makeNoise() {
		System.out.println("Meawoo");
	}
	//Now which makeNoise() method will be called depends on type of actual instance created on runtime
public static void main(String[] args) {
Animal a1 = new Cat();
a1.makeNoise(); // Meowoo
 
Animal a2 = new Dog();
a2.makeNoise(); // Bark
}
}