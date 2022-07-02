package lista4;

import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int interations;
        double number;
        double sum = 0;

        System.out.println("Digite o numero de valores a serem digitados: ");
        interations = sc.nextInt();

        for (int i = 0; i < interations; i++) {
            System.out.println("Digite um numero: ");
            number = sc.nextDouble();

            if(number < 0) {
                break;
            }

            sum += number;
        }

        System.out.println("A soma dos numeros e: " + sum);

    }

}
