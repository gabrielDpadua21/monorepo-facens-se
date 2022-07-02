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
