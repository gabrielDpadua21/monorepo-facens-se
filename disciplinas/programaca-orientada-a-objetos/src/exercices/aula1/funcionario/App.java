package exercices.aula1.funcionario;

import exercices.aula1.aluno.Student;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Funcionario> list = new ArrayList<Funcionario>();
        int op;

        op = Integer.parseInt(JOptionPane.showInputDialog("Digite uma opcao: \n 1 - Criar funcionario \n 2 - Imprimir funcionario \n 3 - Alterar tipo salario \n 0 - Sair"));

        do {
            switch (op) {
                case 1:
                    list.add(criarFuncionario());
                    break;
                case 2:
                    imprimirFuncionario(list);
                    break;
                case 3:
                    list = alterarTipoSalario(list);
                    break;
                default:
                    JOptionPane.showMessageDialog(new JFrame(), "Opcao invalida!!!", "Error",
                            JOptionPane.ERROR_MESSAGE);
            }

            op = Integer.parseInt(JOptionPane.showInputDialog("Deseja realizar nova operacao?: \n 1 - Criar funcionario \n 2 - Imprimir funcionario \n 3 - Alterar tipo salario \n 0 - Sair"));
        } while(op != 0);


        System.out.println("Bye!!!");

    }

    static Funcionario criarFuncionario() {
        Funcionario p = new Funcionario();
        int tipo;

        p.setCracha(Integer.parseInt(JOptionPane.showInputDialog("Digite o cracha do usuario: ")));

        p.setNome(JOptionPane.showInputDialog("Digite o nome do funcionario: "));

        return salarioFuncionario(p);
    }

    static Funcionario salarioFuncionario(Funcionario func) {
        int tipo;

        tipo = Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo de vinculo do funcionario: \n 1(H) \n 2(M) "));

        if(tipo == 1) {
            func.setTipoVinculo('H');

            func.setQtdeHora(Double.parseDouble(JOptionPane.showInputDialog("Digite o quantidade de horas trabalhadas: ")));

            func.setValorHora(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da hora trabalhada: ")));
        } else {
            func.setTipoVinculo('M');

            func.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salario: ")));
        }

        func.setValorDesconto(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do desconto: ")));

        return func;
    }

    static List<Funcionario> alterarTipoSalario(List<Funcionario> funcionarios) {
        int cracha;
        Funcionario func;

        cracha = Integer.parseInt(JOptionPane.showInputDialog("Digite o cracha do usuario: "));

        List<Funcionario> funcionario = funcionarios.stream()
                .filter(p -> p.getCracha() == cracha).collect(Collectors.toList());

        funcionarios.removeIf(p -> p.getCracha() == cracha);

        func = salarioFuncionario(funcionario.get(0));

        funcionarios.add(func);

        return funcionarios;
    }

    static void imprimirFuncionario(List<Funcionario> funcionarios) {
        Scanner sc = new Scanner(System.in);
        int cracha;

        cracha = Integer.parseInt(JOptionPane.showInputDialog("Digite o cracha do usuario: "));

        List<Funcionario> funcionario = funcionarios.stream()
                .filter(p -> p.getCracha() == cracha).collect(Collectors.toList());

        JOptionPane.showMessageDialog(new JFrame(), funcionario.get(0).imprimir(), "Info",
                JOptionPane.INFORMATION_MESSAGE);
    }

}
