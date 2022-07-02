package br.com.value.projects.dominio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Jogo {

	private String descricao;
	private List<Resultado> resultados;
	
	public Jogo(String descricao) {
		this.descricao = descricao;
		this.resultados = new ArrayList<Resultado>();
	}
	
	public void anota(Resultado resultado) {
		if(resultados.isEmpty() || 
                !resultados.get(ultimoResultadoVisto()).getParticipante().equals(resultado.getParticipante())) {
            resultados.add(resultado);
        }
		
		
	}

	private int ultimoResultadoVisto() {
		return resultados.size()-1;
	}

	public String getDescricao() {
		return descricao;
	}

	public List<Resultado> getResultados() {
		return Collections.unmodifiableList(resultados);
	}

	public double getMean() throws Exception {
		if(this.resultados.isEmpty()) throw new Exception("Game not have results");
		double sum = 0;
		sum = this.resultados.stream()
				.map(item -> item.getMetrica())
				.reduce(0.0, (subtotal, item) -> subtotal += item);
		return sum / resultados.size();
	}
}
