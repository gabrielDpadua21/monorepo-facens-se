## Lista de exercicios 02 - Estruturas IF ELSE

## Exercicio 01

```java
import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int number;
		
		System.out.println("Digite um numero");
		number = sc.nextInt();
		
		if(number >= 100 && number <= 200) {
			System.out.println("Você digitou um numero na faixa de 100 a 200");
			return;
		} 
		
		System.out.println("Voce digitou um numero fora da faixa");

	}

}
```

## Exercicio 02

```java
import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int number;
		
		System.out.println("Digite um numero");
		number = sc.nextInt();
		
		if(number < 3 || number > 25) {
			System.out.println("Numero é menor que 3 ou maior que 25");
		}

	}

}
```

## Exercicio 03

```java
import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double notas;
		double soma = 0;
		double media;
		int i;
		
		for(i = 0; i < 3; i++) {
			System.out.println("Digite a nota " + (i + 1) + " do aluno");
			notas = sc.nextDouble();
			
			soma += notas;
		}
		
		media = soma / i;
		
		System.out.println("A media do aluno é: " + media);
		
		if(media >= 7) {
			System.out.println("APROVADO");
		} else {
			System.out.println("REPROVADO");
		}

	}

}
```

## Exercicio 04

```java
import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double notas;
		double soma = 0;
		double media;
		int i;
		
		for(i = 0; i < 4; i++) {
			System.out.println("Digite a nota " + (i + 1) + " do aluno");
			notas = sc.nextDouble();
			
			soma += notas;
		}
		
		media = soma / i;
		
		System.out.println("A media do aluno é: " + media);
		
		if(media >= 7) {
			System.out.println("ALUNO APROVADO");
		} else if(media < 7 && media >= 5) {
			System.out.println("ALUNO DE EXAME FINAL");
		}
		else {
			System.out.println("ALUNO REPROVADO");
		}

	}

}
```

## Exercicio 05

```java
import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double notas;
		double soma = 0;
		double media;
		int i;
		
		for(i = 0; i < 4; i++) {
			System.out.println("Digite a nota " + (i + 1) + " do aluno");
			notas = sc.nextDouble();
			
			if(notas < 0 || notas > 10) {
				i--;
				continue;
			}
			
			soma += notas;
		}
		
		media = soma / i;
		
		System.out.println("A media do aluno é: " + media);
		
		if(media >= 7) {
			System.out.println("ALUNO APROVADO");
		} else if(media < 7 && media >= 5) {
			System.out.println("ALUNO DE EXAME FINAL");
		}
		else {
			System.out.println("ALUNO REPROVADO");
		}

	}

}

```

## Exercicio 06

```java
import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double notas;
		double soma = 0;
		double somaPesos = 0;
		double media;
		double pesos;
		int i;
		
		for(i = 0; i < 4; i++) {
			System.out.println("Digite a nota " + (i + 1) + " do aluno");
			notas = sc.nextDouble();
			
			if(notas < 0 || notas > 10) {
				i--;
				continue;
			}
			
			System.out.println("Digite o peso da nota " + (i + 1) + " do aluno");
			pesos = sc.nextDouble();
			
			soma += notas * pesos;
			somaPesos += pesos;
		}
		
		media = soma / somaPesos;
				
		System.out.println("A media do aluno é: " + media);
		
		
		if(media >= 7) {
			System.out.println("ALUNO APROVADO");
		} else if(media < 7 && media >= 5) {
			System.out.println("ALUNO DE EXAME FINAL");
		}
		else {
			System.out.println("ALUNO REPROVADO");
		}

	}

}

```

## Exercicio 07
```java
import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double oneReal;
		double fifitCent;
		double twentyFiveCents;
		double tenCents;
		double fiveCents;
		double oneCent;
		double valor;
		double soma;
		
		System.out.println("Digite a quantidade de moedas de 1 real");
		oneReal = sc.nextInt();
		
		System.out.println("Digite a quantidade de moedas de 50 centavos");
		fifitCent = sc.nextInt();
		fifitCent *= 0.5; 
		
		System.out.println("Digite a quantidade de moedas de 25 centavos");
		twentyFiveCents = sc.nextInt();
		twentyFiveCents *= 0.25;
		
		System.out.println("Digite a quantidade de moedas de 10 centavos");
		tenCents = sc.nextInt();
		tenCents *= 0.10;
		
		System.out.println("Digite a quantidade de moedas de 5 centavos");
		fiveCents = sc.nextInt();
		fiveCents *= 0.05;
		
		System.out.println("Digite a quantidade de moedas de 1 centavo");
		oneCent = sc.nextInt();
		oneCent *= 0.01;
		
		soma = oneReal + fifitCent + twentyFiveCents + tenCents + fiveCents + oneCent;
		
		System.out.println("Digite o valor do produto");
		valor = sc.nextDouble();
		
		System.out.println("Valor no cofre: " + soma);
		System.out.println("Preco do produto: " + valor);
		
		if(soma > valor) {
			System.out.println("Valor é suficiente para comprar o produto");
		} else {
			System.out.println("Valor não é suficiente para comprar o produto");
		}
		
	}

}
```

## Exercicio 08
```java
import java.util.Scanner;

public class exercicio08 {
	
	static void convertCelToFire(double temp) {
		double fire = (temp * 9 / 5) + 32;
		
		System.out.println("A Temperatura em Fihrenheit: " + fire);
	}
	
	static void convertFireToCel(double temp) {
		double celsius = (temp - 32) * 5 / 9;
		
		System.out.println("A Temperatura em Cesius: " + celsius);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int op;
		double temperatura;
		
		
		System.out.println("Qual opção de conversão voĉe deseja: ");
		System.out.println("1 - Celsius para Fihrenheit");
		System.out.println("2 - Fihrenheit para Celsius");
		
		op = sc.nextInt();
		
		System.out.println("Digite a temperatura: ");
		temperatura = sc.nextDouble();
		
		if(op == 1) {
			convertCelToFire(temperatura);
		} else if(op == 2) {
			convertFireToCel(temperatura);
		} else {
			System.out.println("Opção invalida");
		}

	}

}

```

## Exercicio 09
```java
import java.util.Scanner;

public class exercicio09 {

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

## Exercicio 10

```java
import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double num1;
		double num2;
		double num3;
		double maior;
		double menor;
		
		System.out.println("Digite tres numeros: ");
		num1 = sc.nextDouble();
		num2 = sc.nextDouble();
		num3 = sc.nextDouble();
		
		maior = num1;
		
		if(num2 > maior) {
			maior = num2;
		} 
		
		if(num3 > maior) {
			maior = num3;
		}
		
		menor = num1;
	
		if(num2 < maior) {
			menor = num2;
		} 
		
		if(num3 < maior) {
			menor = num3;
		}
		
		System.out.println("O maior numero e: " + maior);
		
		System.out.println("O menor numero e: " + menor);
		
	}

}

```


## Exercicio 11

```java
import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double num1;
		double num2;
		double soma;
		
		System.out.println("Digite dois numeros: ");
		num1 = sc.nextDouble();
		num2 = sc.nextDouble();
		
		soma = num1 + num2;
		
		if(soma > 20) {
			System.out.println(soma + 8);
		} else {
			System.out.println(soma - 8);
		}

	}

}
```

## Exercicio 12

```java
import java.util.Scanner;


public class exercicio12 {
	
	static double valorDigitado(Scanner sc) {
		System.out.println("Digite o valor: ");
		double valor = sc.nextDouble();
		
		if(valor <= 0 ) {
			System.out.println("Valor invalido digite novamente");
			valorDigitado(sc);
		}
		
		return valor;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double salario;
		double valorEmprestimo;
		double numeroPrestacoes;
		double percenteSalario;
		double prestacoes;
		
		salario = valorDigitado(sc);
		
		valorEmprestimo = valorDigitado(sc);
		
		numeroPrestacoes = valorDigitado(sc);
		
		percenteSalario = salario * 0.30;
		
		prestacoes = valorEmprestimo / numeroPrestacoes;
		
		if(percenteSalario > prestacoes) {
			System.out.println("Não e possivel conceder o imprestimo");
		} else {
			System.out.println("Emprestimo pode ser concedido");
		}
		
		
	}

}

```

## Exercicio 13

```java
import java.util.Scanner;

public class exercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		double valorVenda;
		
		System.out.println("Digite o valor do produto: ");
		double valor = sc.nextDouble();
		
		
		if(valor >= 20) {
			valorVenda = valor + (valor * 0.45);
			
			System.out.println("Valor de venda e de: " + valorVenda);
		} else {
			valorVenda = valor + (valor * 0.30);
			
			System.out.println("Valor de venda e de: " + valorVenda);
		}	
		
	}

}
```

## Exercicio 14

```java
import java.util.Scanner;

public class exercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double valorGasto;
		double valorPorKw = 998.0 / 7.0;
		double valorCalculado;
			
		System.out.println("Digite o valor gasto em KW: ");
		valorGasto = sc.nextDouble();
		
		valorCalculado = (valorGasto * valorPorKw) / 100.0; 
		
		System.out.println("Valor calculado: " + valorCalculado);
		

	}

}
```

## Exercicio 15

```java
import java.util.Scanner;

public class exercicio15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double notas;
		double soma = 0;
		double media;
		int i;
		
		System.out.println("Digite o numero de faltas do aluno: ");
		int faltas = sc.nextInt();
		
		for(i = 0; i < 4; i++) {
			System.out.println("Digite a nota " + (i + 1) + " do aluno");
			notas = sc.nextDouble();
			
			soma += notas;
		}
		
		media = soma / i;
		
		System.out.println("A media do aluno é: " + media);
		
		if(faltas > 36 || media < 4.0) {
			System.out.println("Aluno reprovado");
		} else if (media > 4 && media < 7) {
			System.out.println("Exeme Final");
		} else {
			System.out.println("Aluno aprovado");
		}

	}

}

```

By Gabriel De Pádua
