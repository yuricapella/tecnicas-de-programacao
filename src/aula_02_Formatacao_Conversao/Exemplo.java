package aula_02_Formatacao_Conversao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class Exemplo {
    public static void main(String[] args) {
        //mm vira minuto
        DateTimeFormatter formatter = new DateTimeFormatterBuilder().appendPattern("dd/MM/yyyy").toFormatter();

        String dateAsString = "13/04/2024";
        LocalDate dataFormatada = LocalDate.parse(dateAsString, formatter);
        System.out.println(dataFormatada);
    }
}
