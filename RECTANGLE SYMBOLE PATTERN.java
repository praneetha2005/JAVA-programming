import java.util.Scanner;

class RectanglePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the symbol: ");
        String symbol = scanner.next();
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        for (int i = 0; i < rows; i++)
            System.out.println(symbol.repeat(columns));

        scanner.close();
    }
}