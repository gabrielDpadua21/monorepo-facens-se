package lista2;

import java.util.Scanner;

public class exercicio15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double notas;
		double soma = 0;
		double media;
		int i;
		
		System.out.println("Digite o numero de faltas do aluno: ");
		int faltas = sc.nextInt();
		
		for(i = 0; i < 4; i++) {
			System.out.println("Digite a nota " + (i + 1) + " do aluno");
			notas = sc.nextDouble();
			
			soma += notas;
		}
		
		media = soma / i;
		
		System.out.println("A media do aluno é: " + media);
		
		if(faltas > 36 || media < 4.0) {
			System.out.println("Aluno reprovado");
		} else if (media > 4 && media < 7) {
			System.out.println("Exeme Final");
		} else {
			System.out.println("Aluno aprovado");
		}

	}

}
