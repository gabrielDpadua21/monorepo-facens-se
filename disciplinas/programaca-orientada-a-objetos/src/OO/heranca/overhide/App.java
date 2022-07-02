package OO.heranca.overhide;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {

        List<Pessoa> list = new ArrayList<Pessoa>();
        int op;
        op = Integer.parseInt(JOptionPane.showInputDialog("Digite uma opcao: \n 1 - Criar pessoa fisica\n 2 - Criar pessoa juridica \n 3 - Imprimir Pessoa \n 0 - Sair"));

        do {
            switch (op) {
                case 1:
                    list.add(criarPessoaFisica());
                    break;
                case 2:
                    list.add(criarPessoaJuridica());
                    break;
                case 3:
                    imprimirPessoa(list);
                    break;
                default:
                    JOptionPane.showMessageDialog(new JFrame(), "Opcao invalida!!!", "Error",
                            JOptionPane.ERROR_MESSAGE);
            }

            op = Integer.parseInt(JOptionPane.showInputDialog("Digite uma opcao: \n 1 - Criar pessoa fisica\n 2 - Criar pessoa juridica \n 3 - Imprimir Pessoa \n 0 - Sair"));
        } while(op != 0);

        System.out.println("Bye!");

    }

    static Pessoa criarPessoaFisica() {
        PessoaFisica pf = new PessoaFisica();

        pf.setNome(JOptionPane.showInputDialog("Digite o nome da pessoa"));
        pf.setCpf(JOptionPane.showInputDialog("Digite o cpf da pessoa"));
        pf.setEmail(JOptionPane.showInputDialog("Digite o email da pessoa"));
        pf.setCelular(JOptionPane.showInputDialog("Digite o celular da pessoa"));

        return pf;
    }

    static Pessoa criarPessoaJuridica() {
        PessoaJuridica pj = new PessoaJuridica();

        pj.setRazao(JOptionPane.showInputDialog("Digite o rasao social da pessoa"));
        pj.setCnpj(JOptionPane.showInputDialog("Digite o cnpj da pessoa"));
        pj.setEmail(JOptionPane.showInputDialog("Digite o email da pessoa"));
        pj.setCelular(JOptionPane.showInputDialog("Digite o celular da pessoa"));

        return pj;
    }

    static void imprimirPessoa(List<Pessoa> pessoas) {
        String email;

        email = JOptionPane.showInputDialog("Digite o email da pessoa: ");

        List<Pessoa> pessoa = pessoas.stream().filter(p -> p.getEmail().equals(email)).collect(Collectors.toList());

        JOptionPane.showMessageDialog(new JFrame(), pessoa.get(0).imprimir(), "Info",
                JOptionPane.INFORMATION_MESSAGE);
    }

}
