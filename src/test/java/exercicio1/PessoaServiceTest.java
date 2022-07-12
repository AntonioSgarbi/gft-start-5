package exercicio1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PessoaServiceTest extends PessoaServiceImpl {
    PessoaService pessoaService;
    @BeforeAll
    void beforeAll() {
        this.pessoaService = new PessoaServiceImpl();
    }

    @Test
    @DisplayName("Deve retornar a média de peso das pessoas até 10 anos")
    void calcularMediaPorIdade0() {
        int idade1 = 4;
        double peso1 = 40.0;

        int idade2 = 5;
        double peso2 = 60.0;

        int idade3 = 4;
        double peso3 = 30.0;

        int idade4 = 7;
        double peso4 = 50.0;

        int idade5 = 8;
        double peso5 = 45.0;

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa(idade1, peso1));
        pessoas.add(new Pessoa(idade2, peso2));
        pessoas.add(new Pessoa(idade3, peso3));
        pessoas.add(new Pessoa(idade4, peso4));
        pessoas.add(new Pessoa(idade5, peso5));

        double media = (peso1 + peso2 + peso3 + peso4 + peso5) / 5;

        String saidaEsperada = "A Média de peso das pessoas é: " +
                "de 10 anos: " + media +
                ", de 11 a 20 anos: 0.0" +
                ", de 21 a 30 anos: 0.0" +
                ", de 31 anos ou mais: 0.0";
        assertEquals(saidaEsperada, pessoaService.calcularMediaPorIdade(pessoas));
    }

    @Test
    @DisplayName("Deve retornar a média de peso das pessoas entre 11 e 20 anos")
    void calcularMediaPorIdade1() {
        int idade1 = 11;
        double peso1 = 40.0;

        int idade2 = 14;
        double peso2 = 60.0;

        int idade3 = 15;
        double peso3 = 30.0;

        int idade4 = 16;
        double peso4 = 50.0;

        int idade5 = 20;
        double peso5 = 45.0;

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa(idade1, peso1));
        pessoas.add(new Pessoa(idade2, peso2));
        pessoas.add(new Pessoa(idade3, peso3));
        pessoas.add(new Pessoa(idade4, peso4));
        pessoas.add(new Pessoa(idade5, peso5));

        double media = (peso1 + peso2 + peso3 + peso4 + peso5) / 5;

        String saidaEsperada = "A Média de peso das pessoas é: " +
                "de 10 anos: 0.0" +
                ", de 11 a 20 anos: " + media +
                ", de 21 a 30 anos: 0.0" +
                ", de 31 anos ou mais: 0.0";
        assertEquals(saidaEsperada, pessoaService.calcularMediaPorIdade(pessoas));
    }

    @Test
    @DisplayName("Deve retornar a média de peso das pessoas entre 21 e 30 anos")
    void calcularMediaPorIdade2() {
        int idade1 = 21;
        double peso1 = 90.0;

        int idade2 = 24;
        double peso2 = 60.0;

        int idade3 = 25;
        double peso3 = 80.0;

        int idade4 = 26;
        double peso4 = 63.0;

        int idade5 = 30;
        double peso5 = 32.0;

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa(idade1, peso1));
        pessoas.add(new Pessoa(idade2, peso2));
        pessoas.add(new Pessoa(idade3, peso3));
        pessoas.add(new Pessoa(idade4, peso4));
        pessoas.add(new Pessoa(idade5, peso5));

        double media = (peso1 + peso2 + peso3 + peso4 + peso5) / 5;

        String saidaEsperada = "A Média de peso das pessoas é: " +
                "de 10 anos: 0.0" +
                ", de 11 a 20 anos: 0.0" +
                ", de 21 a 30 anos: " + media +
                ", de 31 anos ou mais: 0.0";
        assertEquals(saidaEsperada, pessoaService.calcularMediaPorIdade(pessoas));
    }

    @Test
    @DisplayName("Deve retornar a média de peso das pessoas com 31 anos ou mais")
    void calcularMediaPorIdade3() {
        int idade1 = 31;
        double peso1 = 90.0;

        int idade2 = 34;
        double peso2 = 60.0;

        int idade3 = 45;
        double peso3 = 80.0;

        int idade4 = 66;
        double peso4 = 63.0;

        int idade5 = 70;
        double peso5 = 32.0;

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa(idade1, peso1));
        pessoas.add(new Pessoa(idade2, peso2));
        pessoas.add(new Pessoa(idade3, peso3));
        pessoas.add(new Pessoa(idade4, peso4));
        pessoas.add(new Pessoa(idade5, peso5));

        double media = (peso1 + peso2 + peso3 + peso4 + peso5) / 5;

        String saidaEsperada = "A Média de peso das pessoas é: " +
                "de 10 anos: 0.0" +
                ", de 11 a 20 anos: 0.0" +
                ", de 21 a 30 anos: 0.0" +
                ", de 31 anos ou mais: " + media;
        assertEquals(saidaEsperada, pessoaService.calcularMediaPorIdade(pessoas));
    }

    @Test
    @DisplayName("Deve calcular a média de idade de uma lista de pessoas")
    void calcularMedia() {
        int idade1 = 10;
        double peso1 = 40.0;

        int idade2 = 14;
        double peso2 = 60.0;

        int idade3 = 15;
        double peso3 = 30.0;

        int idade4 = 16;
        double peso4 = 50.0;

        int idade5 = 20;
        double peso5 = 45.0;

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa(idade1, peso1));
        pessoas.add(new Pessoa(idade2, peso2));
        pessoas.add(new Pessoa(idade3, peso3));
        pessoas.add(new Pessoa(idade4, peso4));
        pessoas.add(new Pessoa(idade5, peso5));

        double media = (peso1 + peso2 + peso3 + peso4 + peso5) / 5;

        assertEquals(media, this.calcularMedia(pessoas));
    }

    @Test
    @DisplayName("Deve filtrar uma lista de pessoas baseado na idade")
    void filtrarPorIdadeEntre0() {
        int idade1 = 10;
        double peso1 = 40.0;

        int idade2 = 14;
        double peso2 = 60.0;

        int idade3 = 15;
        double peso3 = 30.0;

        int idade4 = 16;
        double peso4 = 50.0;

        int idade5 = 20;
        double peso5 = 45.0;

        int idade6 = 21;
        double peso6 = 55.0;

        int idade7 = 22;
        double peso7 = 55.0;

        Pessoa pessoa1 = new Pessoa(idade1, peso1);
        Pessoa pessoa2 = new Pessoa(idade2, peso2);
        Pessoa pessoa3 = new Pessoa(idade3, peso3);
        Pessoa pessoa4 = new Pessoa(idade4, peso4);
        Pessoa pessoa5 = new Pessoa(idade5, peso5);
        Pessoa pessoa6 = new Pessoa(idade6, peso6);
        Pessoa pessoa7 = new Pessoa(idade7, peso7);

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);
        pessoas.add(pessoa4);
        pessoas.add(pessoa5);
        pessoas.add(pessoa6);
        pessoas.add(pessoa7);

        List<Pessoa> listaEsperada = new ArrayList<>();
        listaEsperada.add(pessoa3);
        listaEsperada.add(pessoa4);
        listaEsperada.add(pessoa5);

        List<Pessoa> pessoasFiltradas = this.filtrarPorIdadeEntre(pessoas, 15, 20);




        assertEquals(listaEsperada.get(0).getIdade(), pessoasFiltradas.get(0).getIdade());
        assertEquals(listaEsperada.get(1).getIdade(), pessoasFiltradas.get(1).getIdade());
        assertEquals(listaEsperada.get(2).getIdade(), pessoasFiltradas.get(2).getIdade());
        assertEquals(listaEsperada.get(0).getPeso(), pessoasFiltradas.get(0).getPeso());
        assertEquals(listaEsperada.get(1).getPeso(), pessoasFiltradas.get(1).getPeso());
        assertEquals(listaEsperada.get(2).getPeso(), pessoasFiltradas.get(2).getPeso());
    }

}
