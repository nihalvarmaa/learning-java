import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int a = scanner.nextInt();

        System.out.print("Enter a float: ");
        float b = scanner.nextFloat();

        System.out.print("Enter a double: ");
        double c = scanner.nextDouble();

        System.out.print("Enter a character: ");
        char d = scanner.next().charAt(0);

        System.out.println("Integer: " + a);
        System.out.println("Float: " + b);
        System.out.println("Double: " + c);
        System.out.println("Character: " + d);

        scanner.close();
    }
}