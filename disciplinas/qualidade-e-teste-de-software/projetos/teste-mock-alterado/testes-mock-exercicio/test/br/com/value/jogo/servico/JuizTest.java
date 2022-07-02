package br.com.value.jogo.servico;


import static org.hamcrest.MatcherAssert.assertThat;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import br.com.value.jogo.builder.CriadorDeJogo;
import br.com.value.jogo.dominio.Resultado;
import br.com.value.jogo.dominio.Jogo;
import br.com.value.jogo.dominio.Participante;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItems;

public class JuizTest {
	
	private Juiz juiz;
	private Participante laura;
	private Participante leonardo;
	private Participante andreia;

	@Before
	public void criaJulgamento() {
		this.juiz = new Juiz();
		this.laura = new Participante("Laura");
		this.leonardo = new Participante("Leonardo");
		this.andreia = new Participante("Andreia");
	}
	
	@Test(expected=RuntimeException.class)
	public void naoDeveTerJogoSemNenhumResultado() {
		Jogo jogo = new CriadorDeJogo().para("Cata Moedas").constroi();
		
		juiz.avalia(jogo);
		
	}
	
    @Test
    public void deveTerResultadosEmOrdemCrescente() {
        // parte 1: cenario
         
        Jogo jogo = new Jogo("Cata Moedas");
         
        jogo.anota(new Resultado(leonardo, 250.0));
        jogo.anota(new Resultado(laura, 300.0));
        jogo.anota(new Resultado(andreia, 400.0));
         
        // parte 2: acao
        juiz.avalia(jogo);
         
        // parte 3: validacao
        assertThat(juiz.getMaiorResultado(), equalTo(400.0));
        assertThat(juiz.getMenorResulatado(), equalTo(250.0));
    }
 
    @Test
    public void deveTerJogoComApenasUmResultado() {
    	Participante leonardo = new Participante("Leonardo");
        Jogo jogo = new Jogo("Cata Moedas");
         
        jogo.anota(new Resultado(leonardo, 1000.0));
         
        juiz.avalia(jogo);
         
        assertEquals(1000.0, juiz.getMaiorResultado(), 0.00001);
        assertEquals(1000.0, juiz.getMenorResulatado(), 0.00001);
    }
     
    @Test
    public void deveEncontrarOsTresMaioresResultados() {
        
        Jogo jogo = new CriadorDeJogo().para("Caca Moedas")
        		.resultado(leonardo, 100.0)
        		.resultado(laura, 200.0)
        		.resultado(andreia, 300.0)
        		.resultado(leonardo, 400.0)
        		.constroi();
         
        juiz.avalia(jogo);
         
        List<Resultado> maiores = juiz.getTresMaiores();
        assertEquals(3, maiores.size());
        
        assertThat(maiores, hasItems(
        		new Resultado(leonardo, 400),
        		new Resultado(andreia, 300),
        		new Resultado(laura, 200)
        ));
        
    }
     
}
