package br.com.value.projects.builder;

import br.com.value.projects.dominio.Certificado;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CriadorCertificado {

    private List<Certificado> certificados = new ArrayList<>();


    public CriadorCertificado() {}

    public CriadorCertificado para(String curso, String aluno, Double porcentagem) throws Exception {
        boolean temCertificado = this.certificadosPorAluno(aluno);

        if (porcentagem >= 75.0 && !temCertificado) {
            this.certificados.add(new Certificado(curso, aluno, porcentagem));
            return this;
        }

        throw new Exception("Invalid result");
    }

    public boolean certificadosPorAluno(String aluno) throws Exception {
        List<Certificado> certificado = this.certificados.stream()
                .filter(item -> item.getAluno().equals(aluno))
                .collect(Collectors.toList());

        if(certificado.isEmpty()) {
            return false;
        }
        return true;
    }

}
