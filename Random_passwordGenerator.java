import java.util.Random;
import java.util.Scanner;

public class Random_passwordGenerator {
    public static void main(String[] args) {
        /* generates a random password generator */
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String num = "0123456789";
        String specialchar = "<>,.?/}]{[()]}+_-*&^%$#@!=";
        String combo = upper + lower + num + specialchar;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your Password Size : ");
        int len = scn.nextInt();

        char[] password = new char[100];
        Random rnd = new Random();
        /* for random password length */
        for (int i = 0; i < len; i++) {
            password[i] = combo.charAt(rnd.nextInt(combo.length()));

        }
        /* to print the our generates password */
        System.out.println("The random Generates Password is : " + new String(password));
        scn.close();

    }
}
