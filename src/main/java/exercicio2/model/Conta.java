package exercicio2.model;

public abstract class Conta {
    protected long numero;
    protected String titular;
    protected double saldo;

    public Conta(){ }

    public Conta(long numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public abstract double rendimento();

    @Override
    public String toString() {
        String saida = String.format("%nConta: %d%nTitular: %s%nSaldo: %.2f%nRendimento: %.2f %n",
                this.numero, this.titular, this.saldo, this.rendimento());
        System.out.println(saida);
        return saida;
    }
}
