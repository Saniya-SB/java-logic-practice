
import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
        str = str.replace(" ", "");
        str = str.toLowerCase();
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        if (str.equals(reverse)) {
            System.out.println("A string that you have entered is Palindrome");
        } else {
            System.out.println("A string that you have entered is not Palindrome");
        }
    }

}
