package lista_de_exercicios_lms.stream_optional_operadores_intermediarios_e_terminais.exercicio_07;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Filtro {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(
                -1, -2, -45, -3, -92, -50, -10, -88, -48, -58,
                -7, -6, -62, -35, -71, 50, 21, 82, 57, 25,0
        );
        System.out.println(removerNegativos(numeros));
    }

    public static List<Integer> removerNegativos(List<Integer> numeros) {
        return numeros.stream().filter(n -> n >= 0).toList();
    }
}
