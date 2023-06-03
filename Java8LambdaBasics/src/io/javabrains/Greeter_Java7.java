package io.javabrains;

public class Greeter_Java7 {

	public void greet(Function greeting) {
		greeting.perform();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Greeter_Java7 greeter = new Greeter_Java7();
		HelloWorldGreeting greeting = new HelloWorldGreeting();
		greeter.greet(greeting);

	}

}
