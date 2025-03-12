package lista_de_exercicios_lms.exercicio_09;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Solution {
    public static void main(String[] args) {
        String inicio = "01/01/2022";
        String fim = "01/01/2002";
        System.out.println(obterDiferencaEmAnos(inicio, fim));
    }
    public static int obterDiferencaEmAnos(String inicio, String fim) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data1 = LocalDate.parse(inicio, formatter);
        LocalDate data2 = LocalDate.parse(fim, formatter);
        return data1.until(data2).getYears();
    }
}
