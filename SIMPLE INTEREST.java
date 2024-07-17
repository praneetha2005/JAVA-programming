import java.util.Scanner;

class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get inputs from the user
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();
        System.out.print("Is customer senior citizen (y/n): ");
        double rate = (scanner.next().charAt(0) == 'y') ? 0.12 : 0.10;

        // Calculate and display the interest
        System.out.println("Interest: " + (principal * rate * years));
        scanner.close();
    }
}
