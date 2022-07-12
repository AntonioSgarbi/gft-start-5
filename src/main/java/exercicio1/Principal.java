package exercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        PessoaService service = new PessoaServiceImpl();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de pessoas: ");
        final int QUANTIDADE_PESSOAS = scanner.nextInt();

        List<Pessoa> pessoas = new ArrayList<>(QUANTIDADE_PESSOAS);

        for(int i=0; i<QUANTIDADE_PESSOAS; i++) {
            System.out.printf("Digite a idade da pessoa %d%n", (i+1));
            int idade = scanner.nextInt();
            System.out.printf("Digite o peso da pessoa %d%n", (i+1));
            double peso = scanner.nextDouble();
            Pessoa pessoa = new Pessoa(idade, peso);
            pessoas.add(pessoa);
        }
        System.out.println(service.calcularMediaPorIdade(pessoas));
    }
}
