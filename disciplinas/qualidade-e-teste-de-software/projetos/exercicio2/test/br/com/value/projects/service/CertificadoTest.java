package br.com.value.projects.service;

import br.com.value.projects.builder.CriadorCertificado;
import br.com.value.projects.dominio.Certificado;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CertificadoTest {

    @Test
    public void emitirCertificadoSucesso() throws Exception {
        CriadorCertificado certificado = new CriadorCertificado();
        certificado.para("teste", "gabriel", 100.0);
        boolean temCertificado = certificado.certificadosPorAluno("gabriel");
        assertFalse(!temCertificado);
    }

    @Test(expected=Exception.class)
    public void certificadoAoIniciarCurso() throws Exception {
        CriadorCertificado certificado = new CriadorCertificado();
        certificado.para("teste", "gabriel", 0.0);
    }

    @Test(expected=Exception.class)
    public void certificadoComMenos70Porcento() throws Exception {
        CriadorCertificado certificado = new CriadorCertificado();
        certificado.para("teste", "gabriel", 60.0);
    }

    @Test(expected=Exception.class)
    public void certificadoJaEmitido() throws Exception {
        CriadorCertificado certificado = new CriadorCertificado();
        certificado.para("teste", "gabriel", 100.0);
        certificado.para("teste", "gabriel", 100.0);
    }

}
