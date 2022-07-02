package exercices.aula3.curso;

import exercices.aula3.curso.Aluno;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private int codigo;
    private String nome;
    private int cargaHoraria;
    private List<Aluno> alunos = new ArrayList<Aluno>();

    public Curso() {}

    public Curso(int codigo, String nome, int cargaHoraria) {
        this.codigo = codigo;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void inserirAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public void removerAluno(String ra) {
        this.alunos.removeIf(aluno -> aluno.getRa().equals(ra));
    }

    public String imprimir() {
        return "Codigo: " + this.codigo +
                "\nNome do curso: " + this.nome +
                "\nCarga Horaria: " + this.cargaHoraria;
    }

    public String imprimirCompleto() {
        String response = "CURSO: \n" + this.imprimir();

        response += "\n ALUNOS: \n \n";

        for (Aluno aluno : this.alunos) {
            response += aluno.imprimir();
        }

        return response;
    }
}
