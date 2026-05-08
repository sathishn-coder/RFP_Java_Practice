package oops.day13.practice;

public class MaximumMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.out.println(
                "Welcome to Generic Maximum Program");

        // UC1 - Integer Maximum
        System.out.println("\n=== Integer Test Cases ===");

        MaximumTest<Integer> intTest1 =
                new MaximumTest<>(30, 20, 10);

        intTest1.testMaximum();

        MaximumTest<Integer> intTest2 =
                new MaximumTest<>(10, 40, 20);

        intTest2.testMaximum();

        MaximumTest<Integer> intTest3 =
                new MaximumTest<>(10, 20, 50);

        intTest3.testMaximum();

        // UC2 - Float Maximum
        System.out.println("\n=== Float Test Cases ===");

        MaximumTest<Float> floatTest =
                new MaximumTest<>(
                        12.5f,
                        45.7f,
                        22.4f);

        floatTest.testMaximum();

        // UC3 - String Maximum
        System.out.println("\n=== String Test Cases ===");

        MaximumTest<String> stringTest =
                new MaximumTest<>(
                        "Apple",
                        "Peach",
                        "Banana");

        stringTest.testMaximum();

        // UC4 - More Than Three Parameters
        System.out.println(
                "\n=== Multiple Values Test ===");

        MaximumTest.testMaximum(
                10, 90, 20, 70, 50);

        MaximumTest.testMaximum(
                12.3f, 55.6f, 22.1f, 88.9f);

        MaximumTest.testMaximum(
                "Apple",
                "Peach",
                "Banana",
                "Orange");


	}

}
