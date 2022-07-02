package lista6;

import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] values = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um numero");
            values[i] = sc.nextInt();
        }

        for (int value: values) {
            System.out.println(value);
        }

    }

}
