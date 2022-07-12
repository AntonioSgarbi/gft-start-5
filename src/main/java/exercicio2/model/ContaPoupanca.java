package exercicio2.model;

public class ContaPoupanca extends Conta{

    public ContaPoupanca() { }

    public ContaPoupanca(long numero, String titular, double saldo) {
        super(numero, titular, saldo);
    }

    @Override
    public double rendimento() {
        return this.saldo * 0.05;
    }
}
