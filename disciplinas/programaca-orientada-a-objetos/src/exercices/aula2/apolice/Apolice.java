package exercices.aula2.apolice;

public class Apolice {

    private int numero;
    private String nome;
    private int idade;
    private char sexo;
    private double valorAutomovel;

    Apolice(){}

    public Apolice(int numero, String nome, int idade, char sexo, double valorAutomovel) {
        this.numero = numero;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.valorAutomovel = valorAutomovel;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getValorAutomovel() {
        return valorAutomovel;
    }

    public void setValorAutomovel(double valorAutomovel) {
        this.valorAutomovel = valorAutomovel;
    }

    public double calcularValor() {
        if( this.sexo == 'M' && this.idade <= 25) {
            return valorAutomovel * 10 / 100;
        } else if( this.sexo == 'M' && this.idade > 25) {
            return valorAutomovel * 5 / 100;
        }

        return valorAutomovel * 2 / 100;
    }

    public String imprimir() {
        return "Numero: " + this.numero + "\n" +
                "Nome: " + this.nome + "\n" +
                "Idade: " + this.sexo + "\n" +
                "Valor Automovel: " + this.valorAutomovel + "\n" +
                "Valor Apolice: " + this.calcularValor();
    }
}
