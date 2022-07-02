package lista1;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		double celsius, fire;
		
		System.out.println("Digite a temperatura em celsius");
		celsius = sc.nextDouble();
		
		fire = (celsius * 9 / 5) + 32;
		
		System.out.println("A temperatura em fahrenheit: " + fire);
		
	}

}
