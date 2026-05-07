package construct.day5.practice;

import java.util.Scanner;

public class SumOfThreeZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of elements: ");
	        int n = sc.nextInt();

	        int[] arr = new int[n];

	        System.out.println("Enter array elements:");

	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        int count = 0;

	        System.out.println("Distinct Triplets:");

	        for (int i = 0; i < n; i++) {

	            for (int j = i + 1; j < n; j++) {

	                for (int k = j + 1; k < n; k++) {

	                    if (arr[i] + arr[j] + arr[k] == 0) {

	                        count++;

	                        System.out.println(
	                                arr[i] + " " +
	                                arr[j] + " " +
	                                arr[k]);
	                    }
	                }
	            }
	        }

	        System.out.println("Total Triplets = " + count);

	}

}
