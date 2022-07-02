package br.com.valueprojects.estrategia_testes.UnitTest;
import org.junit.*;

import br.com.valueprojects.estrategia_testes.model.CriadorDeJogo;
import br.com.valueprojects.estrategia_testes.model.Jogo;
import br.com.valueprojects.estrategia_testes.model.Participante;
import br.com.valueprojects.estrategia_testes.model.Resultado;
import br.com.valueprojects.estrategia_testes.model.Juiz;



public class JulgamentoTeste {
   
	
	private Juiz juiz;
	private Participante joao;
	private Participante pedro;
	private Participante katia;
	private Participante maria;
	
	@Before
	public void criaJuiz(){

		this.juiz = new Juiz();
		this.joao = new Participante("Joao");
		this.pedro = new Participante("Pedro");
		this.katia = new Participante("Katia");
		this.maria =new Participante("Maria");
			
		}
	
	@Test
	public void deveJulgarPrimeiroEultimoColocado () {
		
		
		Jogo jogo = new Jogo("Derruba barreiras");

		jogo.anota(new Resultado(joao, 90.0));
		jogo.anota(new Resultado(pedro, 91.0));
		jogo.anota(new Resultado(katia, 93.0));
		jogo.anota(new Resultado(maria, 94.0));
		
		
		juiz.julga(jogo);
		
		double vencedorJogo = 94;
		double ultimoColocadoJogo = 90;
		
		Assert.assertEquals(vencedorJogo, juiz.getPrimeiroColocado(),0.00001);
		Assert.assertEquals(ultimoColocadoJogo, juiz.getUltimoColocado(),0.00001);
	}

	@Test(expected=Exception.class)
	public void avaliandoUmResultadoInvalidoParaJogo() throws Exception {
		Jogo jogo = new CriadorDeJogo()
				.para("Poker")
				.resultado(new Participante("Gabriel"), -1)
				.constroi();
	}
	
	@Test(expected=RuntimeException.class)
	public void naoDeveJulgarSemResultado() {
	    Jogo jogo = new CriadorDeJogo()
	        .para("Ca�a pe�as")
	        .constroi();

	    juiz.julga(jogo);
	}

}
