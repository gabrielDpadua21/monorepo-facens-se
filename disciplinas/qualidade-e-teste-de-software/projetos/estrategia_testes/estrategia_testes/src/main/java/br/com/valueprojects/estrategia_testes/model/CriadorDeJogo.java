package br.com.valueprojects.estrategia_testes.model;

public class CriadorDeJogo {
	
	private Jogo jogo;

    public CriadorDeJogo() { }

    public CriadorDeJogo para(String descricao) {
        this.jogo = new Jogo(descricao);
        return this;
    }

    public CriadorDeJogo resultado(Participante participante, double metrica) throws Exception {
        if(metrica <= 0) {
            throw new Exception("Invalid result");
        }
        jogo.anota(new Resultado(participante, metrica));
        return this;
    }

    public Jogo constroi() { 
        return jogo;
    }

}
