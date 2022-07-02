package lista2;

import java.util.Scanner;


public class exercicio12 {
	
	static double valorDigitado(Scanner sc) {
		System.out.println("Digite o valor: ");
		double valor = sc.nextDouble();
		
		if(valor <= 0 ) {
			System.out.println("Valor invalido digite novamente");
			valorDigitado(sc);
		}
		
		return valor;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double salario;
		double valorEmprestimo;
		double numeroPrestacoes;
		double percenteSalario;
		double prestacoes;
		
		salario = valorDigitado(sc);
		
		valorEmprestimo = valorDigitado(sc);
		
		numeroPrestacoes = valorDigitado(sc);
		
		percenteSalario = salario * 0.30;
		
		prestacoes = valorEmprestimo / numeroPrestacoes;
		
		if(percenteSalario > prestacoes) {
			System.out.println("Não e possivel conceder o imprestimo");
		} else {
			System.out.println("Emprestimo pode ser concedido");
		}
		
		
	}

}
