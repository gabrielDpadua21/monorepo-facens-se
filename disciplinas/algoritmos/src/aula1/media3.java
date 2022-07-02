package aula1;

import java.util.Scanner;

public class media3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numNotas;
		float nota;
		float soma = 0;
		float media;
		String name;
		
		System.out.println("Digite o nome do aluno");
		name = sc.next();
		
		System.out.println("Digite o numero de notas a serem digitadas: ");
		numNotas = sc.nextInt();
		
		for(int i = 0; i < numNotas; i++) {
			System.out.println("Digite a nota " + (i+1) + " do aluno " + name);
			nota = sc.nextFloat();
			soma += nota;
		}
		
		media = soma / numNotas;
		
		System.out.println("A media das notas do aluno " + name + " é: " + media);

	}

}
