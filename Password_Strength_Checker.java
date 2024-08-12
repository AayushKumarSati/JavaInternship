import java.util.Scanner;

public class Password_Strength_Checker {
    /* this is the Password Strength Checker project */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your Password Now : ");
        String password = scn.nextLine();
        scn.close();
        String strength = chekstrengthPassword(password);
        System.out.println(strength);

    }

    public static String chekstrengthPassword(String password) {
        int length = 8;
        boolean Uppercase = false;
        boolean lowercase = false;
        boolean digit = false;
        boolean special = false;
        String specialCharacter = "!@#$%^&*()_+{}[]|:;,.<>?~";
        // check the length of password
        if (password.length() >= length) {
            // check other
            for (char ch : password.toCharArray()) {
                if (Character.isUpperCase(ch)) {
                    Uppercase = true;

                } else if (Character.isLowerCase(ch)) {
                    lowercase = true;

                } else if (Character.isDigit(ch)) {
                    digit = true;

                } else if (specialCharacter.contains(String.valueOf(ch))) {
                    special = true;

                }
            }
            // analze the Strength of Password
            if (Uppercase && lowercase && digit && special) {
                return "This is the Very Strong Password";
            } else {
                return "it is the week password please try to Strong Password";
            }
        } else {
            return "The Password Length Must Be " + length;
        }

    }
}
