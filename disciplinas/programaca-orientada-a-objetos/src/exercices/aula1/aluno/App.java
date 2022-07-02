package exercices.aula1.aluno;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {

        List<Student> list = new ArrayList<Student>();
        int op;

        op = Integer.parseInt(JOptionPane.showInputDialog("Digite uma opcao: \n 1 - Criar aluno \n 2 - Imprimir aluno \n 0 - Sair"));

        do {
            switch (op) {
                case 1:
                    list.add(createStudent());
                    break;
                case 2:
                    printStudent(list);
                    break;
                default:
                    JOptionPane.showMessageDialog(new JFrame(), "Opcao invalida!!!", "Error",
                            JOptionPane.ERROR_MESSAGE);
            }

            op = Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar? uma opcao: \n 1 - Criar aluno \n 2 - Imprimir aluno \n 0 - Sair"));
        } while(op != 0);


        JOptionPane.showMessageDialog(new JFrame(), "Bye!!!", "Info",
                JOptionPane.INFORMATION_MESSAGE);

    }

    static Student createStudent() {
        Scanner sc = new Scanner(System.in);
        Student p = new Student();

        p.setRa(JOptionPane.showInputDialog("Digite o Ra do Aluno:"));

        p.setName(JOptionPane.showInputDialog("Digite o nome do aluno"));

        p.setAc1(Float.parseFloat(JOptionPane.showInputDialog("Digite a nota da AC1: ")));

        p.setAc2(Float.parseFloat(JOptionPane.showInputDialog("Digite a nota da AC2: ")));

        p.setAg(Float.parseFloat(JOptionPane.showInputDialog("Digite a nota da AG: ")));

        p.setAf(Float.parseFloat(JOptionPane.showInputDialog("Digite a nota da AF: ")));


        return p;
    }

    static void printStudent(List<Student> students) {
        Scanner sc = new Scanner(System.in);
        String ra;

        ra = JOptionPane.showInputDialog("Digite o ra do aluno: ");

        List<Student> student = students.stream()
                .filter(p -> p.getRa().equals(ra)).collect(Collectors.toList());


        JOptionPane.showMessageDialog(new JFrame(), student.get(0).imprimir(), "Info",
                JOptionPane.INFORMATION_MESSAGE);
    }

}
