package aula_01_datas.exercicios.exercicio_01;
/*
Crie uma aplicação Java que exiba a data e hora atuais no formato dd/MM/yyyy HH:mm:ss.
 */

import java.time.LocalDate;

public class a {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);
    }
}
