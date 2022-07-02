package exercices.aula2.vendedor;

public class Vendedor {

    private int codigo;
    private String nome;
    private double percentualComissao;

    public Vendedor() {}

    public Vendedor(int codigo, String nome, double percentualComissao) {
        this.codigo = codigo;
        this.nome = nome;
        this.percentualComissao = percentualComissao;
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

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    public double calcularPagamento(double valorVenda) {
        return valorVenda * (this.percentualComissao / 100);
    }

    public double calcularPagamento(double valorVenda, double desconto) {
        return calcularPagamento(valorVenda) - desconto;
    }

    public String imprimir(double valorVenda, double desconto) {
        return "Codigo: " + this.codigo + "\n" +
                "Nome: " + this.nome + "\n" +
                "Valor Venda: " + valorVenda + "\n" +
                "% Comissao: " + this.percentualComissao + "\n" +
                "Desconto: " + desconto + "\n" +
                "Valor a pagar: " + this.calcularPagamento(valorVenda, desconto);
    }
}
