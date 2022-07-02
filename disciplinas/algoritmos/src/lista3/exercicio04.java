package lista3;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String name = sc.next();

        System.out.println("Digite um numero: ");
        int number = sc.nextInt();

        for (int i = 0; i < number; i++) {
            System.out.println(name);
        }

    }
}
