package lambda;

import java.util.function.Predicate;

public class Predicatedemo {

	public static void main(String[] args) {
		
		Predicate<Integer> lessthan = a-> a<80;
		/*boolean a =lessthan.test(90);
		System.out.println(a);*/
		
		Predicate<Integer> greaterthan = g-> g>80;
		/*boolean g =greaterthan.test(90);
		System.out.println(g);*/
		
		Predicate<Integer> equalto = e-> e==80;
		/*boolean e =equalto.test(90);
		System.out.println(e);*/

        System.out.println("and:" +lessthan.and(greaterthan).test(60));
        System.out.println("Or:" +lessthan.or(greaterthan).test(60));
        System.out.println("Equal:" +lessthan.or(equalto).test(60));
	}

}
