package lista2;

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
