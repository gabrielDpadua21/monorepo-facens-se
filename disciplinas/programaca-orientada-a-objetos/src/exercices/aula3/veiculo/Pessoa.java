package exercices.aula3.veiculo;

import exercices.aula3.curso.Aluno;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {

    private int codigo;
    private String nome;
    private List<Automovel> automoveis = new ArrayList<Automovel>();

    public Pessoa() {}

    public Pessoa(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void inserirAutomovel(Automovel automovel) {
        this.automoveis.add(automovel);
    }

    public void excluirAutomovel(String modelo) {
        this.automoveis.removeIf(aut -> aut.getModelo().equals(modelo));
    }

    public List<Automovel> getAutomoveis() {
        return this.automoveis;
    }

    public String imprimir() {
        return  "\nCodigo: " + this.codigo +
                "\nNome: " + this.nome;
    }

    public String imprimirCompleto() {
        String response = "\nPessoa: \n" + this.imprimir();

        response += "\n Carros: \n \n";

        for (Automovel automovel : this.automoveis) {
            response += automovel.imprimir();
        }

        return response;
    }
}
