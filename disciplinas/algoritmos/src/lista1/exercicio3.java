package lista1;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		double altura;
		double largura;
		double area;
		
		System.out.println("Digite o valor da altura do retangulo: ");
		altura = sc.nextDouble();
		
		System.out.println("Digite o valor da lagura do retangulo: ");
		largura = sc.nextDouble();
		
		area = altura * largura;
		
		System.out.println("A largura do retangulo e: " + area);
		
	}

}
