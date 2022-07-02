package exercices.aula2.apolice;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {
            List<Apolice> list = new ArrayList<Apolice>();
            int op;

            op = Integer.parseInt(JOptionPane.showInputDialog("1 - Criar Apolice: \n2 - Ver Dados Apolice \n0 - Sair"));

            do {
                switch (op) {
                    case 1:
                        list.add(createApolice());
                        break;
                    case 2:
                        printApolice(list);
                        break;
                    default:
                        JOptionPane.showMessageDialog(new JFrame(), "Opcao invalida!!!", "Error",
                                JOptionPane.ERROR_MESSAGE);
                }

                op = Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar? uma opcao: \n1 - Criar Apolice \n2 - Ver Dados Apolice \n0 - Sair"));
            } while(op != 0);


            JOptionPane.showMessageDialog(new JFrame(), "Bye!!!", "Info",
                    JOptionPane.INFORMATION_MESSAGE);


    }

    static Apolice createApolice() {
        Apolice ap = new Apolice();
        int opSex;

        ap.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite numero da apolice:")));

        ap.setNome(JOptionPane.showInputDialog("Digite o nome do beneficiario:"));

        ap.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do beneficiario:")));

        opSex = Integer.parseInt(JOptionPane.showInputDialog("Digite o sexo da pessoa ->  \n 1(M) \n 2(F)"));

        if(opSex == 1) {
            ap.setSexo('M');
        } else {
            ap.setSexo('F');
        }

        ap.setValorAutomovel(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do automovel:")));

        return ap;
    }

    static void printApolice(List<Apolice> apolices) {
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da apolice: "));

        List<Apolice> apolice = apolices.stream()
                .filter(ap -> ap.getNumero() == numero).collect(Collectors.toList());


        JOptionPane.showMessageDialog(new JFrame(), apolice.get(0).imprimir(), "Info",
                JOptionPane.INFORMATION_MESSAGE);
    }

}
