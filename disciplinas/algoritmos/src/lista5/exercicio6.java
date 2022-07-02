package lista5;

import java.util.Scanner;

public class exercicio6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int value;
        int sum = 0;

        do {
            System.out.println("Digite um numero inteiro: ");
            value = sc.nextInt();

            if(value < 0) {
                sum += value;
            }

        } while (value != 0);

        System.out.println("A soma dos numero negativos e: " + sum);

    }

}
