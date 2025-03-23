package lista_de_exercicios_lms.stream_optional_operadores_intermediarios_e_terminais.exercicio_01;

import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.Function;
import java.util.stream.Stream;

public class AnalisadorIdade {
    public static void main(String[] args) {
        List<Integer> colecao = List.of(12, 15, 18, 20, 22, 16, 25);

        Predicate<Integer> verificador = criarVerificador();
        List<Integer> maioresDeIdade = remover(colecao, verificador);

        System.out.println(maioresDeIdade);
    }

    public static Predicate<Integer> criarVerificador() {
        return idade -> idade < 18;
    }

    public static List<Integer> remover(List<Integer> colecao, Predicate<Integer> verificador) {
        return colecao.stream().filter(idade -> !verificador.test(idade)).toList();
    }
}
