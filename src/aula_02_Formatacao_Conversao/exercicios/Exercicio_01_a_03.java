package aula_02_Formatacao_Conversao.exercicios;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
🔹 Teste seus conhecimentos:
1️⃣ Escreva um programa que exiba a data atual formatada como "dd-MM-yyyy".
2️⃣ Converta a String "07/03/2024" para um LocalDate e exiba o resultado.
3️⃣ Escreva um código que exiba a hora exata em São Paulo e em Londres.
 */
public class Exercicio_01_a_03 {
    public static void main(String[] args) {
        exibirDataFormatada();
        converterStringParaLocalDate();
        exibirHorarioCidades();
        exibirBonus();
    }

    private static void exibirDataFormatada() {
        System.out.println("=====================================");
        System.out.println("📅 EXERCÍCIO 01 - Exibir Data Formatada");

        LocalDate data = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("Data: " + data);
        System.out.println("Data formatada: " + data.format(formatter));
    }

    private static void converterStringParaLocalDate() {
        System.out.println("=====================================");
        System.out.println("📆 EXERCÍCIO 02 - Converter String para LocalDate");

        String dataString = "07/03/2024";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate dataConvertida = LocalDate.parse(dataString, formatter);
        System.out.println("Data convertida: " + dataConvertida);
        System.out.println("Formato original: " + dataConvertida.format(formatter));
    }

    private static void exibirHorarioCidades() {
        System.out.println("=====================================");
        System.out.println("⏳ EXERCÍCIO 03 - Horário em São Paulo e Londres");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        ZonedDateTime agoraSaoPaulo = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));
        ZonedDateTime agoraLondres = ZonedDateTime.now(ZoneId.of("Europe/London"));

        System.out.println("São Paulo: " + agoraSaoPaulo.format(formatter));
        System.out.println("Londres: " + agoraLondres.format(formatter));
    }

    private static void exibirBonus() {
        System.out.println("=====================================");
        System.out.println("BONUS - Exibição de horários para zonas com abreviação");

        System.out.println(getZone("sp"));
        System.out.println(getZone("ldn"));

        ZonedDateTime agoraSaoPaulo = ZonedDateTime.now(getZone("sp"));
        System.out.println("São Paulo: " + agoraSaoPaulo.format(DateTimeFormatter.ofPattern("HH:mm:ss")));

        ZonedDateTime agoraLondres = ZonedDateTime.now(getZone("ldn"));
        System.out.println("Londres: " + agoraLondres.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    }

    private static ZoneId getZone(String zone) {
        String zonaCompleta = bibliotecaDeZonas(zone);
        return ZoneId.of(zonaCompleta);
    }

    private static String bibliotecaDeZonas(String zone) {
        Map<String, String> ZONE_MAP = new HashMap<>();
        ZONE_MAP.put("sp", "America/Sao_Paulo");
        ZONE_MAP.put("ldn", "Europe/London");

        return ZONE_MAP.getOrDefault(zone, "Zona não encontrada: " + zone);
    }
}
