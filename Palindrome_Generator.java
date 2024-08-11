import java.util.Scanner;

public class Palindrome_Generator {
    public static void main(String[] args) {
        /* this is the palindrome checker */
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your String Value : ");
        String str = scn.nextLine();
        System.out.println(isPalindrome(str));
        scn.close();

    }

    public static boolean isPalindrome(String name) {
        String n = name.replaceAll("[^a-zA-Z-9]", "").toLowerCase();
        /* check the n String equal to its reverse */
        int num = n.length();
        for (int i = 0; i < num / 2; i++) {
            if (n.charAt(i) != n.charAt(num - i - 1)) {
                return false;

            }
        }
        return true;
    }
}
