package OO.heranca.overhide;

public class PessoaFisica extends Pessoa {

    private String nome;
    private String cpf;

    public PessoaFisica() {}

    public PessoaFisica(String nome, String cpf, String email, String celular) {
        super(email, celular);
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String imprimir() {
        return "Nome: " + this.nome + "\n"+
                "Cpf: " + this.cpf + "\n" +
                "Email: " + this.getEmail() + "\n" +
                "Celular: " + this.getCelular();
    }

}
