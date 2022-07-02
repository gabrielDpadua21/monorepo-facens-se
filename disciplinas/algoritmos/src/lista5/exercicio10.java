package lista5;

import java.util.Scanner;

public class exercicio10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ages;
        int counterFat = 0;
        int counter = 0;
        int sumAges = 0;
        double middleAges;
        double weight;

        while (counter < 7) {
            System.out.println("Digite a idade da pessoa");
            ages = sc.nextInt();

            sumAges += ages;

            System.out.println("Digite o peso da pessoa em kg");
            weight = sc.nextDouble();

            if(weight > 90) {
                counterFat++;
            }

            counter++;
        }

        middleAges = sumAges / counter;

        System.out.println("\n=========================\n");
        System.out.println("A media das idade e: " + middleAges);
        System.out.println("A quantidade de pessoas com mais de 90kg e: " + counterFat);


    }

}
