package Java_Basic_Day3_Problems;

import java.util.Arrays;

public class Problem_10 {

	public static void main(String[] args) {
		int arr[]= {23,4,12,43,10,43,11,4,30};
		
		System.out.println("2nd Largest Elements");
		
		Arrays.sort(arr);
		
		int max=arr[arr.length-1];
		int ind=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==max) {
				ind=i;
				break;
			}
		}
		System.out.println(arr[ind-1]);
	}

}
