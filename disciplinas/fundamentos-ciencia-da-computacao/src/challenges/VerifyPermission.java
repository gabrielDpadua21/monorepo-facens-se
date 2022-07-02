package challenges;

import java.util.Scanner;

public class VerifyPermission {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int value = sc.nextInt();

        int mask = 0b0010;

        int permission = value & mask;

        System.out.println("Permission: " + permission);

        if (permission > 0) {
            System.out.println("Voce tem permissao de leitura");
        }

    }

}
