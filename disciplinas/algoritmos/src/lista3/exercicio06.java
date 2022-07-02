package lista3;

import java.util.Scanner;

public class exercicio06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ages;
        int sum = 0;

        for (int i = 0; i < 20; i++) {
            System.out.println("Digite a idade da pessoa: " + (i + 1));
            ages = sc.nextInt();

            sum += ages;
        }

        System.out.println("A soma e: " + sum);
    }

}
