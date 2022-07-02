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
