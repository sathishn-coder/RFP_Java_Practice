package construct.day5.practice;

import java.util.Random;
import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter number of times to flip coin: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer");
            return;
        }

        int heads = 0;
        int tails = 0;

        for (int i = 1; i <= n; i++) {

            double result = random.nextDouble();

            if (result < 0.5)
                tails++;
            else
                heads++;
        }

        double headPercent = (heads * 100.0) / n;
        double tailPercent = (tails * 100.0) / n;

        System.out.println("Heads Percentage : " + headPercent + "%");
        System.out.println("Tails Percentage : " + tailPercent + "%");

	}

}
