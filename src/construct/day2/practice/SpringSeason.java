package construct.day2.practice;

import java.util.Scanner;

public class SpringSeason {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Month: ");
        int m = sc.nextInt();

        System.out.print("Enter Day: ");
        int d = sc.nextInt();

        boolean isSpring =
                (m == 3 && d >= 20) ||
                (m == 4) ||
                (m == 5) ||
                (m == 6 && d <= 20);

        System.out.println(isSpring);
    }

}
