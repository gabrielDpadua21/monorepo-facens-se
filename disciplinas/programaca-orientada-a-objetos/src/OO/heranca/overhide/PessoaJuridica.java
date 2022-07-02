package OO.heranca.overhide;

public class PessoaJuridica extends Pessoa{

    private String razao;
    private String cnpj;

    public PessoaJuridica() {}

    public PessoaJuridica(String razao, String cnpj, String email, String celular) {
        super(email, celular);
        this.razao = razao;
        this.cnpj = cnpj;
    }

    public String getRazao() {
        return razao;
    }

    public void setRazao(String razao) {
        this.razao = razao;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String imprimir() {
        return "Razao social: " + this.razao + "\n"+
                "Cnpj: " + this.cnpj + "\n" +
                "Email: " + this.getEmail() + "\n" +
                "Celular: " + this.getCelular();
    }

}
