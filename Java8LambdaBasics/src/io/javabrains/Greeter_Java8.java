package io.javabrains;

public class Greeter_Java8 {

	public void greet(Function f) {
		f.perform();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Greeter_Java8 greeter = new Greeter_Java8();
		Function sayHello = () -> System.out.println("Hello Java8!");
		greeter.greet(sayHello);
		
		greeter.greet(() -> System.out.println("Hello Java8 again!"));
		
		sayHello = () -> System.out.println("Hello Java8 for the third time!");
		sayHello.perform();
		
	}

}
