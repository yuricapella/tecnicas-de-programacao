package lista_de_exercicios_lms.stream_optional_operadores_intermediarios_e_terminais.exercicio_08;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] array = {6, 10, 3, 4, 8, 1, 7, 5, 9, 2};
        int[] arrayOrdenado = ordenarListaComLambda(array);

        System.out.println("Original: " + Arrays.toString(array));
        System.out.println("Ordenado: " + Arrays.toString(arrayOrdenado));
    }

    public static int[] ordenarListaComLambda(int[] array) {
        return Arrays.stream(array).sorted().toArray();
    }
}
