package lista2;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double num1;
		double num2;
		double num3;
		double maior;
		double menor;
		
		System.out.println("Digite tres numeros: ");
		num1 = sc.nextDouble();
		num2 = sc.nextDouble();
		num3 = sc.nextDouble();
		
		maior = num1;
		
		if(num2 > maior) {
			maior = num2;
		} 
		
		if(num3 > maior) {
			maior = num3;
		}
		
		menor = num1;
	
		if(num2 < maior) {
			menor = num2;
		} 
		
		if(num3 < maior) {
			menor = num3;
		}
		
		System.out.println("O maior numero e: " + maior);
		
		System.out.println("O menor numero e: " + menor);
		
	}

}
