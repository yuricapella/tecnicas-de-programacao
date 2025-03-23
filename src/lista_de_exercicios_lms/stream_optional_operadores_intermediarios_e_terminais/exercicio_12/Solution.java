package lista_de_exercicios_lms.stream_optional_operadores_intermediarios_e_terminais.exercicio_12;

import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int resultado = somaLista(array);
        System.out.println("Resultado da soma: " + resultado);
    }
    public static int somaLista(int[] array) {
        List<Integer> lista = Arrays.stream(array).boxed().toList();
        return lista.stream().mapToInt(Integer::intValue).sum();
    }
}
