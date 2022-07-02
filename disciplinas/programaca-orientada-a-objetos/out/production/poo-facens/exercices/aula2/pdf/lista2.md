# Exercicios - Aula 2

## Lista Exercicio 2

### Classe Apolice

```java
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

```

### Classe App

```java
package exercices.aula2.apolice;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {
            List<Apolice> list = new ArrayList<Apolice>();
            int op;

            op = Integer.parseInt(JOptionPane.showInputDialog("1 - Criar Apolice: \n2 - Ver Dados Apolice \n0 - Sair"));

            do {
                switch (op) {
                    case 1:
                        list.add(createApolice());
                        break;
                    case 2:
                        printApolice(list);
                        break;
                    default:
                        JOptionPane.showMessageDialog(new JFrame(), "Opcao invalida!!!", "Error",
                                JOptionPane.ERROR_MESSAGE);
                }

                op = Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar? uma opcao: \n1 - Criar Apolice \n2 - Ver Dados Apolice \n0 - Sair"));
            } while(op != 0);


            JOptionPane.showMessageDialog(new JFrame(), "Bye!!!", "Info",
                    JOptionPane.INFORMATION_MESSAGE);


    }

    static Apolice createApolice() {
        Apolice ap = new Apolice();
        int opSex;

        ap.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite numero da apolice:")));

        ap.setNome(JOptionPane.showInputDialog("Digite o nome do beneficiario:"));

        ap.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do beneficiario:")));

        opSex = Integer.parseInt(JOptionPane.showInputDialog("Digite o sexo da pessoa ->  \n 1(M) \n 2(F)"));

        if(opSex == 1) {
            ap.setSexo('M');
        } else {
            ap.setSexo('F');
        }

        ap.setValorAutomovel(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do automovel:")));

        return ap;
    }

    static void printApolice(List<Apolice> apolices) {
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da apolice: "));

        List<Apolice> apolice = apolices.stream()
                .filter(ap -> ap.getNumero() == numero).collect(Collectors.toList());


        JOptionPane.showMessageDialog(new JFrame(), apolice.get(0).imprimir(), "Info",
                JOptionPane.INFORMATION_MESSAGE);
    }

}

```

### Classe Vendedor

```java
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

```

### Classe App

```java
package exercices.aula2.vendedor;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {

        List<Vendedor> list = new ArrayList<Vendedor>();
        int op;

        op = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastrar Vendedor: \n2 - Calcular venda \n0 - Sair"));

        do {
            switch (op) {
                case 1:
                    list.add(createSeller());
                    break;
                case 2:
                    printSell(list);
                    break;
                default:
                    JOptionPane.showMessageDialog(new JFrame(), "Opcao invalida!!!", "Error",
                            JOptionPane.ERROR_MESSAGE);
            }

            op = Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar? uma opcao: \n1 - Cadastrar Vendedor \n2 - Calcular venda \n0 - Sair"));
        } while(op != 0);


        JOptionPane.showMessageDialog(new JFrame(), "Bye!!!", "Info",
                JOptionPane.INFORMATION_MESSAGE);

    }

    static Vendedor createSeller() {
        Vendedor v = new Vendedor();

        v.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do vendedor")));

        v.setNome(JOptionPane.showInputDialog("Digite o nome do vendedor"));

        v.setPercentualComissao(Integer.parseInt(JOptionPane.showInputDialog("Digite o percentual % de comissao do vendedor")));

        return v;
    }

    static void printSell(List<Vendedor> vendedores) {
        int codigo;
        double valorVenda;
        double desconto;

        codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do vendedor:"));

        valorVenda = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da venda:"));

        desconto = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do desconto:"));

        List<Vendedor> vendedor = vendedores.stream()
                .filter(vend -> vend.getCodigo() == codigo).collect(Collectors.toList());


        JOptionPane.showMessageDialog(new JFrame(), vendedor.get(0).imprimir(valorVenda, desconto), "Info",
                JOptionPane.INFORMATION_MESSAGE);
    }

}
```

Gabriel D. Padua