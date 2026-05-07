package day1_practice_problem;

public class Problem_4 {

	public static void main(String[] args) {
		
		int sum=0,invalidcount=0;
		
		if(args.length==0) {
			System.out.println("No more input values");
		}
		else {
			for(String s:args) {
				try {
					int a=Integer.parseInt(s);
					sum +=a;
				}
				catch(NumberFormatException e) {
					invalidcount++;
				}
			}
		}
		
		System.out.println(sum);
		System.out.println(invalidcount);
		
		

	}

}
