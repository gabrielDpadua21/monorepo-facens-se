package lista4;

import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double number;
        int counterOne = 0;
        int counterTwo = 0;
        int counterThree = 0;

        for (int i = 0; i < 20; i++) {

            System.out.println("Digite um numero: ");
            number = sc.nextDouble();

            if(number > 200) {
                counterOne++;
            } else if(number > 100) {
                counterTwo++;
            } else {
                counterThree++;
            }

        }

        System.out.println("Existem: " + counterOne + " numero maiores que 200");

        System.out.println("Existem: " + counterTwo + " numeros maiores que 100 e menores que 200");

        System.out.println("Existem: " + counterThree + " numeros maiores que 0 e menores que 100");

    }

}
