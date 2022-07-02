package lista1;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int var1, var2, aux;
		
		System.out.println("Digite o valor da variavel 1: ");
		var1 = sc.nextInt();
		
		System.out.println("Digite o valor da variavel 1: ");
		var2 = sc.nextInt();
		
		System.out.println("Antes da troca");
		System.out.println("Variavel 1: " + var1);
		System.out.println("Variavel 2: " + var2);
		
		aux = var1;
		var1 = var2;
		var2 = aux;
		
		System.out.println("Depois da troca");
		System.out.println("Variavel 1: " + var1);
		System.out.println("Variavel 2: " + var2);

	}

}
