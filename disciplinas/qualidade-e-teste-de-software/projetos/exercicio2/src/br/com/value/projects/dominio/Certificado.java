package br.com.value.projects.dominio;

public class Certificado {

    private String curso;
    private String aluno;
    private double porcentagem;

    public Certificado(String curso, String aluno, double porcentagem) {
        this.curso = curso;
        this.aluno = aluno;
        this.porcentagem = porcentagem;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public double getPorcentagem() {
        return porcentagem;
    }

    public void setPorcentagem(double porcentagem) {
        this.porcentagem = porcentagem;
    }
}
