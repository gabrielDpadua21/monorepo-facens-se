package exercices.aula4.funcionario;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {

        List<Funcionario> list = new ArrayList<Funcionario>();
        int op;
        op = Integer.parseInt(JOptionPane.showInputDialog("Digite uma opcao: \n 1 - Inserir funcionario \n 2 - Listar funcionario \n 0 - Sair"));

        while(op != 0) {
            switch (op) {
                case 1:
                    list.add(inserirFuncionario());
                    break;
                case 2:
                    listarFuncionarios(list);
                    break;
                default:
                    JOptionPane.showMessageDialog(new JFrame(), "Opcao invalida!!!", "Error",
                            JOptionPane.ERROR_MESSAGE);
                    break;
            }

            op = Integer.parseInt(JOptionPane.showInputDialog("Digite uma opcao: \n 1 - Inserir funcionario\n 2 - Listar funcionario \n 0 - Sair"));
        }

    }

    public static Funcionario inserirFuncionario() {
        int op;

        op = Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo de funcionario q deseja inserir: \n 1 - Funcionario \n 2 - Consultor"));

        if(op == 1) {
            return criarFuncionario();
        }

        return criarConsultor();

    }

    public static Funcionario criarFuncionario() {
        Funcionario funcionario = new Funcionario();

        funcionario.setMatricula(JOptionPane.showInputDialog("Digite a matricula do funcionario "));

        funcionario.setNome(JOptionPane.showInputDialog("Digite o nome do funcionario: "));

        funcionario.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Digite o salario do funcionario: ")));

        return funcionario;
    }

    public static Consultor criarConsultor() {
        Consultor consultor = new Consultor();

        consultor.setMatricula(JOptionPane.showInputDialog("Digite a matricula do funcionario "));

        consultor.setNome(JOptionPane.showInputDialog("Digite o nome do funcionario: "));

        consultor.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Digite o salario do funcionario: ")));

        return consultor;
    }

    public static void listarFuncionarios(List<Funcionario> funcionarios) {
        String matricula;

        matricula = JOptionPane.showInputDialog("Digite a matricula do funcionario: ");

        List<Funcionario> funcionario = funcionarios.stream().filter(p -> p.getMatricula().equals(matricula)).collect(Collectors.toList());

        JOptionPane.showMessageDialog(new JFrame(), funcionario.get(0).toString(), "Info",
                JOptionPane.INFORMATION_MESSAGE);
    }

}
