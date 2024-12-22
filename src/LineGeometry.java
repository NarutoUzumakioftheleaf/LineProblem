
    import java.util.Scanner;

    public class LineGeometry {
        // Method to calculate the length of the line
        public static double calculateLineLength(double x1, double y1, double x2, double y2) {
            return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input for the first point
            System.out.println("Enter the coordinates of the first point (x1, y1): ");
            System.out.print("x1: ");
            double x1 = scanner.nextDouble();
            System.out.print("y1: ");
            double y1 = scanner.nextDouble();

            // Input for the second point
            System.out.println("Enter the coordinates of the second point (x2, y2): ");
            System.out.print("x2: ");
            double x2 = scanner.nextDouble();
            System.out.print("y2: ");
            double y2 = scanner.nextDouble();
            System.out.println("Enter the coordinates of the second line:");
            System.out.print("x1: ");
            double x3 = scanner.nextDouble();
            System.out.print("y1: ");
            double y3 = scanner.nextDouble();
            System.out.print("x2: ");
            double x4 = scanner.nextDouble();
            System.out.print("y2: ");
            double y4 = scanner.nextDouble();
            double length1 = calculateLineLength(x1, y1, x2, y2);
            double length2 = calculateLineLength(x3, y3, x4, y4);

            // Calculate the length of the line


            // Output the result
            System.out.printf("The length of the line between points (%.2f, %.2f) and (%.2f, %.2f) is: %.2f%n", x1, y1, x2, y2, length1);
            System.out.printf("The length of the line between points (%.2f, %.2f) and (%.2f, %.2f) is: %.2f%n", x3, y3, x4, y4, length1);
            LineEquality l=new LineEquality();
            l.checkEquality(length1,length2);
            scanner.close();
        }
    }


