package lambda;

import java.util.function.Consumer;

public class Consumerdemo {

	public static void main(String[] args) {
		
		Consumer<String> c1 = (s)-> System.out.println(s.toUpperCase());
		//c1.accept("kavinaya.j");
		
		Consumer<String> c2 = (s)-> System.out.println(s.toLowerCase());
        //c2.accept("KAVINAYA.J");
        
        c1.andThen(c2).accept("java8 features");
	    
        Consumer<Integer> c3 = (x)-> System.out.println(x*5);
        Consumer<Integer> c4 = (x)-> System.out.println(x-4);
        
        c3.andThen(c4).accept(9);
	
	}
	

}
