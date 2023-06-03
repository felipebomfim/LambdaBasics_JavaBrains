package io.javabrains.unit2;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		int[] someNumbers = {1,2,3,4};
		int key = 0;
		
		process(someNumbers,key, wrapperLambda((n1,n2)->System.out.println(n1/n2)));
		
	}

	public static void process(int[] someNumbers, int key, BiConsumer<Integer,Integer> consumer) {
		for(int i: someNumbers) {
			consumer.accept(i,key);
		}
	}
	
	private static BiConsumer<Integer,Integer> wrapperLambda(BiConsumer<Integer,Integer> consumer) {
		return (n1,n2)->{
			try {
				consumer.accept(n1, n2);
			}catch (ArithmeticException e){
				System.out.println("Arithmetic Exception Happened!");
			}
		};
	}
}
