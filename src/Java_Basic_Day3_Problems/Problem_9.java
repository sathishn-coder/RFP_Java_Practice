package Java_Basic_Day3_Problems;

import java.util.Arrays;

public class Problem_9 {

	public static void main(String[] args) {
		int arr[]= {23,4,12,43,10,3,11};
		
		System.out.println("Arrays Sorted Values");
		
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
