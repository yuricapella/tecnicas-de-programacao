package aula_02_Formatacao_Conversao.exercicios.desafio_01;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/*
🔹 Requisitos
✅ O usuário insere a data no formato "dd/MM/yyyy".
✅ Se a data for inválida, o programa exibe uma mensagem de erro.
✅ O programa continua pedindo a data até que uma válida seja informada.
 */
public class ValidaData {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String dataNascimentoString;
        LocalDate dataNascimento = null;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        boolean continuar = true;
        while (continuar) {
            try {
                System.out.println("Digite sua data de nascimento: (Exemplo: dd/MM/yyyy)");
                dataNascimentoString = entrada.nextLine();
                dataNascimento = LocalDate.parse(dataNascimentoString,formatter);
                continuar = false;
            }catch (DateTimeException e){
                System.out.println("Erro: Data inválida. Verifique o dia, mês e ano.");
            }catch (Exception e) {
                System.out.println("Erro: Entrada inválida. Certifique-se de digitar números inteiros.");
            }
        }
        System.out.println("Data de nascimento: "+dataNascimento.format(formatter));

    }
}
