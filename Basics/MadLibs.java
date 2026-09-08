import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter adjective: ");
        String adj = scanner.nextLine();

        System.out.print("Enter noun: ");
        String noun = scanner.nextLine();

        System.out.print("Enter adverb (ending in ly): ");
        String adverb = scanner.nextLine();

        System.out.print("Enter a verb (ing form): ");
        String verb = scanner.nextLine();

        System.out.println("The boy is " + verb + " " + adverb + " in the " + adj + " " + noun+".");

        scanner.close();
    }
}