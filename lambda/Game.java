package lambda;

public class Game implements Interfacedemo {

	public static void main(String[] args) {
		
		Interfacedemo g = new Game();
		g.test();
		g.test2();
		Interfacedemo.test3();

	}

	@Override
	public void test() {
		System.out.println("This is the test method");
		
	}

}
