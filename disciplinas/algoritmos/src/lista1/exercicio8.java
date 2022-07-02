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
