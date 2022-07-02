package lista6;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] notes = new int[4];
        int soma = 0;
        double media;

        for (int i = 0; i < 4; i++) {
            System.out.println("Digite um numero");
            notes[i] = sc.nextInt();
            soma+= notes[i];
        }

        System.out.println("NOTAS: ");

        for (int value: notes) {
            System.out.println(value);
        }

        media = soma / notes.length;

        System.out.println("MEDIA: ");
        System.out.println(media);

    }

}
