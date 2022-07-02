package lista2;

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
