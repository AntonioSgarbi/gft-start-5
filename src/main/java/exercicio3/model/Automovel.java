package exercicio3.model;

public abstract class Automovel {
    protected Combustivel combustivel;

    public Automovel(Combustivel combustivel) {
        this.combustivel = combustivel;
    }

    public Combustivel getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(Combustivel combustivel) {
        this.combustivel = combustivel;
    }
}
