package exercicio1;

public class Pessoa {
    private int idade;
    private double peso;

    public Pessoa(){ }

    public Pessoa(int idade, double peso) {
        this.idade = idade;
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
