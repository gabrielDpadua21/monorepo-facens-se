package exercices.aula1.aluno;

public class Student {

    private String ra;
    private String name;
    private float ac1;
    private float ac2;
    private float ag;
    private float af;

    public Student() {}

    public Student(String ra, String name, float ac1, float ac2, float ag, float af) {
        this.ra = ra;
        this.name = name;
        this.ac1 = ac1;
        this.ac2 = ac2;
        this.ag = ag;
        this.af = af;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAc1() {
        return ac1;
    }

    public void setAc1(float ac1) {
        this.ac1 = ac1;
    }

    public float getAc2() {
        return ac2;
    }

    public void setAc2(float ac2) {
        this.ac2 = ac2;
    }

    public float getAg() {
        return ag;
    }

    public void setAg(float ag) {
        this.ag = ag;
    }

    public float getAf() {
        return af;
    }

    public void setAf(float af) {
        this.af = af;
    }

    public double calcularMedia() {
        return (this.ac1 * 0.15) + (this.ac2 * 0.30) + (this.ag * 0.10) + (this.af * 0.45);
    }

    public String verificarAprovacao() {
        return calcularMedia() > 5 ? "Aprovado" : "Reprovado";
    }

    public String imprimir() {
        return
                "ra: " + this.ra + "\n" +
                "name: " + this.name + "\n" +
                "ac1: " + this.ac1 + "\n"+
                "ac2:" + this.ac2 + "\n" +
                "ag: " + this.ag + "\n" +
                "af: " + af + "\n" +
                "Media: " + this.calcularMedia() + "\n" +
                "Situacao: " + this.verificarAprovacao();
    }
}
