package exercices.aula4.funcionario;

public class Consultor extends Funcionario {

    @Override
    public double getSalario() {
        return super.getSalario() * 1.1;
    }

    public double getSalario(float porcentagem) {
        return super.getSalario() * porcentagem;
    }
}
