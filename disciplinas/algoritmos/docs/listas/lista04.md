## Lista de exercicios 04

## Exercicio 01

```java
package lista4;

import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int interations;
        double number;
        double sum = 0;

        System.out.println("Digite o numero de valores a serem digitados: ");
        interations = sc.nextInt();

        for (int i = 0; i < interations; i++) {
            System.out.println("Digite um numero: ");
            number = sc.nextDouble();

            if(number < 0) {
                break;
            }

            sum += number;
        }

        System.out.println("A soma dos numeros e: " + sum);

    }

}
```

## Exercicio 02

```java
package lista4;

import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double number;
        int counterOne = 0;
        int counterTwo = 0;
        int counterThree = 0;

        for (int i = 0; i < 20; i++) {

            System.out.println("Digite um numero: ");
            number = sc.nextDouble();

            if(number > 200) {
                counterOne++;
            } else if(number > 100) {
                counterTwo++;
            } else {
                counterThree++;
            }

        }

        System.out.println("Existem: " + counterOne + " numero maiores que 200");

        System.out.println("Existem: " + counterTwo + " numeros maiores que 100 e menores que 200");

        System.out.println("Existem: " + counterThree + " numeros maiores que 0 e menores que 100");

    }

}

```

## Exercicio 03

```java
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
```

## Exercicio 04

```java
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
```

By Gabriel D. Pádua