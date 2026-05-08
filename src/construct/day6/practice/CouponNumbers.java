package construct.day6.practice;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class CouponNumbers {
	
	public static int generateCoupons(int n) {
		
		Random r=new Random();
		return r.nextInt(n);
	}
	
	public static void uniqueCoupons(int num) {
		HashSet<Integer> hs=new HashSet<>();
		int count=0;
		for(int i=0;i<num;i++) {
			int r=generateCoupons(num);
			hs.add(r);
			count++;
		}
		
		System.out.println("Unique Coupons Count "+hs.size());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		uniqueCoupons(n);

	}

}
