package lista3;

import java.util.Scanner;

public class exercicio05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double number;
        double sum = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um numero: ");
            number = sc.nextDouble();

            sum += number;
        }

        System.out.println("A soma e: " + sum);

    }

}
