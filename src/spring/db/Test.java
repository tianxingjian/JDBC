package spring.db;

public class Test {

	public static void main(String[] args) {
		System.out.println("Start:");
		ConnectionFactory factory = ConnectionFactory.getInstance();
		System.out.println("End!");
	}

}
