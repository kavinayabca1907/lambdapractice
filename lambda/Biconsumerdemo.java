package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class Biconsumerdemo {

	public static void main(String[] args) {
		
		BiConsumer<Integer,Integer> bc1 = (x,y) -> System.out.println("Add:" +(x+y));
		BiConsumer<Integer,Integer> bc2 = (x,y) -> System.out.println("Multiply:" +(x*y));
		
		bc1.andThen(bc2).accept(10,20);
		
		List<Integer> l1= Arrays.asList(1,2,3,4);
		List<Integer> l2= Arrays.asList(1,2,3,6);
		
		BiConsumer<List<Integer>, List<Integer>> sizecheck =
				(list1,list2) -> {
					if(list1.size()==list2.size())
						System.out.println("True");
					else
						System.out.println("False");
				};
				
				sizecheck.accept(l1,l2);
	}

}
