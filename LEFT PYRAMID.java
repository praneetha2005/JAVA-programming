import java.util.Scanner;
class LeftPyramid{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height of the pyramid: ");
        int height = scanner.nextInt();

        for (int i = 1; i <= height; i++){
            System.out.println(" ".repeat(height - i) + "*".repeat(i));
        }
        scanner.close();
    }
}