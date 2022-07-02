package lista2;

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
