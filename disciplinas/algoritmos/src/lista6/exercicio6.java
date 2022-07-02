package lista6;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicio6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] values = new int[5];
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();


        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um numero");
            values[i] = sc.nextInt();
            if(values[i] % 2 == 0) {
                pares.add(values[i]);
            } else {
                impares.add(values[i]);
            }
        }

        System.out.println("VALORES");
        for (int value: values) {
            System.out.println(value);
        }

        System.out.println("PARES");
        pares.forEach(value->{
            System.out.println(value);
        });

        System.out.println("IMPARES");
        impares.forEach(value->{
            System.out.println(value);
        });

    }

}
