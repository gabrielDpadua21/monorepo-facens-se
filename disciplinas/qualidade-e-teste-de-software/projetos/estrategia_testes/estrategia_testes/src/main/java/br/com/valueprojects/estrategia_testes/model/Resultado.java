package br.com.valueprojects.estrategia_testes.model;

public class Resultado {

	private Participante participante;
	private double metrica;
	
	public Resultado(Participante participante, double metrica) {
		this.participante = participante;
		this.metrica = metrica;
	}

	public Participante getParticipante() {
		return participante;
	}

	public double getMetrica() {
		return metrica;
	}
	
	
	
}
