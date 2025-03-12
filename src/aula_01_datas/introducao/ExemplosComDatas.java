package aula_01_datas.introducao;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ExemplosComDatas {
    public static void main(String[] args) {
        System.out.println("DATA COM ANOS MESES E DIAS");
        //cria instacia de LocalDate e após isso pode usar seus metodos, basicamente criar o construtor de LocalDate
        LocalDate date = LocalDate.now();
        //LocalDate date = LocalDate.now().getDayOfWeek(); assim nao da para usar pois nao tem como pegar uma data que ainda nao existe.

        System.out.println(date.getDayOfWeek());

        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        LocalDateTime dateTimeof = LocalDateTime.of(date, time);
        System.out.println(date);

        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());


    }
}
