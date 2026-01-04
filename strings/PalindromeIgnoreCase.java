import java.util.Scanner;

public class PalindromeIgnoreCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        str = str.toLowerCase();

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        if (str.equals(reverse)) {
            System.out.println("Palindrome (Ignore Case)");
        } else {
            System.out.println("Not Palindrome");
        }

        sc.close();
    }
}
