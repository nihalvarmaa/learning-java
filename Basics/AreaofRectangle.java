import java.util.Scanner;

public class AreaofRectangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length of rectangle (in cm): ");
        double length = scanner.nextDouble();

        System.out.print("Enter breadth of rectangle (in cm): ");
        double breadth = scanner.nextDouble();

        double area = length * breadth;
        System.out.println("Area of rectangle: " + area + " cm².");

        scanner.close();

    }
}
