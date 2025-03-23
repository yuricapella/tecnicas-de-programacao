package lista_de_exercicios_lms.stream_optional_operadores_intermediarios_e_terminais.exercicio_05;

import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        int[] input1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] input2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(calculaMediaPares(input1));  // Esperado: 4.0 (0,2,4,6,8)
        System.out.println(calculaMediaPares(input2));  // Esperado: 5.0 (2,4,6,8)
    }
    public static double calculaMediaPares(int[] input) {
        return IntStream.of(input)
                .filter(i->i%2==0)
                .average().orElse(0.0);
    }
}