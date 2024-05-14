import java.util.Scanner;

/**
 * finds the largest number of three
 * @author Suyash Patel
 */
public class WhichLargestNumber {
    /**
     * main method
     * @param args arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First number: ");
        double first = scanner.nextDouble();
        System.out.print("Second number: ");
        double second = scanner.nextDouble();
        System.out.print("Third number: ");
        double third = scanner.nextDouble();

        double largest = first;

        if (second > largest) {
            largest = second;
        }
        if (third > largest) {
            largest = third;
        }
        System.out.println("Largest number of three: " + largest);
        scanner.close();
    }
}