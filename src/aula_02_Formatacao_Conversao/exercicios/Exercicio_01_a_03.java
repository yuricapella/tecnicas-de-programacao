package aula_02_Formatacao_Conversao.exercicios;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/*
🔹 Teste seus conhecimentos:
1️⃣ Escreva um programa que exiba a data atual formatada como "dd-MM-yyyy".
2️⃣ Converta a String "07/03/2024" para um LocalDate e exiba o resultado.
3️⃣ Escreva um código que exiba a hora exata em São Paulo e em Londres.
 */
public class Exercicio_01_a_03 {
    public static void main(String[] args) {
        System.out.println("EXERCICIO 01 - exiba a data atual formatada como dd-MM-yyyy");
        LocalDate data = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(data.format(formatter));

        System.out.println("EXERCICIO 02 - Converta a String 07/03/2024 para um LocalDate");
        String dataString = "07/03/2024";
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataParsed = LocalDate.parse(dataString, formatter2);
        System.out.println(dataParsed);
        System.out.println("Para exibir no formato igual ao que está na string: \n" +
                dataParsed.format(formatter2));

        System.out.println("EXERCICIO 03 - Escreva um código que exiba a hora exata em São Paulo e em Londres");
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("HH:mm:ss");
        ZonedDateTime agoraSaoPaulo = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));
        System.out.println("Sao paulo: "+agoraSaoPaulo.format(formatter3));
        ZonedDateTime agoraLondres = ZonedDateTime.now(ZoneId.of("Europe/London"));
        System.out.println("Londres: "+agoraLondres.format(formatter3));
        /*
        Utilizando o metodo ZoneId.getAvailableZoneIds().forEach(System.out::println);
        America/Sao_Paulo
        Europe/London
        */
    }
}
