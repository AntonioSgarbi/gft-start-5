package exercicio2;

import exercicio2.model.Conta;
import exercicio2.model.ContaCorrente;
import exercicio2.model.ContaPoupanca;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Inicio do programa");

        Conta contaCorrente = new ContaCorrente();
        contaCorrente.setTitular("José Pereira");
        contaCorrente.setNumero(123);
        contaCorrente.setSaldo(1800.0);
        contaCorrente.toString();

        Conta contaPoupanca = new ContaPoupanca();
        contaPoupanca.setTitular("João da Silva");
        contaPoupanca.setNumero(234);
        contaPoupanca.setSaldo(2500.0);
        contaPoupanca.toString();

        System.out.println("Fim do programa");
    }

}
