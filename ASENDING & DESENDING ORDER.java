import java.util.*;

class NameSorter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input names
        System.out.println("Enter names separated by spaces:");
        String[] names = scanner.nextLine().split("\\s+");

        // Input order choice
        System.out.print("Order (A for Ascending, D for Descending): ");
        char order = scanner.next().charAt(0);

        // Sort names based on order choice
        Arrays.sort(names, (a, b) -> order == 'A' || order == 'a' ? a.compareTo(b) : b.compareTo(a));

        // Print sorted names
        System.out.println("Sorted Names:");
        Arrays.stream(names).forEach(System.out::println);

        scanner.close();
    }
}
