package lista5;

import java.util.Scanner;

public class exercicio7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int prod = 1;
        int value;

        do {

            System.out.println("Digite um numero inteiro: ");
            value = sc.nextInt();

            if(value > 0) {
                prod *= value;
            }

        } while (value != 0);

        System.out.println("O produto dos numero positivos e: " + prod);

    }

}
