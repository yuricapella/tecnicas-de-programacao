package lista_de_exercicios_lms.exercicio_03;

import java.time.DayOfWeek;
import java.time.LocalDate;

import static lista_de_exercicios_lms.exercicio_01.Solution.converteData;

public class Solution {
    public static void main(String[] args) {
        int mes = 8;
        int ano = 2021;
        boolean sextaFeira13 = ehSexta13(mes,ano);
        System.out.println(sextaFeira13);

        int mes2 = 6;
        int ano2 = 2022;
        boolean sextaFeira13_2 = ehSexta13(mes2,ano2);
        System.out.println(sextaFeira13_2);
    }

    public static boolean ehSexta13(int mes, int ano) {
        if (mes < 1 || mes > 12 || ano < 1) {
            return false;
        }

        LocalDate data = LocalDate.of(ano,mes,13);
        return data.getDayOfWeek() == DayOfWeek.FRIDAY;
    }
}
