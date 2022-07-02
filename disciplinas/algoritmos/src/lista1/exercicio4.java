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
