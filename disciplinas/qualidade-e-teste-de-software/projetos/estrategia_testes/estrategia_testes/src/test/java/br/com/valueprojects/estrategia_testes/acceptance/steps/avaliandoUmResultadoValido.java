package br.com.valueprojects.estrategia_testes.acceptance.steps;

import io.cucumber.java.pt.*;

import org.junit.Assert;

import br.com.valueprojects.estrategia_testes.model.*;

import static org.junit.Assert.assertEquals;

public class avaliandoUmResultadoValido  {

	private Resultado resultado;
	private Jogo jogo;
	private Participante participante;
	
		@Dado("um resultado valido")
		public void um_resultado_valido() {
			Participante participante = new Participante("Leonardo");
			resultado = new Resultado(participante , 150.0);
		}
		
		@Quando("o jogo esta acontecendo")
		public void o_jogo_esta_acontecendo() {
			
			jogo = new Jogo("Caca Moedas");
		}
		
		@Quando("o resultado eh anotado")
		public void o_resultado_eh_anotado() {
			jogo.anota(resultado);
		}
 		
		@Então("o resultado deve ser aceito")
		public void o_resultado_deve_ser_aceito() {
		 
			Assert.assertEquals(1, jogo.getResultados().size());
			Assert.assertEquals(150.0, jogo.getResultados().get(0).getMetrica(), 0.00001);
		}

		@Dado("um resultado invalido")
		public void umResultadoInvalido() {
			Participante participante = new Participante("Leonardo");
			resultado = new Resultado(participante , -1);
		}

		@Entao("o resultado nao deve ser aceito")
		public void oResultadoNaoDeveSerAceito() {

		}

		@Dado("um jogo acontencendo")
		public void umJogoAcontencendo() throws Exception {
			jogo = new CriadorDeJogo()
					.para("Cata moedas")
					.resultado(new Participante("Nelson"), 150.0)
					.resultado(new Participante("Pedro"), 200.0)
					.constroi();
		}

		@Quando("existe dois resultados")
		public void existeDoisResultados() {
		}

		@E("de participantes diferentes")
		public void deParticipantesDiferentes() {
		}

		@Entao("o jogo eh considerado valido")
		public void oJogoEhConsideradoValido() {
			assertEquals(2, jogo.getResultados().size());
			assertEquals(150.0, jogo.getResultados().get(0).getMetrica(), 0.00001);
			assertEquals(200.0, jogo.getResultados().get(1).getMetrica(), 0.00001);
		}

		@Quando("um participante")
		public void umParticipante() {
			jogo = new Jogo("Ca�a pe�as");
			participante = new Participante("Leonardo");
		}

		@E("anotar dois ou mais resultados deste participante")
		public void anotarDoisOuMaisResultadosDesteParticipante() {
			jogo.anota(new Resultado(participante, 500.0));
			//deve ser ignorado
			jogo.anota(new Resultado(participante, 600.0));
		}

		@Entao("o segundo resultado deve ser ignorado")
		public void oSegundoResultadoDeveSerIgnorado() {
			assertEquals(1, jogo.getResultados().size());
			assertEquals(500, jogo.getResultados().get(0).getMetrica(), 0.00001);
		}
}
	
	

