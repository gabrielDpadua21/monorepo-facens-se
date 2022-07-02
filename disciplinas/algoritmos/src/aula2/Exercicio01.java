package aula2;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double nota;
		double soma = 0;
		double media;
		int i;
		
		System.out.println("Calculando a media dos alunos");
		
		for(i = 0; i < 4; i++) {
			System.out.println("Digite a nota - " + (i+1));
			nota = sc.nextDouble();
			soma += nota;
		}
		
		
		media = soma / (i);
		
		System.out.println("Media do aluno: " + media);
		
		if(media > 8) {
			System.out.println("Aluno é especial");
		} else if(media >= 5 && media <= 8) {
			System.out.println("Aluno aprovado");
		} else {
			System.out.println("Aluno reprovado");
		}

	}

}
