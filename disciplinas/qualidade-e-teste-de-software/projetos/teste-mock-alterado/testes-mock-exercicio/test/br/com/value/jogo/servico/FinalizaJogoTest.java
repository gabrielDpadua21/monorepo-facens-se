package br.com.value.jogo.servico;


import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import org.junit.Test;


import br.com.value.jogo.builder.CriadorDeJogo;
import br.com.value.jogo.dominio.Jogo;
import br.com.value.jogo.infra.dao.JogoDao;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;




public class FinalizaJogoTest {
	
	 @Test
	    public void deveFinalizarJogosDaSemanaAnterior() {

	        Calendar antiga = Calendar.getInstance();
	        antiga.set(1999, 1, 20);

	        Jogo jogo1 = new CriadorDeJogo().para("Cata moedas")
	            .naData(antiga).constroi();
	        Jogo jogo2 = new CriadorDeJogo().para("Derruba barreiras")
	            .naData(antiga).constroi();

	        //mock no lugar de dao falso
	        
	       List<Jogo> jogosAnteriores = Arrays.asList(jogo1, jogo2);
		   JogoDao daoFalso = mock(JogoDao.class);

	       when(daoFalso.emAndamento()).thenReturn(jogosAnteriores);
	        


	        FinalizaJogo finalizador = new FinalizaJogo(daoFalso);
	        finalizador.finaliza();

	        assertTrue(jogo1.isFinalizado());
	        assertTrue(jogo2.isFinalizado());
	        assertEquals(2, finalizador.getTotalFinalizados());
	        
	        
	        verify(daoFalso, times(3)).atualiza(jogo1);
	    }

	@Test
	public void deveFinalizarJogosDaSemanaAnteriorSpy() {

		Calendar antiga = Calendar.getInstance();
		antiga.set(1999, 1, 20);

		Jogo jogo1 = new CriadorDeJogo().para("Cata moedas")
				.naData(antiga).constroi();
		Jogo jogo2 = new CriadorDeJogo().para("Derruba barreiras")
				.naData(antiga).constroi();

		List<Jogo> jogosAnteriores = Arrays.asList(jogo1, jogo2);
		JogoDao daoSpy = Mockito.spy(new JogoDao());

		when(daoSpy.emAndamento()).thenReturn(jogosAnteriores);



		FinalizaJogo finalizador = new FinalizaJogo(daoSpy);
		finalizador.finaliza();

		assertTrue(jogo1.isFinalizado());
		assertTrue(jogo2.isFinalizado());
		assertEquals(2, finalizador.getTotalFinalizados());


		verify(daoSpy, times(2)).atualiza(jogo1);
	}
 }

	
	

	
