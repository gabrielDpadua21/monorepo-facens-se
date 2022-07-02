package lista6;

import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] values = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um numero");
            values[i] = sc.nextInt();
        }

        for (int j = values.length - 1; j >= 0; j--) {
            System.out.println(values[j]);
        }

    }

}
