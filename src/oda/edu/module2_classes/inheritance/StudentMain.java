package oda.edu.module2_classes.inheritance;/*
  @author   Denys Ovdiienko
  @project   oda.edu
  @class  StudentMain
  @version  1.0.0 
  @since 22.03.2021 - 16.59
*/

import java.time.LocalDate;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student(21, "Denys", "Ovdiienko",
                "male", LocalDate.of(1999, 11, 27), "Pushkinska 79",
                "ukrainian", "ukrainian", "1234567890",
                false, 196, 77, "Ukraine", "Kharkiv", "Pushkinska 79",
                "KN-M720", "PIITU", "NTU KhPI", "KN", "Software Engineering",
                "Master", false, true, "12345356", "daily form");
        System.out.println(student.toString());
    }
   /* Student{Person{age =21, firstName ='Denys', lastName ='Ovdiienko', sex ='male', dateOfBirth =1999-11-27,
            addressOfLiving ='Pushkinska 79', nationality ='ukrainian', citizenship ='ukrainian',
            identificationNumber ='1234567890', isMarried =false, height =196.0, weight =77.0,
            country ='Ukraine', city ='Kharkiv', street = 'Pushkinska 79'}group ='KN-M720',
            chair ='PIITU', university ='NTU KhPI', department ='KN', specialty ='Software Engineering',
            academicDegree ='Master', isOnScholarship =false, livesInDormitory =true,
            studentCardId ='12345356', learningFrom ='daily form'}

    */
}
