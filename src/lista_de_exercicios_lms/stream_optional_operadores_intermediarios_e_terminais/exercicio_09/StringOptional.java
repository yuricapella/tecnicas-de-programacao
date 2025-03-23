package lista_de_exercicios_lms.stream_optional_operadores_intermediarios_e_terminais.exercicio_09;

import java.util.Optional;

public class StringOptional {
    public static void main(String[] args) {
        String str1 = "Hello, World!";
        String str2 = "";
        String str3 = null;
        String str4 = " ";

        System.out.println(optionalOfString(str1));
        System.out.println(optionalOfString(str2));
        System.out.println(optionalOfString(str3));
        System.out.println(optionalOfString(str4));
    }

    public static Optional<String> optionalOfString(String text) {
        return Optional.ofNullable(text)
                .filter(s -> !s.isEmpty() && !s.trim().isEmpty());
    }
}
