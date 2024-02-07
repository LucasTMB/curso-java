package entities;

public class Quarto {
    private Estudante estudante;
    private int numero;

    public Quarto(int numero) {
        this.numero = numero;
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return this.numero +
                ": " + this.estudante.getNome() +
                ", " + this.estudante.getEmail();
    }
}
