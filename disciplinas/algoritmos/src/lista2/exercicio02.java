package lista2;

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
