package exercices.aula3.veiculo;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Pessoa> list = new ArrayList<Pessoa>();
        int op;

        op = Integer.parseInt(JOptionPane.showInputDialog("Digite uma opcao: \n 1 - Criar Pessoa \n 2 - Criar Automovel \n 3 - Transferir automovel \n 4 - Mostrar todos as pessoas \n 5 - Mostrar automoveis da pessoa \n 0 - Sair"));

        do {
            switch (op) {
                case 1:
                    list.add(criarPessoa());
                    break;
                case 2:
                    list = criarAutomovelAddPessoa(list);
                    break;
                case 3:
                    list = transferirAutomovel(list);
                    break;
                case 4:
                    imprimirPessoas(list);
                    break;
                case 5:
                    imprimirPessoaCarros(list);
                    break;
                default:
                    JOptionPane.showMessageDialog(new JFrame(), "Opcao invalida!!!", "Error",
                            JOptionPane.ERROR_MESSAGE);
            }

            op = Integer.parseInt(JOptionPane.showInputDialog("Digite uma opcao: \n 1 - Criar Pessoa \n 2 - Criar Automovel \n 3 - Transferir automovel \n 4 - Mostrar todos as pessoas \n 5 - Mostrar automoveis da pessoa \n 0 - Sair"));
        } while(op != 0);


        System.out.println("Bye!!!");

    }

    static Pessoa criarPessoa() {
        Pessoa p = new Pessoa();

        p.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo da pessoa: ")));

        p.setNome(JOptionPane.showInputDialog("Digite o nome da pessoa: "));

        return p;
    }

    static List<Pessoa> criarAutomovelAddPessoa(List<Pessoa> pessoas) {
        Automovel automovel;
        int codigo;

        codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo da pessoa: "));

        automovel = criarAutomovel();

        List<Pessoa> pessoa = pessoas.stream().filter(p -> p.getCodigo() == codigo).collect(Collectors.toList());

        pessoas.removeIf(p -> p.getCodigo() == codigo);

        pessoa.get(0).inserirAutomovel(automovel);

        pessoas.add(pessoa.get(0));

        return pessoas;
    }

    static Automovel criarAutomovel() {
        Automovel a = new Automovel();

        a.setMarca(JOptionPane.showInputDialog("Digite o marca do automovel: "));

        a.setModelo(JOptionPane.showInputDialog("Digite o modelo do automovel: "));

        return a;
    }

    static List<Pessoa> transferirAutomovel(List<Pessoa> pessoas) {
        int codigoPessoaOrigem;
        int codigoPessoaDestino;
        String modelo;
        List<Pessoa> pessoaOrigem, pessoaDestino;
        List<Automovel> automovelTranferir;

        codigoPessoaOrigem = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo da pessoa que deseja transefeir o veiculo: "));

        modelo = JOptionPane.showInputDialog("Digite o modelo do automovel que deseja transferir: ");

        codigoPessoaDestino = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo da pessoa que deseja receber o veiculo: "));

        pessoaOrigem = pessoas.stream().filter(p -> p.getCodigo() == codigoPessoaOrigem).collect(Collectors.toList());

        pessoaDestino = pessoas.stream().filter(p -> p.getCodigo() == codigoPessoaDestino).collect(Collectors.toList());

        automovelTranferir = pessoaOrigem.get(0).getAutomoveis().stream().filter(aut -> aut.getModelo().equals(modelo)).collect(Collectors.toList());

        pessoaOrigem.get(0).excluirAutomovel(modelo);

        pessoaDestino.get(0).inserirAutomovel(automovelTranferir.get(0));

        pessoas.removeIf(p -> p.getCodigo() == codigoPessoaOrigem);
        pessoas.removeIf(p -> p.getCodigo() == codigoPessoaDestino);

        pessoas.add(pessoaOrigem.get(0));
        pessoas.add(pessoaDestino.get(0));

        return pessoas;
    }

    static void imprimirPessoas(List<Pessoa> pessoas) {
        String response = "\n";

        for(Pessoa pessoa: pessoas) {
            response += pessoa.imprimir() + "\n";
        }

        JOptionPane.showMessageDialog(new JFrame(), response, "Info",
                JOptionPane.INFORMATION_MESSAGE);
    }

    static void imprimirPessoaCarros(List<Pessoa> pessoas) {
        int codigo;
        String response = "\n";

        codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo da pessoa: "));

        List<Pessoa> pessoa = pessoas.stream().filter(p -> p.getCodigo() == codigo).collect(Collectors.toList());

        response += pessoa.get(0).imprimirCompleto();

        JOptionPane.showMessageDialog(new JFrame(), response, "Info",
                JOptionPane.INFORMATION_MESSAGE);
    }

}
