package Java_Basic_Day3_Problems;

import java.util.Arrays;

public class Problem_3 {

	public static void main(String[] args) {
		int arr[]= {23,4,12,43,10,3,11};
		
		int max=0;
		Arrays.sort(arr);
		
		max=arr[arr.length-1];
		System.out.println("Maximum elements "+max);

	}

}
