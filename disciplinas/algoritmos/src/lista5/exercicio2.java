package lista5;

import java.util.Scanner;

public class exercicio2 {

    static void successMessage() {
        System.out.println("\nParabens: voto computado com sucesso\n");
        System.out.println("\nFIM\n");
    }

    static void verifyWinner(int cand1, int cand2, int cand3, int cand4) {
        if(cand1 > cand2 && cand1 > cand3 && cand1 > cand4) {
            System.out.println("Vencedor e o candidato 1");
        } else if (cand2 > cand1 && cand2 > cand3 && cand2 > cand4) {
            System.out.println("Vencedor e o candidato 2");
        } else if(cand3 > cand1 && cand3 > cand2 && cand3 > cand4) {
            System.out.println("Vencedor e o candidato 3");
        } else if(cand4 > cand1 && cand4 > cand2 && cand4 > cand3) {
            System.out.println("Vencedor e o candidato 4");
        } else {
            System.out.println("Ocorreu um empate");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cand1 = 0;
        int cand2 = 0;
        int cand3 = 0;
        int cand4 = 0;
        int nulos = 0;
        int brancos = 0;
        int total;
        String operation;

        do {

            System.out.println("URNA ELETRONICA");
            System.out.println("Escolha seu canditado: ");
            System.out.println("(1) - Candidato 1");
            System.out.println("(2) - Candidato 2");
            System.out.println("(3) - Candidato 3");
            System.out.println("(4) - Candidato 4");
            System.out.println("(5) - Votar em branco");
            System.out.println("(6) - Votar nulo");
            System.out.println("(0) - Encerrar votaçao");

            operation = sc.next();

            switch (operation) {
                case "1":
                    cand1++;
                    successMessage();
                    break;
                case "2":
                    cand2++;
                    successMessage();
                    break;
                case "3":
                    cand3++;
                    successMessage();
                    break;
                case "4":
                    cand4++;
                    successMessage();
                    break;
                case "5":
                    nulos++;
                    successMessage();
                    break;
                case "6":
                    brancos++;
                    successMessage();
                    break;
                case "0":
                    System.out.println("\nEleiçao finalizada, veja o resultado a seguir\n");
                    break;
                default:
                    System.out.println("\nopçao invalida, digite novamente\n");
                    break;

            }

        } while (!operation.equals("0"));

        total = cand1 + cand2 + cand3 + cand3 + cand4 + nulos + brancos;

        System.out.println("\n\nRESULTADO\n\n");
        System.out.println("Candidato 1: (" + cand1 + ") votos, Porcentagem: " + (100*cand1/total) + "%");
        System.out.println("Candidato 2: (" + cand2 + ") votos, Porcentagem: " + (100*cand2/total) + "%");
        System.out.println("Candidato 3: (" + cand3 + ") votos, Porcentagem: " + (100*cand3/total) + "%");
        System.out.println("Candidato 4: (" + cand4 + ") votos, Porcentagem: " + (100*cand4/total) + "%");
        System.out.println("Nulos: (" + nulos + ") votos, Porcentagem: " + (100*nulos/total) + "%");
        System.out.println("Brancos: (" + brancos+ ") votos, Porcentagem: " + (100*brancos/total) + "%");
        System.out.println("Total: (" + total + ") votos");

        verifyWinner(cand1, cand2, cand3, cand4);

    }

}
