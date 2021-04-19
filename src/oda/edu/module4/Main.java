package oda.edu.module4;/*
  @author   Denys Ovdiienko
  @project   oda.edu
  @class  Main
  @version  1.0.0 
  @since 19.04.2021 - 20.47
*/

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) throws IOException {
        LocalDate date = LocalDate.of(2020, Month.FEBRUARY, 10);


        LocalDateTime start = LocalDateTime.now();

        for (int i = 0; i < 5; i++) {

            LogsService.getLogsCountByDate(date.plusDays(i));
        }
        for (int i = 0; i < 5; i++) {
            LogsService.logsByDateToFile("D:\\logs.txt", date.plusDays(i));

        }
        LocalDateTime finish = LocalDateTime.now();

        System.out.println("Duration is  " + ChronoUnit.MILLIS.between(start, finish) + " msc");


        System.out.println("------------------------------MultiThread-----------------------------------------------");


        date = LocalDate.of(2020, Month.FEBRUARY, 10);


        for (int i = 0; i < 5; i++) {
            new MyThread(date.plusDays(i)).start();
        }
        for (int i = 0; i < 5; i++) {
            LogsService.logsByDateToFile("D:\\logs.txt", date.plusDays(i));

        }

    }
}
/*
2020-02-10 6987
2020-02-11 7086
2020-02-12 4731
2020-02-13 4817
2020-02-14 5315
Duration is  34046 msc
------------------------------MultiThread-----------------------------------------------
Thread-0 has been started at 2021-04-19T21:02:37.176
Thread-4 has been started at 2021-04-19T21:02:37.182
Thread-3 has been started at 2021-04-19T21:02:37.182
Thread-2 has been started at 2021-04-19T21:02:37.186
Thread-1 has been started at 2021-04-19T21:02:37.196
2020-02-11 7086
Thread-1 has been finished 2021-04-19T21:02:53.212
Thread-1 Duration is  16016 msc
2020-02-12 4731
Thread-2 has been finished 2021-04-19T21:02:53.231
Thread-2 Duration is  16045 msc
2020-02-10 6987
Thread-0 has been finished 2021-04-19T21:02:53.381
Thread-0 Duration is  16205 msc
2020-02-13 4817
Thread-3 has been finished 2021-04-19T21:02:54.405
Thread-3 Duration is  17223 msc
2020-02-14 5315
Thread-4 has been finished 2021-04-19T21:02:54.412
Thread-4 Duration is  17230 msc

Process finished with exit code 0

 */
