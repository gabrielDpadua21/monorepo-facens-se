package lista2;

import java.util.Scanner;

public class exercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double valorGasto;
		double valorPorKw = 998.0 / 7.0;
		double valorCalculado;
			
		System.out.println("Digite o valor gasto em KW: ");
		valorGasto = sc.nextDouble();
		
		valorCalculado = (valorGasto * valorPorKw) / 100.0; 
		
		System.out.println("Valor calculado: " + valorCalculado);
		

	}

}
