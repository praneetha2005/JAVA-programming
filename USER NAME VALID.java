import java.util.Scanner;

class ValidateUsername {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the user name: ");
        String username1 = scanner.nextLine();
        System.out.println("Reenter the user name: ");
        String username2 = scanner.nextLine();

        System.out.println(username1.equals(username2) ? "User name is Valid" : "User name is Invalid");
    }
}
