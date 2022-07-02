package exercices.aula4.aluno;

import exercices.aula4.aluno.Aluno;

public class AlunoPosGraduacao extends Aluno {

    private String anoConclusaoGraduacao;

    public AlunoPosGraduacao() {}

    public AlunoPosGraduacao(String ra, String nome, String curso, String anoConclusaoGraduacao) {
        super(ra, nome, curso);
        this.anoConclusaoGraduacao = anoConclusaoGraduacao;
    }

    public String getAnoConclusaoGraduacao() {
        return anoConclusaoGraduacao;
    }

    public void setAnoConclusaoGraduacao(String anoConclusaoGraduacao) {
        this.anoConclusaoGraduacao = anoConclusaoGraduacao;
    }

    @Override
    public String toString() {
        return "RA: " + this.getRa() + "\n Nome: " + this.getNome() + "\n Curso: " + this.getCurso() + "\n Ano de conclusao da graduacao: " + anoConclusaoGraduacao + "\n";
    }
}
