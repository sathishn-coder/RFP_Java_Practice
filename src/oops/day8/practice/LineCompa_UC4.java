package oops.day8.practice;

public class LineCompa_UC4 {
	public static void main(String[] args) {

        System.out.println("Welcome to Line Comparison Computation Program");

        // Create Points for Line 1
        Point p1 = new Point(2, 3);
        Point p2 = new Point(6, 7);

        // Create Points for Line 2
        Point p3 = new Point(1, 2);
        Point p4 = new Point(5, 6);

        // Create Line Objects
        Line line1 = new Line(p1, p2);
        Line line2 = new Line(p3, p4);

        // Calculate Lengths
        double length1 = line1.calculateLength();
        double length2 = line2.calculateLength();

        // Display Lengths
        System.out.println("\nLine 1 Length : " + length1);
        System.out.println("Line 2 Length : " + length2);

        // Check Equality
        if (line1.equals(line2)) {

            System.out.println("\nBoth Lines are Equal");

        } else {

            System.out.println("\nBoth Lines are Not Equal");
        }

        // Compare Lines
        int result = line1.compareTo(line2);

        if (result == 0) {

            System.out.println("Both Lines are Equal");

        } else if (result > 0) {

            System.out.println("Line 1 is Greater than Line 2");

        } else {

            System.out.println("Line 1 is Less than Line 2");
        }
    }
}

// Point Class
class Point {

    int x;
    int y;

    // Constructor
    Point(int x, int y) {

        this.x = x;
        this.y = y;
    }
}

// Line Class
class Line implements Comparable<Line> {

    Point startPoint;
    Point endPoint;

    // Constructor
    Line(Point startPoint, Point endPoint) {

        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    // Method to calculate line length
    public double calculateLength() {

        return Math.sqrt(
                Math.pow(endPoint.x - startPoint.x, 2)
                        + Math.pow(endPoint.y - startPoint.y, 2)
        );
    }

    // Override equals method
    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Line other = (Line) obj;

        return Double.compare(
                this.calculateLength(),
                other.calculateLength()) == 0;
    }

    // Override compareTo method
    @Override
    public int compareTo(Line other) {

        return Double.compare(
                this.calculateLength(),
                other.calculateLength());
    }
	
	

}
