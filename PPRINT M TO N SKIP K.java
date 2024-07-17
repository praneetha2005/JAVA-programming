import java.util.Scanner;

class SkipNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter M, N, K: ");
        String[] inputs = scanner.nextLine().split(",");
        int M = Integer.parseInt(inputs[0].trim()), N = Integer.parseInt(inputs[1].trim()), K = Integer.parseInt(inputs[2].trim());
        for (int i = M; i <= N; i += K + 1) {
            System.out.print(i + (i + K + 1 <= N ? ", " : ""));
        }
        scanner.close();
    }
}
