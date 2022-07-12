package exercicio3;

import exercicio3.model.Automovel;
import exercicio3.model.Caminhao;
import exercicio3.model.Esportivo;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        do {
            Automovel automovel;
            System.out.println("Insira o número do automóvel desejado:");
            System.out.println("1 - Caminhão");
            System.out.println("2 - Esportivo");
            System.out.println("3 - Sair");
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1 -> {
                    automovel = new Caminhao();
                    System.out.println("O combustível do automóvel selecionado é: " + automovel.getCombustivel());
                }
                case 2 -> {
                    automovel = new Esportivo();
                    System.out.println("O combustível do automóvel selecionado é: " + automovel.getCombustivel());
                }
                case 3 -> continuar = false;
                default -> System.out.println("Opção inválida!");
            }
        } while (continuar);
        System.out.println("Fim do programa!");
    }
}
