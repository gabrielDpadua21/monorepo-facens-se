## Lista de exercicios 06

## Exercicio 01

```java
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
```

## Exercicio 02

```java
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
```

## Exercicio 03

```java
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
```

## Exercicio 04

```java
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
```

## Exercicio 05

```java
package lista6;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicio5 {

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
```

## Exercicio 06

```java
package lista6;

import java.util.Scanner;

public class exercicio6 {

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
```

By Gabriel D. Pádua