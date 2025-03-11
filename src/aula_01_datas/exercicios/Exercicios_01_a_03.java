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
        System.out.println("EXERCICIO 01 - FORMATAR PARA dd/MM/yyyy HH:mm:ss");
        LocalDateTime hoje = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime hojeFormatado = LocalDateTime.parse(hoje.format(formatter), formatter);

        String hojeEmStringFormatado = hoje.format(formatter);

        System.out.println("PRIMEIRO JEITO, FORMATANDO EM LOCAL DATE TIME COM PARSE");
        System.out.println(hojeFormatado);

        System.out.println("SEGUNDO JEITO, TRANSFORMANDO A DATA FORMATADA EM STRING");
        System.out.println(hojeEmStringFormatado);

        System.out.println("EXERCICIO 02 - ADICIONAR 15 DIAS À DATA ATUAL E EXIBIR O NOVO VALOR");
        LocalDateTime dataDaProva = hojeFormatado.plusDays(15);
        System.out.println(dataDaProva.format(formatter));

        System.out.println("BONUS - ADICIONAR HORAS");
        LocalDateTime provaAtrasada = dataDaProva.plusHours(3);
        System.out.println(provaAtrasada.format(formatter));

        System.out.println("BONUS - ADICIONAR SEGUNDOS");
        LocalDateTime entregandoAsProvas = provaAtrasada.plusSeconds(45);
        System.out.println(entregandoAsProvas.format(formatter));

        System.out.println("EXERCICIO 03 - COMPARAÇÃO DE DATA MAIS ANTIGA");
        LocalDateTime comparaAntiga = getMaisAntiga(hoje, entregandoAsProvas);
        System.out.printf("Entre as datas %s e %s, a mais antiga é a %s%n",hoje,entregandoAsProvas,comparaAntiga.format(formatter));
    }

    private static LocalDateTime getMaisAntiga(LocalDateTime data, LocalDateTime outraData) {
        if (data.isBefore(outraData)) {
            return data;
        }else {
            return outraData;
        }
    }
}
