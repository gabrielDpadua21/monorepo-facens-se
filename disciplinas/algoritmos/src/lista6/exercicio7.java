package lista6;

import java.util.Scanner;

public class exercicio7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] medias = new double[3];
        double soma = 0;
        double nota;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j ++) {
                System.out.println("DIGITE A NOTA " + (j + 1) + " DO ALUNO: " + (i+1));
                nota = sc.nextDouble();
                soma+= nota;
            }

            medias[i] = soma / 4;
            soma = 0;
        }

        for (double media: medias) {
            if(media >= 7) {
                System.out.println(media);
            }
        }


    }

}
