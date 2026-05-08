package construct.day6.practice;

import java.util.Scanner;

public class Binary {
	 public static boolean isPowerOfTwo(int n) {

	        return (n & (n - 1)) == 0;
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Number: ");
	        int num = sc.nextInt();

	        String binary =
	                String.format("%8s",
	                Integer.toBinaryString(num))
	                .replace(' ', '0');

	        System.out.println("Binary = " + binary);

	        // Swap nibbles
	        int swapped =
	                ((num & 0x0F) << 4)
	                | ((num & 0xF0) >> 4);

	        System.out.println("After Swapping Nibbles = "
	                + swapped);

	        if (isPowerOfTwo(swapped))
	            System.out.println(swapped
	                    + " is Power of 2");
	        else
	            System.out.println(swapped
	                    + " is Not Power of 2");
	    }

}
