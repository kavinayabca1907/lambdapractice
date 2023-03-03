package lambda;

import java.util.function.BiPredicate;

public class Bipredicate {

	public static void main(String[] args) {
		
		BiPredicate<Integer, Integer> bipredicate = (a,b) -> a>=50 && b<50;
		
				boolean result = bipredicate.test(100,45);
		
		System.out.println(result);
		
		
	}

}
