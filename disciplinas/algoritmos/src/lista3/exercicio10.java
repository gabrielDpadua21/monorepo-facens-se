package lista3;

import java.util.Scanner;

public class exercicio10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double number;
        double sum = 0;

        for (int i = 0; i < 20; i++) {
            System.out.println("Digite um numero: ");
            number = sc.nextDouble();

            if(number < 0 || number > 100) {
               continue;
            }

            sum += 1;
        }

        System.out.println("Foram digitados " + sum + " numeros entre 0 e 100");

    }

}
