package exercices.aula1.funcionario;

public class Funcionario {

    private int cracha;
    private String nome;
    private char tipoVinculo;
    private double valorHora;
    private double qtdeHora;
    private double salario;
    private double valorDesconto;

    public int getCracha() {
        return cracha;
    }

    public void setCracha(int cracha) {
        this.cracha = cracha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getTipoVinculo() {
        return tipoVinculo;
    }

    public void setTipoVinculo(char tipoVinculo) {
        this.tipoVinculo = tipoVinculo;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getQtdeHora() {
        return qtdeHora;
    }

    public void setQtdeHora(double qtdeHora) {
        this.qtdeHora = qtdeHora;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public double calcularSalario() {
        return this.tipoVinculo == 'H' ? (this.valorHora * this.qtdeHora) - this.valorDesconto : this.salario - this.valorDesconto;
    }

    public String imprimir() {

        double salary = this.tipoVinculo == 'H' ? this.valorHora * this.qtdeHora : this.salario;

        return
                "Cracha: " + this.cracha + "\n" +
                        "Nome: " + this.nome + "\n" +
                        "Tipo: " + this.tipoVinculo + "\n" +
                        "Salario: " + salary + "\n" +
                        "Desconto: " + this.valorDesconto + "\n" +
                        "Valor a receber: " + this.calcularSalario() + "\n";
    }
}
