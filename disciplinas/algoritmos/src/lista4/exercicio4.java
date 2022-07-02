package lista4;

import java.util.Scanner;

public class exercicio4 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        String name;
        String auxName = "";
        int age;
        int auxAge = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o nome da pessoa: ");
            name = sc.next();

            System.out.println("Digite o nome da pessoa: ");
            age = sc.nextInt();

            if(auxAge < age) {
                auxName = name;
                auxAge = age;
            }

        }

        System.out.println("A pessoa mais velha e " + auxName + " e tem " + auxAge + " anos de idade");


    }

}
