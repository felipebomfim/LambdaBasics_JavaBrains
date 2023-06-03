package io.javabrains;

@FunctionalInterface 
// Important to enforce that its gonna have only one abstract method
public interface Function {
	public void perform();
	
//	public int dosomething(int num); Don't know why I can't have more than one method
//	Now I know. It's a rule for lambda interfaces :(
	
//	Actually this rule is only for abstract methods though
}
