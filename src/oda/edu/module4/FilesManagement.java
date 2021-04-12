package oda.edu.module4;/*
  @author   Denys Ovdiienko
  @project   oda.edu
  @class  FilesManagement
  @version  1.0.0 
  @since 12.04.2021 - 15.32
*/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class FilesManagement {
    public static void main(String[] args) throws IOException {
        LocalDateTime start = LocalDateTime.now();
        String logs = new String(Files.readAllBytes(Paths.get("D:\\logs.txt")));
        final String [] lines = logs.split("\n");
        System.out.println( "total number of logs(lines): " + lines.length);
        System.out.println("-----------Use previous skills - String.split--------------------------");

        int counter = 0;
        for (int i = 0; i <lines.length ; i++) {
            if(lines[i].contains("ERROR")) counter++;
        }
        System.out.println("Number of errors:   " + counter);

        LocalDateTime finish = LocalDateTime.now();
        System.out.println("Time spent : " + ChronoUnit.MILLIS.between(start,finish) + " milliseconds");



        System.out.println("-------------- Use Files.lines.-----------------");

        start = LocalDateTime.now();
        System.out.println("Number of errors:   " + Files.lines(Paths.get("D:\\logs.txt"))
                .filter(element -> element.contains("ERROR")).count());


        finish = LocalDateTime.now();
        System.out.println("Time spent : " +ChronoUnit.MILLIS.between(start,finish) + "  milliseconds");
    }
}
/*total number of logs(lines): 2845607
-----------Use previous skills - String.split--------------------------
Number of errors:   361
Time spent : 16516 milliseconds
-------------- Use Files.lines.-----------------
Number of errors:   361
Time spent : 4567  milliseconds

Process finished with exit code 0*/