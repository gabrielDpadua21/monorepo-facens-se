package lista2;

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
