import java.util.Scanner;

class EvenSumFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();
        int a = 0, b = 1, sum = 0;
        for (int i = 0; i <= 2 * n; i++) {
            if (i % 2 == 0) sum += a;
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println("Sum of numbers at even indexes: " + sum);
        scanner.close();
    }
}
