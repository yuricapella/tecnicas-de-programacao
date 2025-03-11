package aula_01_datas.desafio_extra;
/*
Desafio Extra 🚀
📌 Problema:
Um curso começa em uma data específica e possui 9 aulas, acontecendo às segundas, quartas e sextas-feiras. O desafio é criar um programa em Java que calcule as datas de cada uma das aulas automaticamente.

Como entrada o programa receberá apenas a data da primeira aula.
Caso a data da primeira aula não seja um dia válido de aula o programa de ve retornar um erro e interromper o processamento.
 */

import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class DiasDeAula {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int ano, mes, dia;
        int aulas = 9;
        int contador = 0;
        LocalDate dataInicial = null;
        LocalDate[] dataAulas = new LocalDate[aulas];

        DayOfWeek[] diasSemana = {DayOfWeek.MONDAY, DayOfWeek.WEDNESDAY, DayOfWeek.FRIDAY};

        try {
            System.out.println("Digite o ano:");
            ano = entrada.nextInt();
            System.out.println("Digite o mês:");
            mes = entrada.nextInt();
            System.out.println("Digite o dia:");
            dia = entrada.nextInt();

            dataInicial = LocalDate.of(ano,mes,dia);
        }catch (DateTimeException e){
            System.out.println("Erro: Data inválida. Verifique o dia, mês e ano.");
        }catch (Exception e) {
            System.out.println("Erro: Entrada inválida. Certifique-se de digitar números inteiros.");
        }

        LocalDate dataAtual = dataInicial;

        while (contador < aulas) {
            if (isDiaValido(dataAtual, diasSemana)) {
                dataAulas[contador] = dataAtual;
                System.out.println("Aula " + (contador + 1) + " (" + dataAtual.getDayOfWeek() + "): " + dataAtual);
                contador++;
            }
            dataAtual = dataAtual.plusDays(1);
        }
    }

    private static boolean isDiaValido(LocalDate data, DayOfWeek[] diasSemana) {
        for (DayOfWeek diaSemana : diasSemana) {
            if (data.getDayOfWeek() == diaSemana) {
                return true;
            }
        }
        return false;
    }
}
