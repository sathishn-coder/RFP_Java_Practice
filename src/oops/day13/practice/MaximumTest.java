package oops.day13.practice;

public class MaximumTest<T extends Comparable<T>> {

    // Instance Variables
    T value1;
    T value2;
    T value3;

    // Parameterized Constructor
    public MaximumTest(T value1,
                       T value2,
                       T value3) {

        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    // Instance Method
    public T testMaximum() {

        return testMaximum(
                value1,
                value2,
                value3);
    }

    // Generic Method for 3 Values
    public static <T extends Comparable<T>>
    T testMaximum(T x, T y, T z) {

        T max = x;

        // Compare y with max
        if (y.compareTo(max) > 0) {

            max = y;
        }

        // Compare z with max
        if (z.compareTo(max) > 0) {

            max = z;
        }

        // Print Maximum
        printMax(max);

        return max;
    }

    // Generic Method for Multiple Values
    @SafeVarargs
    public static <T extends Comparable<T>>
    T testMaximum(T... values) {

        T max = values[0];

        for (T value : values) {

            if (value.compareTo(max) > 0) {

                max = value;
            }
        }

        // Print Maximum
        printMax(max);

        return max;
    }

    // Generic Print Method
    public static <T> void printMax(T max) {

        System.out.println(
                "Maximum Value : " + max);
    }
}
