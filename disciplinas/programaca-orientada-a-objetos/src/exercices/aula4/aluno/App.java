package exercices.aula4.aluno;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {

        List<Aluno> list = new ArrayList<Aluno>();
        int op;
        op = Integer.parseInt(JOptionPane.showInputDialog("Digite uma opcao: \n 1 - Inserir aluno aluno \n 2 - Listar alunos \n 0 - Sair"));

        while(op != 0) {
            switch (op) {
                case 1:
                    list.add(inserirAluno());
                    break;
                case 2:
                    listarAlunos(list);
                    break;
                default:
                    JOptionPane.showMessageDialog(new JFrame(), "Opcao invalida!!!", "Error",
                            JOptionPane.ERROR_MESSAGE);
                    break;
            }

            op = Integer.parseInt(JOptionPane.showInputDialog("Digite uma opcao: \n 1 - Inserir aluno pessoa aluno\n 2 - Listar alunos \n 0 - Sair"));
        }

    }


    public static Aluno inserirAluno() {
        int op;

        op = Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo de aluno q deseja inserir: \n 1 - Graduacao \n 2 - Pos-graduacao"));

        if(op == 1) {
            return criarAlunoGraduacao();
        }

        return criarAlunoPosGraduacao();

    }

    public static AlunoGraduacao criarAlunoGraduacao() {
        AlunoGraduacao aluno = new AlunoGraduacao();

        aluno.setRa(JOptionPane.showInputDialog("Digite o Ra do aluno: "));

        aluno.setNome(JOptionPane.showInputDialog("Digite o nome do aluno: "));

        aluno.setCurso(JOptionPane.showInputDialog("Digite o Curso do aluno"));

        aluno.setAnoConclusaoEnsinoMedio(JOptionPane.showInputDialog("Digite o ano de conclusao do ensino medio: "));

        return aluno;
    }

    public static AlunoPosGraduacao criarAlunoPosGraduacao() {
        AlunoPosGraduacao aluno = new AlunoPosGraduacao();

        aluno.setRa(JOptionPane.showInputDialog("Digite o Ra do aluno: "));

        aluno.setNome(JOptionPane.showInputDialog("Digite o nome do aluno: "));

        aluno.setCurso(JOptionPane.showInputDialog("Digite o Curso do aluno"));

        aluno.setAnoConclusaoGraduacao(JOptionPane.showInputDialog("Digite o ano de conclusao da Graduacao: "));

        return aluno;
    }

    public static void listarAlunos(List<Aluno> alunos) {
        String ra;

        ra = JOptionPane.showInputDialog("Digite o Ra do aluno: ");

        List<Aluno> aluno = alunos.stream().filter(p -> p.getRa().equals(ra)).collect(Collectors.toList());

        JOptionPane.showMessageDialog(new JFrame(), aluno.get(0).toString(), "Info",
                JOptionPane.INFORMATION_MESSAGE);
    }

}
