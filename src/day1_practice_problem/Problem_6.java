package day1_practice_problem;

public class Problem_6 {
	 
	//variable
	public static int a=1000;
	
	//method
	public static void display() {
		System.out.println("Static Method");
	}
	
	static {
		System.out.println("Static Block");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Static Variable "+a);
		display();
		

	}

}
