package exercices.aula2.vendedor;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {

        List<Vendedor> list = new ArrayList<Vendedor>();
        int op;

        op = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastrar Vendedor: \n2 - Calcular venda \n0 - Sair"));

        do {
            switch (op) {
                case 1:
                    list.add(createSeller());
                    break;
                case 2:
                    printSell(list);
                    break;
                default:
                    JOptionPane.showMessageDialog(new JFrame(), "Opcao invalida!!!", "Error",
                            JOptionPane.ERROR_MESSAGE);
            }

            op = Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar? uma opcao: \n1 - Cadastrar Vendedor \n2 - Calcular venda \n0 - Sair"));
        } while(op != 0);


        JOptionPane.showMessageDialog(new JFrame(), "Bye!!!", "Info",
                JOptionPane.INFORMATION_MESSAGE);

    }

    static Vendedor createSeller() {
        Vendedor v = new Vendedor();

        v.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do vendedor")));

        v.setNome(JOptionPane.showInputDialog("Digite o nome do vendedor"));

        v.setPercentualComissao(Integer.parseInt(JOptionPane.showInputDialog("Digite o percentual % de comissao do vendedor")));

        return v;
    }

    static void printSell(List<Vendedor> vendedores) {
        int codigo;
        double valorVenda;
        double desconto;

        codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do vendedor:"));

        valorVenda = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da venda:"));

        desconto = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do desconto:"));

        List<Vendedor> vendedor = vendedores.stream()
                .filter(vend -> vend.getCodigo() == codigo).collect(Collectors.toList());


        JOptionPane.showMessageDialog(new JFrame(), vendedor.get(0).imprimir(valorVenda, desconto), "Info",
                JOptionPane.INFORMATION_MESSAGE);
    }

}
