package aula1;

import java.util.Scanner;

public class media2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nota;
		int soma = 0;
		int media;
		int i;
		
		for(i = 0; i < 4; i++) {
			System.out.println("Digite a nota: " + (i+1) + " do aluno");
			nota = sc.nextInt();
			
			soma += nota;
		}
		
		media = soma / i+1;
		
		System.out.println("A media das notas do aluno foi: " + media);

	}

}
