package lista5;

import java.util.Scanner;

public class exercicio5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double value = 0;
        int range1 = 0;
        int range2 = 0;
        int range3 = 0;
        int range4 = 0;

        while (value >= 0) {
            System.out.println("Digite um numero:");
            value = sc.nextDouble();

            if(value >= 0 && value < 26) {
                range1++;
            } else if (value >= 26 && value < 51) {
                range2++;
            } else if (value >= 51 && value < 76) {
                range3++;
            } else if (value >= 76 && value < 101) {
                range4++;
            }
        }

        System.out.println("Numeros no intervalor [0, 25]: " + range1);
        System.out.println("Numeros no intervalo [26, 50]: " + range2);
        System.out.println("Numeros no intervalo [51, 75]: " + range3);
        System.out.println("Numeros no intervalor [76, 100]: " + range4);

    }

}
