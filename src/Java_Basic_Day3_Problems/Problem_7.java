package Java_Basic_Day3_Problems;

public class Problem_7 {

	public static void main(String[] args) {
		int arr[]= {23,4,12,43,10,3,11};
		System.out.println("Display the odd position values");
		
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				System.out.print(arr[i]+" ");
			}
		}

	}

}
