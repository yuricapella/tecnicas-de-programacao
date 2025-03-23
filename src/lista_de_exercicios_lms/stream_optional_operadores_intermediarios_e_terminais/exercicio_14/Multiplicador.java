package lista_de_exercicios_lms.stream_optional_operadores_intermediarios_e_terminais.exercicio_14;

import java.util.Arrays;
import java.util.List;

public class Multiplicador {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(dobrarComStream(lista));
        System.out.println(dobrarComReplaceAll(lista));
    }
    public static List<Integer> dobrarComStream(List<Integer> numeros) {
        return numeros.stream()
                .map(n -> n * 2)
                .toList();
    }
    public static List<Integer> dobrarComReplaceAll(List<Integer> numeros) {
        numeros.replaceAll(n->n*2);
        return numeros;
    }
}
