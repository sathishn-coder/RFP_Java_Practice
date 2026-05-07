package construct.day5.practice;

public class PowerOfTwo {

	public static void main(String[] args) {
		 int n = Integer.parseInt(args[0]);

	        if (n < 0 || n >= 31) {
	            System.out.println("Enter value between 0 and 30");
	            return;
	        }

	        for (int i = 0; i <= n; i++) {

	            int power = (int) Math.pow(2, i);

	            System.out.println("2 ^ " + i + " = " + power);
	        }

	}

}
