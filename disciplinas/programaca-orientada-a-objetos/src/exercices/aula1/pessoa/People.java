package exercices.aula1.pessoa;

public class People {

    private String cpf;
    private String name;
    private String sex;
    private int age;

    public People() {}

    public People(String cpf, String name, String sex, int age) {
        this.cpf = cpf;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String printPeople() {
        return "Cpf: " + this.cpf + "\nNome: " + this.name + "\nSexo: " + this.sex + "\nIdade: " + this.age;
    }

}
