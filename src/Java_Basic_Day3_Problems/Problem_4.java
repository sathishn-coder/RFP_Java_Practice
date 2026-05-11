package Java_Basic_Day3_Problems;

import java.util.Arrays;

public class Problem_4 {

	public static void main(String[] args) {
		int arr[]= {23,4,12,43,10,3,11};
		
		int min=0;
		Arrays.sort(arr);
		
		min=arr[0];
		System.out.println("Minimum elements "+min);

	}

}
