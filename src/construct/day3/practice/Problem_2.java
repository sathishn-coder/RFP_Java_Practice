package construct.day3.practice;



class Line implements Comparable<Line> {

    int x1, y1, x2, y2;

    // Constructor
    Line(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    // Method to calculate length
    public double getLength() {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    // Override equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Line)) return false;

        Line other = (Line) obj;
        return Double.compare(this.getLength(), other.getLength()) == 0;
    }

    // Implement compareTo method
    @Override
    public int compareTo(Line other) {
        return Double.compare(this.getLength(), other.getLength());
    }
}

public class Problem_2 {

    public static void main(String[] args) {

        System.out.println("Welcome to Line Comparison Computation Program");

        // Create two Line objects
        Line line1 = new Line(1, 2, 4, 6);
        Line line2 = new Line(2, 3, 5, 7);

        double length1 = line1.getLength();
        double length2 = line2.getLength();

        System.out.println("Length of Line 1: " + length1);
        System.out.println("Length of Line 2: " + length2);

        // Check equality
        if (line1.equals(line2)) {
            System.out.println("Both lines are equal.");
        } else {
            System.out.println("Lines are not equal.");
        }

        // Compare lines
        int result = line1.compareTo(line2);

        if (result == 0) {
            System.out.println("Both lines are equal.");
        } else if (result > 0) {
            System.out.println("Line 1 is greater than Line 2.");
        } else {
            System.out.println("Line 1 is less than Line 2.");
        }
    }
}
