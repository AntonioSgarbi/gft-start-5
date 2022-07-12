package exercicio1;

import java.util.List;

public class PessoaServiceImpl implements PessoaService {

    @Override
    public String calcularMediaPorIdade(List<Pessoa> pessoas) {
        double mediaPorIdadeAte10 = this.calcularMedia(
                this.filtrarPorIdadeEntre(pessoas, 1, 10));
        double mediaPorIdadeEntre11e20 = this.calcularMedia(
                this.filtrarPorIdadeEntre(pessoas, 11, 20));
        double mediaPorIdadeEntre21e30 = this.calcularMedia(
                this.filtrarPorIdadeEntre(pessoas, 21, 30));
        double mediaPorIdadeMaior31 = this.calcularMedia(
                this.filtrarPorIdadeEntre(pessoas, 31, Integer.MAX_VALUE));

        return "A Média de peso das pessoas é: " +
                "de 10 anos: " + mediaPorIdadeAte10 +
                ", de 11 a 20 anos: " + mediaPorIdadeEntre11e20 +
                ", de 21 a 30 anos: " + mediaPorIdadeEntre21e30 +
                ", de 31 anos ou mais: " + mediaPorIdadeMaior31;
    }

    protected double calcularMedia(List<Pessoa> listaDePessoas) {
        if(listaDePessoas.isEmpty()) return 0.0;

        double soma = 0;
        for (Pessoa pessoa : listaDePessoas) {
            soma += pessoa.getPeso();
        }
        return soma / listaDePessoas.size();
    }

    protected List<Pessoa> filtrarPorIdadeEntre(List<Pessoa> pessoas, int idadeMinima, int idadeMaxima) {
        return pessoas.stream()
                .filter(pessoa -> pessoa.getIdade() >= idadeMinima && pessoa.getIdade() <= idadeMaxima)
                .toList();
    }


}
