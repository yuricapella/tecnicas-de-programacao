package lista_de_exercicios_lms.exercicio_07;

import java.time.LocalDate;

public class CalculoData {
    public static void main(String[] args) {
        LocalDate data = LocalDate.now();
        int dias = 15;
        LocalDate dataNofuturo = avancaDias(data,dias);
        System.out.println(dataNofuturo);
    }

    public static LocalDate avancaDias(LocalDate data, int dias) {
        return data.plusDays(dias);
    }
}
