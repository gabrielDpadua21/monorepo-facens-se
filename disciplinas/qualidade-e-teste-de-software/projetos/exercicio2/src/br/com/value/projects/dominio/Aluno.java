package br.com.value.projects.dominio;

public class Aluno {

    private String nome;
    private double nota;
    private double frequencia;

    public Aluno(String nome, double nota, double frequencia) {
        this.nome = nome;
        this.nota = nota;
        this.frequencia = frequencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public double getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(double frequencia) {
        this.frequencia = frequencia;
    }
}
