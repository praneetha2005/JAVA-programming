import java.util.Scanner;

class HollowSquarePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter the size of the square: ");
        int size = scanner.nextInt();

        // Print the hollow square pattern
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print((i == 1 || i == size || j == 1 || j == size) ? "$" : " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}