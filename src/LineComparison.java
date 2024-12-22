public class LineComparison {
    public void compare(double length1, double length2) {
        int comparisonResult = Double.valueOf(length1).compareTo(Double.valueOf(length2));

        if (comparisonResult == 0) {
            System.out.println("The two lines are equal in length.");
        } else if (comparisonResult > 0) {
            System.out.println("The first line is longer than the second line.");
        } else {
            System.out.println("The first line is shorter than the second line.");
        }
    }
}