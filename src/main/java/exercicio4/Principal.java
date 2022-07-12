package exercicio4;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        if(idade >= 18 && idade <= 67) {
            System.out.println("Você pode doar Sangue!");
        } else {
            System.out.println("Você não pode doar Sangue!");
        }
    }
}
