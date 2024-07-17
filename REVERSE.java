import java.util.Scanner;

class ReverseWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word to reverse: ");
        String word = scanner.nextLine();

        String reversedWord = new StringBuilder(word).reverse().toString();

        System.out.println("Reversed word: " + reversedWord);
    }
}
