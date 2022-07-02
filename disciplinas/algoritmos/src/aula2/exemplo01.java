package aula2;

import java.util.Scanner;

public class exemplo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// EXEMPLO COM IF ...
		
		double saldo = 1000;
		
		verificaSaldo(saldo);
	
	}
	
	static double verificaSaldo(double saldo) {
		Scanner sc = new Scanner(System.in);
		double valor;
		
		System.out.println("Digite o valor que deseja sacar");
		valor = sc.nextDouble(); 
		
		if(valor > saldo) {
			System.out.println("Saldo insuficiente para realizar a transação");
			return -1;
		} else {
			saldo -= valor;
			System.out.println("Valor sacado: " + valor);
			System.out.println("Saldo atual: " + saldo);
		}
		
		if(saldo > 0) {
			verificaSaldo(saldo);
		}
		
		return 0;
	}
	
}
