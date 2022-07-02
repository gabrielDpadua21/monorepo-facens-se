package lista2;

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
