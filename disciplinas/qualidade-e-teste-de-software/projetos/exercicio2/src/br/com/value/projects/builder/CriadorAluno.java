package br.com.value.projects.builder;

import br.com.value.projects.dominio.Aluno;

public class CriadorAluno {

    private Aluno aluno;

    public CriadorAluno() {}

    public CriadorAluno Criar(String nome, double nota, double frequencia) {
        this.aluno = new Aluno(nome, nota, frequencia);
        return this;
    }

    public double verFrequencia() {
        return this.aluno.getFrequencia();
    }

    public String verAprovacao() {
        if(this.aluno.getFrequencia() >= 75 && this.aluno.getNota() >= 7) {
            return "Aprovado";
        }
        return "Reprovado";
    }

}
