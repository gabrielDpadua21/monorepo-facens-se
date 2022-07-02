package br.com.value.projects.service;

import br.com.value.projects.builder.CriadorAluno;
import org.junit.Assert;
import org.junit.Test;

public class AlunoTest {

    @Test
    public void alunoVerFrequencia() {
        CriadorAluno aluno = new CriadorAluno();
        aluno.Criar("Gabriel", 10.0, 100.0);
        Assert.assertEquals(100, aluno.verFrequencia(), 0.00001);
    }

    @Test
    public void alunoAprovado() {
        CriadorAluno aluno = new CriadorAluno();
        aluno.Criar("Gabriel", 10.0, 100.0);
        Assert.assertEquals("Aprovado", aluno.verAprovacao());
    }

    @Test
    public void alunoReprovadoNota() {
        CriadorAluno aluno = new CriadorAluno();
        aluno.Criar("Gabriel", 5.0, 75.0);
        Assert.assertEquals("Reprovado", aluno.verAprovacao());
    }

    @Test
    public void alunoReprovadoFrequencia() {
        CriadorAluno aluno = new CriadorAluno();
        aluno.Criar("Gabriel", 10.0, 50.0);
        Assert.assertEquals("Reprovado", aluno.verAprovacao());
    }
}
