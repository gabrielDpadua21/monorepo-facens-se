## Lista de exercicios 01

## Exercicio 01

```java
package lista1;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int var1, var2, aux;
		
		System.out.println("Digite o valor da variavel 1: ");
		var1 = sc.nextInt();
		
		System.out.println("Digite o valor da variavel 1: ");
		var2 = sc.nextInt();
		
		System.out.println("Antes da troca");
		System.out.println("Variavel 1: " + var1);
		System.out.println("Variavel 2: " + var2);
		
		aux = var1;
		var1 = var2;
		var2 = aux;
		
		System.out.println("Depois da troca");
		System.out.println("Variavel 1: " + var1);
		System.out.println("Variavel 2: " + var2);

	}

}
```

## Exercicio 02

```java
package lista1;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		double numero;
		
		System.out.println("Digite um numero: ");
		numero = sc.nextDouble();
		
		System.out.println("O dobro desse numero é: " + (numero*2));

	}

}
```

## Exercicio 03

```java
package lista1;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		double altura;
		double largura;
		double area;
		
		System.out.println("Digite o valor da altura do retangulo: ");
		altura = sc.nextDouble();
		
		System.out.println("Digite o valor da lagura do retangulo: ");
		largura = sc.nextDouble();
		
		area = altura * largura;
		
		System.out.println("A largura do retangulo e: " + area);
		
	}

}
```

## Exercicio 04

```java
package lista1;

import java.util.Scanner;

public class exercicio4 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um numero: ");
		numero = sc.nextInt();
		
		System.out.println("O antecessor do numero e: " + (numero - 1));
		
		System.out.println("O sucessor do numero e: " + (numero + 1));
		
	}

}
```

## Exercicio 05

```java
package lista1;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int i, valor, soma = 0, media;
		
		for(i = 0; i < 3; i++) {
			System.out.println("Digite o numero " + (i+1));
			valor = sc.nextInt();
			soma += valor;
		}
		
		media = soma / i;
		
		System.out.println("A media dos numeros é: " + media);

	}

}
```

## Exercicio 06

```java
package lista1;

import java.util.Scanner;
import java.math.*;

public class exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		double valor1, valor2;
		
		System.out.println("Digite um numero: ");
		valor1 = sc.nextDouble();
		
		System.out.println("Digite um numero: ");
		valor2 = sc.nextDouble();
		
		System.out.println("Soma: " + valor1 + " + " + valor2 + " = " + (valor1 + valor2));
		System.out.println("Subtração: " + valor1 + " - " + valor2 + " = " + (valor1 - valor2));
		System.out.println("Multiplicação: " + valor1 + " * " + valor2 + " = " + (valor1 * valor2));
		System.out.println("Divisão: " + valor1 + " / " + valor2 + " = " + (valor1 / valor2));
		System.out.println("Potencia: " + valor1 + " ^ " + valor2 + " = " + (Math.pow(valor1, valor2)));
		
	}

}
```

## Exercicio 07

```java
package lista1;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double valor;
		
		System.out.println("Digite um numero: ");
		valor = sc.nextDouble();
		
		if(valor % 2 == 0) {
			System.out.println("Valor é par");
		} else {
			System.out.println("Valor é impar");
		}

	}

}
```

## Exercicio 08

```java
package lista1;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		double valor;
		
		System.out.println("Digite um numero: ");
		valor = sc.nextDouble();
		
		if(valor >= 0) {
			System.out.println("Valor positivo");
		} else {
			System.out.println("Valor negativo");
		}
		
		
	}

}
```

## Exercicio 09

```java
package lista1;

import java.util.Scanner;

public class exercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		double valor;
		
		System.out.println("Digite um numero: ");
		valor = sc.nextDouble();
		
		if(valor > 10) {
			System.out.println("O valor é maior que 10");
		} else {
			System.out.println("O valor é menor que 10");
		}
		
	}

}
```

## Exercicio 10

```java
package lista1;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		double celsius, fire;
		
		System.out.println("Digite a temperatura em celsius");
		celsius = sc.nextDouble();
		
		fire = (celsius * 9 / 5) + 32;
		
		System.out.println("A temperatura em fahrenheit: " + fire);
		
	}

}
```

## Exercicio 11

```java
package lista1;

import java.util.Scanner;
import java.math.*;

public class exercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, delta, x1, x2;
		
		System.out.println("Digite a variavel A da equação");
		a = sc.nextDouble();
		
		System.out.println("Digite a variavel B da equação");
		b = sc.nextDouble();

		System.out.println("Digite a variavel C da equação");
		c = sc.nextDouble();

		delta = (Math.pow(b, 2) - 4 * a * c);
		
		System.out.println("Delta: " + delta);
		
		if (delta < 0) {
			System.out.println("Não existe raizes reais para a equação");
		} else {
			x1 = (-b + Math.sqrt(delta)) / (2 * a);
			x2 = (-b - Math.sqrt(delta)) / (2 * a);
			
			System.out.println("As raizes da equação são: X1 = " + x1 + " e X2 = " + x2);
		}
		
	}

}

```

By Gabriel De Padua