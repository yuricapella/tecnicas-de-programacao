package aula_01_datas.desafio_01;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/*
🔹 Requisitos:
1️⃣ O programa deve solicitar ao usuário que insira a data de nascimento.
   Serão 3 entradas para compor a data. Começando pelo dia, mês e ano de nascimento.
2️⃣ Deve calcular a idade e verificar se a pessoa tem 18 anos ou mais.
3️⃣ Exibir uma mensagem informando se a pessoa é maior ou menor de idade.
 */
public class ValidaMaioridade {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int ano, mes, dia;
        LocalDate hoje = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("======================================");
        System.out.println("         Validação de Maioridade      ");
        System.out.println("======================================");

        System.out.print("Digite o dia: ");
        dia = entrada.nextInt();
        System.out.print("Digite o mês: ");
        mes = entrada.nextInt();
        System.out.print("Digite o ano: ");
        ano = entrada.nextInt();

        LocalDate dataDeNascimento = LocalDate.of(ano, mes, dia);
        int idade = getAnosIdade(hoje, dataDeNascimento);
        Period periodo = Period.between(dataDeNascimento, hoje);

        System.out.println("\n======================================");
        System.out.println("Resultado da Validação:");
        System.out.println("Data de Nascimento: " + dataDeNascimento.format(formatter));
        System.out.println("Data Atual:         " + hoje.format(formatter));
        System.out.println("--------------------------------------");
        System.out.println("Condição: " + (verificaMaioridade(idade) ? "Maior de idade" : "Menor de idade"));
        System.out.println("--------------------------------------");
        System.out.println("BONUS");
        System.out.printf("Idade Completa: %d anos, %d meses e %d dias\n", idade, periodo.getMonths(), periodo.getDays());
        System.out.println("======================================");
    }

    private static boolean verificaMaioridade(int idade) {
        return idade >= 18;
    }

    private static int getAnosIdade(LocalDate hoje, LocalDate dataDeNascimento) {
        Period periodo = dataDeNascimento.until(hoje);

        return periodo.getYears();
    }
}
