package br.com.valueprojects.estrategia_testes.UnitTest;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import br.com.valueprojects.estrategia_testes.model.CriadorDeJogo;
import br.com.valueprojects.estrategia_testes.model.Jogo;
import br.com.valueprojects.estrategia_testes.model.Participante;
import br.com.valueprojects.estrategia_testes.model.Resultado;

public class JogoTeste {
	
		
	@Test
	public void deveTerJogoComUnicoParticipante() {
		Jogo jogo = new Jogo("Jogo de corrida");
		assertEquals(0, jogo.getResultados().size());

		jogo.anota(new Resultado(new Participante("Leonardo"), 150));

		assertEquals(1, jogo.getResultados().size());

		assertEquals(150.0, jogo.getResultados().get(0).getMetrica(), 0.00001);
	}

	@Test(expected=Exception.class)
	public void avaliandoUmResultadoInvalidoParaJogo() throws Exception {
		Jogo jogo = new CriadorDeJogo()
				.para("Poker")
				.resultado(new Participante("Gabriel"), -1)
				.constroi();
	}

	@Test
	public void deveTerVariosResultados() throws Exception {
		Jogo jogo = new CriadorDeJogo()
        .para("Cata moedas")
        .resultado(new Participante("Nelson"), 150.0)
        .resultado(new Participante("Pedro"), 200.0)
        .constroi();

		assertEquals(2, jogo.getResultados().size());
		assertEquals(150.0, jogo.getResultados().get(0).getMetrica(), 0.00001);
		assertEquals(200.0, jogo.getResultados().get(1).getMetrica(), 0.00001);
		
	}
	
	@Test
	public void naoDeveAceitarDoisResultadosDoMesmoParticipante(){

		Jogo jogo = new Jogo("Ca�a pe�as");
		Participante leonardo = new Participante("Leonardo");

		jogo.anota(new Resultado(leonardo, 500.0));
		//deve ser ignorado
		jogo.anota(new Resultado(leonardo, 600.0));

		assertEquals(1, jogo.getResultados().size());
        assertEquals(500, jogo.getResultados().get(0).getMetrica(), 0.00001);
		}

}