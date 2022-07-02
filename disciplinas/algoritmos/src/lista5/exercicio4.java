package lista5;

import java.util.Scanner;

public class exercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double value;
        double sum = 0;
        double media;
        int counter = 0;


        do {
            System.out.println("Digite um numero: ");
            value = sc.nextDouble();

            if(value % 2 == 0 && value != 0) {
                sum += value;
                counter++;
            }

        } while(value != 0);

        // TRATAMENTO PARA DIVISAO POR ZERO ...
        counter = counter == 0 ? 1 : counter;

        media = sum / counter;

        System.out.println("A media dos numeros pares digitados e: " + media);

    }

}
