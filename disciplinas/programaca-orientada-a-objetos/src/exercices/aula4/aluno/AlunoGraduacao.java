package exercices.aula4.aluno;

import exercices.aula4.aluno.Aluno;

public class AlunoGraduacao extends Aluno {


    private String anoConclusaoEnsinoMedio;

    public AlunoGraduacao() {}

    public AlunoGraduacao(String ra, String nome, String curso, String anoConclusaoEnsinoMedio) {
        super(ra, nome, curso);
        this.anoConclusaoEnsinoMedio = anoConclusaoEnsinoMedio;
    }

    public String getAnoConclusaoEnsinoMedio() {
        return anoConclusaoEnsinoMedio;
    }

    public void setAnoConclusaoEnsinoMedio(String anoConclusaoEnsinoMedio) {
        this.anoConclusaoEnsinoMedio = anoConclusaoEnsinoMedio;
    }

    @Override
    public String toString() {
        return "RA: " + this.getRa() + "\n Nome: " + this.getNome() + "\n Curso: " + this.getCurso() + "\n Ano de conclusao ensino medio: " + anoConclusaoEnsinoMedio + "\n";
    }
}
