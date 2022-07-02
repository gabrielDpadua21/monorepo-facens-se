package lista3;

import java.util.Scanner;

public class exercicio08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ages;
        int sum = 0;

        for (int i = 0; i < 20; i++) {
            System.out.println("Digite a idade da pessoa: " + (i + 1));
            ages = sc.nextInt();

            if(ages >= 18) {
                sum += 1;
            }

        }

        System.out.println("Existem " + sum + " maiores de idade.");
    }

}
