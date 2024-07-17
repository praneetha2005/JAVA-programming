import java.util.Scanner;

class NumberPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter the number to be printed: ");
        int numToPrint = scanner.nextInt();
        System.out.print("Max Number of times printed: ");
        int maxPrint = scanner.nextInt();

        // Print the pattern
        for (int i = 1; i <= maxPrint * 2 - 1; i++) {
            int timesToPrint = i <= maxPrint ? i : maxPrint * 2 - i;
            for (int j = 0; j < timesToPrint; j++) {
                System.out.print(numToPrint);
            }
            System.out.println();
        }

        scanner.close();
    }
}
