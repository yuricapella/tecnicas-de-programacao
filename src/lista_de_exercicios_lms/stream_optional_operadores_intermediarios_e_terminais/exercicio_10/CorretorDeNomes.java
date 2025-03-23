package lista_de_exercicios_lms.stream_optional_operadores_intermediarios_e_terminais.exercicio_10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CorretorDeNomes {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("joao", "maria", "pedro", "ana");
        List<String> nomesCorrigidos = corrigir(nomes);
        System.out.println(nomesCorrigidos);
    }
    public static List<String> corrigir(List<String> nomes){
        return nomes.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }
}
