package entities;

public class Aluno {
    private String name;
    private double n1;
    private double n2;
    private double avg;

    public Aluno(String name, double n1, double n2) {
        this.name = name;
        this.n1 = n1;
        this.n2 = n2;
        this.avg = (n1 + n2) / 2;
    }

    public String getName() {
        return name;
    }

    public double getAvg() {
        return avg;
    }

}
