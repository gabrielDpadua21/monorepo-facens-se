package lista1;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int i, valor, soma = 0, media;
		
		for(i = 0; i < 3; i++) {
			System.out.println("Digite o numero " + (i+1));
			valor = sc.nextInt();
			soma += valor;
		}
		
		media = soma / i;
		
		System.out.println("A media dos numeros é: " + media);

	}

}
