package lambda;

@FunctionalInterface
public interface Interfacedemo {

	public abstract void test();
	//public abstract void test(int no1,int no2);
	
	default void test2() {
		System.out.println("Hi I'm default method");
	}
	
	static void test3() {
		System.out.println("Hi I'm static method");
	}
}
