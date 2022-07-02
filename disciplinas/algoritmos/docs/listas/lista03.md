## Lista de exercicios 03

## Exercicio 01

```java
package lista3;

public class exercicio01 {

    public static void main(String[] args) {

        for(int i = 0; i < 20; i++) {
            System.out.println("Eu gosto de estudar algoritimos");
        }

    }

}
```

## Exercicio 02

```java
package lista3;

public class exercicio02 {

    public static void main(String[] args) {

        int soma = 0;

        for(int i = 0; i < 16; i++) {
            soma += i;
        }

        System.out.println("A soma dos numeros e: " + soma);

    }

}
```

## Exercicio 03

```java
package lista3;

import java.util.Scanner;

public class exercicio03 {

    // TODO Auto-generated method stub

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String name = sc.next();

        for (int i = 0; i < 10; i++) {
            System.out.println(name);
        }


    }
}
```

## Exercicio 04

```java
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
```

## Exercicio 05

```java
package lista3;

import java.util.Scanner;

public class exercicio05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double number;
        double sum = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um numero: ");
            number = sc.nextDouble();

            sum += number;
        }

        System.out.println("A soma e: " + sum);

    }

}
```

## Exercicio 06

```java
package lista3;

import java.util.Scanner;

public class exercicio06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ages;
        int sum = 0;

        for (int i = 0; i < 20; i++) {
            System.out.println("Digite a idade da pessoa: " + (i + 1));
            ages = sc.nextInt();

            sum += ages;
        }

        System.out.println("A soma e: " + sum);
    }

}
```

## Exercicio 07

```java
package lista3;

import java.util.Scanner;

public class exercicio07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ages;
        int sum = 0;
        double media;
        int i;

        for (i = 0; i < 20; i++) {
            System.out.println("Digite a idade da pessoa: " + (i + 1));
            ages = sc.nextInt();

            sum += ages;
        }

        media = sum / i;

        System.out.println("A media das idades e: " + media);
    }

}
```

## Exercicio 08

```java
package lista3;

import java.util.Scanner;

public class exercicio08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ages;
        int sum = 0;

        for (int i = 0; i < 20; i++) {
            System.out.println("Digite a idade da pessoa: " + (i + 1));
            ages = sc.nextInt();

            if(ages >= 18) {
                sum += 1;
            }

        }

        System.out.println("Existem " + sum + " maiores de idade.");
    }

}
```

## Exercicio 09

```java
package lista3;

import java.util.Scanner;

public class exercicio09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double number;
        double sum = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um numero: ");
            number = sc.nextDouble();

            if(number % 2 == 0) {
                sum += 1;
            }

        }

        System.out.println("Foram digitados " + sum + " numeros pares");

    }
}
```

## Exercicio 10

```java
package lista3;

import java.util.Scanner;

public class exercicio10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double number;
        double sum = 0;

        for (int i = 0; i < 20; i++) {
            System.out.println("Digite um numero: ");
            number = sc.nextDouble();

            if(number < 0 || number > 100) {
               continue;
            }

            sum += 1;
        }

        System.out.println("Foram digitados " + sum + " numeros entre 0 e 100");

    }

}
```

By Gabriel D. Pádua