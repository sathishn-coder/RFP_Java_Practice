package Java_Basic_Day3_Problems;

public class Problem_8 {

	public static void main(String[] args) {
		int arr[]= {1,4,2,3,5,2,1,3,8,5};
		System.out.println("Duplicate Elements ");
		int count=1;
		for(int i=0;i<arr.length;i++) {
			count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					arr[j]=0;
					}
			}
			if(arr[i]!=0 && count>1) {
				System.out.print(arr[i]+" ");
			}
		}

	}

}
