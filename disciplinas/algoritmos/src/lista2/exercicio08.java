package lista2;

import java.util.Scanner;

public class exercicio08 {
	
	static void convertCelToFire(double temp) {
		double fire = (temp * 9 / 5) + 32;
		
		System.out.println("A Temperatura em Fihrenheit: " + fire);
	}
	
	static void convertFireToCel(double temp) {
		double celsius = (temp - 32) * 5 / 9;
		
		System.out.println("A Temperatura em Cesius: " + celsius);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int op;
		double temperatura;
		
		
		System.out.println("Qual opção de conversão voĉe deseja: ");
		System.out.println("1 - Celsius para Fihrenheit");
		System.out.println("2 - Fihrenheit para Celsius");
		
		op = sc.nextInt();
		
		System.out.println("Digite a temperatura: ");
		temperatura = sc.nextDouble();
		
		if(op == 1) {
			convertCelToFire(temperatura);
		} else if(op == 2) {
			convertFireToCel(temperatura);
		} else {
			System.out.println("Opção invalida");
		}

	}

}
