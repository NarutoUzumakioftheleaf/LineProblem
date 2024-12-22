public class LineEquality{
    void checkEquality(double length1, double length2) {
        if (Double.valueOf(length1).equals(Double.valueOf(length2))) {
            System.out.println("The two lines are equal in length.");
        } else {
            System.out.println("The two lines are not equal in length.");
        }
    }
}
