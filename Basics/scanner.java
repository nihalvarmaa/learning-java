
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        float b = scanner.nextFloat();
        double c = scanner.nextDouble();
        char d = scanner.next().charAt(0);
        scanner.nextLine();
        var e = scanner.next();
        scanner.nextLine();
        String f = scanner.nextLine();
        
        System.out.println("Integer: " + a);
        System.out.println("Float: " + b);
        System.out.println("Double: " + c);
        System.out.println("Character: " + d);
        System.out.println("Single-word String: " + e);
        System.out.println("String line: " + f);
    }
}
