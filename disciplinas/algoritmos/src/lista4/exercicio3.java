package lista4;

import java.util.Scanner;

public class exercicio3 {

    static void getNumber(Scanner sc) {
        System.out.println("Digite o termo que deseja da sequencia de fibonaci: ");
        int term = sc.nextInt();

        if(term < 1) {
            System.out.println("Digite um numero valido > 0");
            getNumber(sc);
        }

        fibonaci(term, 0, 0, 0);
    }

    static void fibonaci(int term, int counter, int ant, int prox) {
        int aux;

        System.out.print(prox + " - ");

        if(term > counter) {
            aux = ant;
            ant = prox;
            prox += aux;

            if(prox == 0) {
                prox++;
            }

            counter++;
            fibonaci(term, counter, ant, prox);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        getNumber(sc);
    }

}
