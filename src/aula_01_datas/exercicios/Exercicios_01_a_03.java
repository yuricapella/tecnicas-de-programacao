package aula_01_datas.exercicios;
/*

Prática ✍️
🔹 Exercícios:
1️⃣ Crie uma aplicação Java que exiba a data e hora atuais no formato dd/MM/yyyy HH:mm:ss.
2️⃣ Implemente um código que adicione 15 dias à data atual e exiba o novo valor.
3️⃣ Compare duas datas e exiba qual delas é mais antiga.
 */

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exercicios_01_a_03 {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        System.out.println("=====================================");
        System.out.println("🕒 EXERCÍCIO 01 - FORMATANDO DATA E HORA");
        LocalDateTime hoje = LocalDateTime.now();

        LocalDateTime hojeFormatado = LocalDateTime.parse(hoje.format(formatter), formatter);
        String hojeEmStringFormatado = hoje.format(formatter);

        System.out.println("➤ Formato LocalDateTime com parse:");
        System.out.println(hojeFormatado);
        System.out.println("➤ Formato String:");
        System.out.println(hojeEmStringFormatado);

        System.out.println("=====================================");
        System.out.println("📆 EXERCÍCIO 02 - ADICIONANDO 15 DIAS À DATA ATUAL");
        LocalDateTime dataDaProva = hojeFormatado.plusDays(15);
        System.out.println("Data após 15 dias: " + dataDaProva.format(formatter));

        System.out.println("➤ BÔNUS - ADICIONANDO HORAS");
        LocalDateTime provaAtrasada = dataDaProva.plusHours(3);
        System.out.println("Data após 15 dias + 3 horas: " + provaAtrasada.format(formatter));

        System.out.println("➤ BÔNUS - ADICIONANDO SEGUNDOS");
        LocalDateTime entregandoAsProvas = provaAtrasada.plusSeconds(45);
        System.out.println("Data após 15 dias + 3 horas + 45 segundos: " + entregandoAsProvas.format(formatter));

        System.out.println("=====================================");
        System.out.println("⏳ EXERCÍCIO 03 - COMPARAÇÃO ENTRE DATAS");
        LocalDateTime comparaAntiga = getDataMaisAntiga(hoje, entregandoAsProvas);
        System.out.printf("Entre as datas %s e %s, a mais antiga é: %s%n",
                hoje.format(formatter), entregandoAsProvas.format(formatter), comparaAntiga.format(formatter));
        System.out.println("=====================================");
    }

    private static LocalDateTime getDataMaisAntiga(LocalDateTime data, LocalDateTime outraData) {
        if (data.isBefore(outraData)) {
            return data;
        }else {
            return outraData;
        }
    }
}
