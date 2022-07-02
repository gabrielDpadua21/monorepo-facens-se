package lista6;

import java.util.Scanner;

public class exercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] values = new int[5];
        int soma = 0;
        int mult = 1;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um numero");
            values[i] = sc.nextInt();
            soma+= values[i];
            mult*= values[i];
        }

        for (int value: values) {
            System.out.println(value);
        }

        System.out.println("SOMA:");
        System.out.println(soma);
        System.out.println("MULTIPLICACAO");
        System.out.println(mult);

    }

}
