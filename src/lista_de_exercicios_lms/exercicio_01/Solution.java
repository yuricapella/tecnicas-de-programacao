package lista_de_exercicios_lms.exercicio_01;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Solution {
    public static void main(String[] args) {
        String data = "11/09/1999";
        String data3 = converteData(data);
        System.out.println(data3);
    }
    public static String converteData(String dataRecebida) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate stringEmData = LocalDate.parse(dataRecebida,formatter);
        LocalDate dataNoFuturo = stringEmData.plusDays(3);
        return dataNoFuturo.format(formatter);
    }
}
