package construct.day6.practice;

import java.util.Scanner;

public class VendingMachine {

	static int[] notes = {1000, 500, 100, 50, 10, 5, 2, 1};

    static int count = 0;

    public static void findNotes(int amount) {

        if (amount == 0)
            return;

        for (int note : notes) {

            if (amount >= note) {

                int num = amount / note;

                count += num;

                System.out.println(note + " x " + num);

                findNotes(amount % note);

                break;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Amount: ");
        int amount = sc.nextInt();

        findNotes(amount);

        System.out.println("Minimum Notes = " + count);
    }
}
