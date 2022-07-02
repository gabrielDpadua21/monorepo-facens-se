package lista5;

import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double value;
        double sum = 0;
        int counter = 0;
        double media;

        do {

            System.out.println("Digite um numero: ");
            value = sc.nextDouble();

            if(value >= 0) {
                sum += value;
                counter++;
            }

        } while (value >= 0);

        media = sum / counter;

        System.out.println("A media dos numeros digitados e: " + media);

    }

}
