package challenges;

import java.util.Scanner;

public class UpperLowerCase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int maskUpper = 0b1011111;
        int maskLower = 0b0100000;

        System.out.println("Digite um letra: ");
        char letter = sc.next().charAt(0);

        int upper = letter & maskUpper;
        int lower = letter | maskLower;

        System.out.println("Caractere Maisculo: " + (char)upper);
        System.out.println("Caractere Minusculo: " + (char)lower);

    }

}
