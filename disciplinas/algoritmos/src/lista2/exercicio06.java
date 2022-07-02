package lista2;

import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double notas;
		double soma = 0;
		double somaPesos = 0;
		double media;
		double pesos;
		int i;
		
		for(i = 0; i < 4; i++) {
			System.out.println("Digite a nota " + (i + 1) + " do aluno");
			notas = sc.nextDouble();
			
			if(notas < 0 || notas > 10) {
				i--;
				continue;
			}
			
			System.out.println("Digite o peso da nota " + (i + 1) + " do aluno");
			pesos = sc.nextDouble();
			
			soma += notas * pesos;
			somaPesos += pesos;
		}
		
		media = soma / somaPesos;
				
		System.out.println("A media do aluno é: " + media);
		
		
		if(media >= 7) {
			System.out.println("ALUNO APROVADO");
		} else if(media < 7 && media >= 5) {
			System.out.println("ALUNO DE EXAME FINAL");
		}
		else {
			System.out.println("ALUNO REPROVADO");
		}

	}

}
