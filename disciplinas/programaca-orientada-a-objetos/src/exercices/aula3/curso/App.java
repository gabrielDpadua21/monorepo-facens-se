package exercices.aula3.curso;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Curso> list = new ArrayList<Curso>();
        int op;

        op = Integer.parseInt(JOptionPane.showInputDialog("Digite uma opcao: \n 1 - Criar Curso \n 2 - Criar Aluno \n 3 - Remover Aluno \n 4 - Mostrar todos os alunos \n 5 - Mostrar todos os alunos \n 0 - Sair"));

        do {
            switch (op) {
                case 1:
                    list.add(criarCurso());
                    break;
                case 2:
                    list = criarAlunoAddCurso(list);
                    break;
                case 3:
                    list = removerAlunoCurso(list);
                    break;
                case 4:
                    imprimirCursos(list);
                    break;
                case 5:
                    imprimirAlunosCurso(list);
                    break;
                default:
                    JOptionPane.showMessageDialog(new JFrame(), "Opcao invalida!!!", "Error",
                            JOptionPane.ERROR_MESSAGE);
            }

            op = Integer.parseInt(JOptionPane.showInputDialog("Digite uma opcao: \n 1 - Criar Curso \n 2 - Criar Aluno \n 3 - Remover Aluno \n 4 - Mostrar todos os alunos \n 5 - Mostrar todos os alunos \n 0 - Sair"));
        } while(op != 0);


        System.out.println("Bye!!!");

    }

    static Curso criarCurso() {
        Curso c = new Curso();

        c.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do curso: ")));

        c.setNome(JOptionPane.showInputDialog("Digite o nome do curso: "));

        c.setCargaHoraria(Integer.parseInt(JOptionPane.showInputDialog("Digite a carga horaria do curso: ")));

        return c;
    }

    static List<Curso> criarAlunoAddCurso(List<Curso> cursos) {
        Aluno aluno;
        int codigo;

        codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do curso: "));

        aluno = criarAluno();

        List<Curso> curso = cursos.stream().filter(c -> c.getCodigo() == codigo).collect(Collectors.toList());

        cursos.removeIf(c -> c.getCodigo() == codigo);

        curso.get(0).inserirAluno(aluno);

        cursos.add(curso.get(0));

        return cursos;
    }

    static List<Curso> removerAlunoCurso(List<Curso> cursos) {
        int codigo;
        String ra;

        codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do curso: "));

        ra = JOptionPane.showInputDialog("Digite o RA do aluno: ");

        List<Curso> curso = cursos.stream().filter(c -> c.getCodigo() == codigo).collect(Collectors.toList());

        cursos.removeIf(c -> c.getCodigo() == codigo);

        curso.get(0).removerAluno(ra);

        cursos.add(curso.get(0));

        return cursos;
    }

    static Aluno criarAluno() {
        Aluno a = new Aluno();

        a.setRa(JOptionPane.showInputDialog("Digite o Ra do aluno: "));

        a.setNome(JOptionPane.showInputDialog("Digite o nome do aluno: "));

        return a;
    }

    static void imprimirCursos(List<Curso> cursos) {
        String response = "\n";

        for(Curso curso: cursos) {
            response += curso.imprimir() + "\n";
        }

        JOptionPane.showMessageDialog(new JFrame(), response, "Info",
                JOptionPane.INFORMATION_MESSAGE);
    }

    static void imprimirAlunosCurso(List<Curso> cursos) {
        int codigo;
        String response = "\n";

        codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do curso: "));

        List<Curso> curso = cursos.stream().filter(c -> c.getCodigo() == codigo).collect(Collectors.toList());

        response += curso.get(0).imprimirCompleto();

        JOptionPane.showMessageDialog(new JFrame(), response, "Info",
                JOptionPane.INFORMATION_MESSAGE);
    }



}
