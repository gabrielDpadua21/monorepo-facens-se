package AC2;

import javax.swing.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.*;

public class game {

    static String getWapon(int value) {
        switch(value) {
            case 1:
                return "ESPADA";
            case 2:
                return "LANCA";
            case 3:
                return "ARCO";
            case 4:
                return "VARA DE PESCAR";
            default:
                return "ERROR";
        }
    }

    static String getItem(int value) {
        switch(value) {
            case 1:
                return "POCAO DE RECUPERACAO";
            case 2:
                return "POCAO DE INVISIBILIDADE";
            case 3:
                return "ESCUDO";
            case 4:
                return "PO DE MICO";
            default:
                return "ERROR";
        }
    }

    static String getSex(int value) {
        switch(value) {
            case 1:
                return "MASCULINO";
            case 2:
                return "FEMININO";
            default:
                return "ERROR";
        }
    }

    static void cavernaAzul(Map avatar) {
        System.out.println("==============================");
        System.out.println("=    PUZZLE DO DRAGAO AZUL   =");
        System.out.println("==============================");

        System.out.println("VOCE ESTA NA CAVERNA DO DRAGAO AZUL " + avatar.get("name"));
        System.out.println("USE SUA " + avatar.get("arma") + " E SUA INTELIGENCIA PARA SAIR E AVANÇAR PARA PROXIMA CAVERNA");
        System.out.println("RESOLVA O PROBLEMA: ");
        Random gerador = new Random();
        Scanner sc = new Scanner(System.in);
        int x = gerador.nextInt(1000);
        int y = gerador.nextInt(1000);
        double result;

        System.out.println(x + " + " + y);
        System.out.println("VOCE TEM 3 CHANCES");
        int count = 0;

        do {
            System.out.println((count + 1) + " TENTATIVA");
            result = sc.nextDouble();
            if(result == (x + y)) {
                break;
            }
            count++;
        } while (count < 3);

        if(result != (x + y)) {
            System.out.println("AHHHHHHHHHHH");
            System.out.println("VOCE FOI DERROTADO PELO DRAGAO AZUL");
            System.out.println("MAIS SORTE NA PROXIMA");
            endGame(false);
        }

        cavernaAmarela(avatar);
    }

    static void cavernaVerde(Map avatar) {
        System.out.println("==============================");
        System.out.println("=  PUZZLE DO DRAGAO VERDE    =");
        System.out.println("==============================");

        System.out.println("VOCE ESTA NA CAVERNA DO DRAGAO VERDE " + avatar.get("name"));
        System.out.println("USE SUA " + avatar.get("arma") + " E SUA INTELIGENCIA PARA SAIR E AVANÇAR PARA PROXIMA CAVERNA");
        System.out.println("RESOLVA O PROBLEMA: ");
        Random gerador = new Random();
        Scanner sc = new Scanner(System.in);
        int x = gerador.nextInt(1000);
        int y = gerador.nextInt(1000);
        double result;

        System.out.println(x + " - " + y);
        System.out.println("VOCE TEM 3 CHANCES");
        int count = 0;

        do {
            System.out.println((count + 1) + " TENTATIVA");
            result = sc.nextDouble();
            if(result == (x - y)) {
                break;
            }
            count++;
        } while (count < 3);

        if(result != (x - y)) {
            System.out.println("AHHHHHHHHHHH");
            System.out.println("VOCE FOI DERROTADO PELO DRAGAO VERDE");
            System.out.println("MAIS SORTE NA PROXIMA");
            endGame(false);
        }

        cavernaVermelha(avatar);
    }

    static void cavernaAmarela(Map avatar)  {
        System.out.println("==============================");
        System.out.println("=  PUZZLE DO DRAGAO AMARELO  =");
        System.out.println("==============================");

        System.out.println("VOCE ESTA NA CAVERNA DO DRAGAO AMARELO " + avatar.get("name"));
        System.out.println("USE SUA " + avatar.get("arma") + " E SUA INTELIGENCIA PARA SAIR E AVANÇAR PARA PROXIMA CAVERNA");
        System.out.println("RESOLVA O PROBLEMA: ");
        Random gerador = new Random();
        Scanner sc = new Scanner(System.in);
        int x = gerador.nextInt(100);
        int y = gerador.nextInt(100);
        double result;

        System.out.println(x + " * " + y);
        System.out.println("VOCE TEM 3 CHANCES");
        int count = 0;

        do {
            System.out.println((count + 1) + " TENTATIVA");
            result = sc.nextDouble();
            if(result == (y * x)) {
                break;
            }
            count++;
        } while (count < 3);

        if(result != (x * y)) {
            System.out.println("AHHHHHHHHHHH");
            System.out.println("VOCE FOI DERROTADO PELO DRAGAO AMARELO");
            System.out.println("MAIS SORTE NA PROXIMA");
            endGame(false);
        }

        cavernaFinal(avatar);
    }

    static void cavernaVermelha(Map avatar) {
        System.out.println("==============================");
        System.out.println("=  PUZZLE DO DRAGAO VERMELHO =");
        System.out.println("==============================");

        System.out.println("VOCE ESTA NA CAVERNA DO DRAGAO VERMELHO + " + avatar.get("name"));
        System.out.println("USE SUA " + avatar.get("arma") + " E SUA INTELIGENCIA PARA SAIR E AVANÇAR PARA PROXIMA CAVERNA");
        System.out.println("RESOLVA O PROBLEMA: ");
        Random gerador = new Random();
        Scanner sc = new Scanner(System.in);
        int x = gerador.nextInt(100);
        int y = gerador.nextInt(100);
        double result;

        System.out.println(x + " / " + (double)y);
        System.out.println("VOCE TEM 3 CHANCES");
        int count = 0;

        String resp = String.format("%.2f", (x / (double)y));
        resp = resp.replace(",", ".");

        do {
            System.out.println((count + 1) + " TENTATIVA");
            result = sc.nextDouble();
            if(result == Double.parseDouble(resp)) {
                break;
            }
            count++;
        } while (count < 3);

        if(result != Double.parseDouble(resp)) {
            System.out.println("AHHHHHHHHHHH");
            System.out.println("VOCE FOI DERROTADO PELO DRAGAO VERMELHO");
            System.out.println("MAIS SORTE NA PROXIMA");
            endGame(false);
        }

        cavernaFinal(avatar);
    }

    static void cavernaFinal(Map avatar) {
        System.out.println("==============================");
        System.out.println("=   PUZZLE DO DRAGAO NEGRO   =");
        System.out.println("==============================");

        System.out.println("MEUS PARABENS: " + avatar.get("name"));
        System.out.println("VOCE ESTA NA ULTIMA CAVERNA A DO DRAGAO NEGRO");
        System.out.println("USE SUA " + avatar.get("arma") + " E " + avatar.get("item"));
        System.out.println("E SUA INTELIGENCIA PARA FINALIZAR E SAIR DA CAVERNA");

        Random gerador = new Random();
        Scanner sc = new Scanner(System.in);
        int x = gerador.nextInt(100);
        int y = gerador.nextInt(100);
        double result;

        System.out.println("VOCE DEVE RESOLVER A EQUACAO: ");
        System.out.println("( " + x + " - " + y + " ) + " + x + " / 4.0");
        System.out.println("VOCE TEM 2 CHANCES");
        int count = 0;
        String resp = String.format("%.2f", (x - y + (x / 4.0)));
        resp = resp.replace(",", ".");

        do {
            System.out.println((count + 1) + " TENTATIVA");
            result = sc.nextDouble();
            if(result == Double.parseDouble(resp)) {
                break;
            }
            count++;
        } while (count < 3);

        if(result != Double.parseDouble(resp)) {
            System.out.println("AHHHHHHHHHHH");
            System.out.println("VOCE FOI DERROTADO PELO DRAGAO NEGRO");
            System.out.println("MAIS SORTE NA PROXIMA");
            endGame(false);
        }

        System.out.println("PARABENS VOCE DERROTOU O DRAGAO NEGRO");
        endGame(true);
    }

    static void cavernaBonus(Map avatar) {
        System.out.println("==============================");
        System.out.println("=  PUZZLE DO DRAGAO DOURADO  =");
        System.out.println("==============================");
        System.out.println("MEUS PARABENS: " + avatar.get("name"));
        System.out.println("VOCE FOI INTELIGENTE NA ESCOLHA DE ITEMS E DESBLOQUEOU A FASE BONUS");
        System.out.println("AGORA TERA DE ENCARAR O DRAGAO DOURADO COM SUA INTELIGENCIA");
        Random gerador = new Random();
        Scanner sc = new Scanner(System.in);
        int x = gerador.nextInt(100);
        int y = gerador.nextInt(100);
        double result;

        System.out.println("VOCE DEVE RESOLVER A EQUACAO: ");
        System.out.println("( " + x + " * " + y + " ) + 2 * " + x);
        System.out.println("VOCE TEM 3 CHANCES");
        int count = 0;

        do {
            System.out.println((count + 1) + " TENTATIVA");
            result = sc.nextDouble();
            if(result == (x * y + (2 * x))) {
                break;
            }
            count++;
        } while (count < 3);

        if(result != (x * y + (2 * x))) {
            System.out.println("AHHHHHHHHHHH");
            System.out.println("VOCE FOI DERROTADO PELO DRAGAO DOURADO");
            System.out.println("MAIS SORTE NA PROXIMA");
            endGame(false);
        }

        System.out.println("PARABENS VOCE DERROTOU O DRAGAO DOURADO");
        endGame(true);
    }

    static void endGame(boolean status) {
        if(status) {
            System.out.println("PARABENS VOCE EXPLOROU TODAS AS CAVERNAS");
            System.out.println("E SAIU VITORIOSO");
            System.out.println("SEU PREMIO E UM MUNDO DE CONHECIMENTOS");
        }

        System.out.println("FIM DE JOGO");
        System.exit(1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("=        EXPLORANDO CAVERNAS         =");
        System.out.println("======================================");

        System.out.println("BEM VINDO JOGADOR");
        int option;

        do{
            System.out.println("ESCOLHA UM OPCAO: ");
            System.out.println("JOGAR - (1)");
            System.out.println("SAIR - (0)");
            option = sc.nextInt();
        } while(option != 1 && option != 0);

        if(option == 0) {
            System.exit(1);
        }

        Map<String,String> avatar = new HashMap<String,String>();
        String name;
        String wapon;
        String item;
        String sex;

        System.out.println("DIGITE O NOME DO SEU AVATAR: ");
        name = sc.next();

        System.out.println("ESCOLHA O SEXO DO SEU PERSONAGEM");
        do {
            System.out.println("MASCULINO - (1)");
            System.out.println("FEMININO - (2)");
            int sexOp = sc.nextInt();
            sex = getSex(sexOp);
        } while (sex.equals("ERROR"));

        do{
            System.out.println("ESCOLHA SUA ARMA: ");
            System.out.println("ESPADA - (1)");
            System.out.println("LANCA - (2)");
            System.out.println("ARCO - (3)");
            System.out.println("VARA DE PESCAR  - (4)");
            int waponOp = sc.nextInt();
            wapon = getWapon(waponOp);
        } while (wapon.equals("ERROR"));

         do {
             System.out.println("ESCOLHA UM ITEM ESPECIAL: ");
             System.out.println("POCAO DE RECUPERACAO - (1)");
             System.out.println("POCAO DE INVISIBILIDADE - (2)");
             System.out.println("ESCUDO - (3)");
             System.out.println("PO DE MICO - (4)");
             int itemOp = sc.nextInt();
             item = getItem(itemOp);
         } while (item.equals("ERROR"));


        avatar.put("name", name);
        avatar.put("sex", sex);
        avatar.put("arma", wapon);
        avatar.put("item", item);

        if(avatar.get("arma").equals("VARA DE PESCAR") && avatar.get("item").equals("PO DE MICO")) {
            cavernaBonus(avatar);
        }

        System.out.println("AGORA VAMOS INICIAR A EXPLORACAO");
        System.out.println("ESCOLHA UMA DAS CAVERNAS PARA EXPLORAR: ");
        int cave;

        do {
            System.out.println("CAVERNA AZUL - (1)");
            System.out.println("CAVERNA VERDE - (2)");
            cave = sc.nextInt();
        } while (cave != 1 && cave != 2);

        if(cave == 1) {
            cavernaAzul(avatar);
        } else {
            cavernaVerde(avatar);
        }

    }

}
