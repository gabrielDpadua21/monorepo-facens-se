package lista1;

import java.util.Scanner;
import java.math.*;

public class exercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, delta, x1, x2;
		
		System.out.println("Digite a variavel A da equação");
		a = sc.nextDouble();
		
		System.out.println("Digite a variavel B da equação");
		b = sc.nextDouble();

		System.out.println("Digite a variavel C da equação");
		c = sc.nextDouble();

		delta = (Math.pow(b, 2) - 4 * a * c);
		
		System.out.println("Delta: " + delta);
		
		if (delta < 0) {
			System.out.println("Não existe raizes reais para a equação");
		} else {
			x1 = (-b + Math.sqrt(delta)) / (2 * a);
			x2 = (-b - Math.sqrt(delta)) / (2 * a);
			
			System.out.println("As raizes da equação são: X1 = " + x1 + " e X2 = " + x2);
		}
		
	}

}
