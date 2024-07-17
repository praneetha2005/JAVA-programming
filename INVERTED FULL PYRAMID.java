import java.util.Scanner;

class InvertedFullPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height of the inverted pyramid: ");
        int height = scanner.nextInt();

        for (int i = height; i >= 1; i--) {
            System.out.println(" ".repeat(height - i) + "*".repeat(2 * i - 1));
        }

        scanner.close();
    }
}