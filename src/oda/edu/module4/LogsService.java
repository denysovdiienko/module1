package oda.edu.module4;/*
  @author   Denys Ovdiienko
  @project   oda.edu
  @class  LogsService
  @version  1.0.0 
  @since 19.04.2021 - 20.48
*/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class LogsService {
    private final static String file = "D:\\logs.txt";

    public LogsService() {
    }


    public static void logsByDate(String s) {
    }

    public String getFile() {
        return file;
    }


    public static List<String> logsByDate(String file, LocalDate date) throws IOException {

        String dateAsString = date.toString();
        List<String> list = Files.lines(Paths.get(file))
                .filter(log -> log.contains(dateAsString))
                .collect(Collectors.toList());

        return list;

    }

    public static void getLogsCountByDate(LocalDate date) throws IOException {
        String dateAsString = date.toString();
        String file = "D:\\logs.txt";
        System.out.println(date + " " + Files.lines(Paths.get(file))
                .filter(log -> log.contains(dateAsString)).count());
    }


    public static void logsByDateToFile(String file, LocalDate date) throws IOException {

        String dateAsString = date.toString();
        String str = "";
        StringBuilder sb = new StringBuilder(str);
        Files.lines(Paths.get(file))
                .filter(log -> log.contains(dateAsString))
                .filter(log -> log.contains("ERROR"))
                .forEach(log -> sb.append(log + '\n'));

        String fileOutput = "D:\\" + "ERROR" + dateAsString + ".log";
        Files.write(Paths.get(fileOutput), sb.toString().getBytes());

    }


}
