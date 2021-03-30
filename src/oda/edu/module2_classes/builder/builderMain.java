package oda.edu.module2_classes.builder;/*
  @author   Denys Ovdiienko
  @project   oda.edu
  @class  builderMain
  @version  1.0.0 
  @since 30.03.2021 - 16.53
*/
/*    private String group;
    private String chair;
    private String university;
    private String department;
    private String specialty;
    private String academicDegree;
    private boolean isOnScholarship; // have got scholarship or not
    private boolean livesInDormitory; //lives in student hostel or not
    private String studentCardId; // student card
    private String learningFrom;*/

import java.time.LocalDate;

public class builderMain {
    public static void main(String[] args) {
        Student1 Den = new Student1.Builder()
                .setFirstName("Den")
                .setLastName("Kraya")
                .setSex("male")
                .setDateOfBirth(LocalDate.of(1998,12,2))
                .setAddressOfLiving("Shevchenko 27")
                .setNationality("ukrainian")
                .setCitizenship("ukrainian")
                .setIdentificationNumber("12312312")
                .setMarried(false)
                .setHeight(186)
                .setWeight(75)
                .setCountry("Ukraine")
                .setCity("Nikopol")
                .setStreet("asdasda")
                .setGroup("KN")
                .setChair("erg")
                .setUniversity("NTU KhPI")
                .setDepartment("sofrtteqw")
                .setSpecialty("Software of smth")
                .setAcademicDegree("Master")
                .setOnScholarship(true)
                .setlivesInDormitory(true)
                .setStudentCardId("34534634")
                .setLearningFrom("Full")
                .build();
        System.out.println(Den);
    }
    /*Student{Person{, firstName ='Den', lastName ='Kraya', sex ='male', dateOfBirth =1998-12-02,
    addressOfLiving ='Shevchenko 27', nationality ='ukrainian', citizenship ='ukrainian',
     identificationNumber ='12312312', isMarried =false, height =186.0, weight =75.0, country ='Ukraine',
     city ='Nikopol', street = 'asdasda'}group ='KN', chair ='erg', university ='NTU KhPI', department ='sofrtteqw',
     specialty ='Software of smth',
    academicDegree ='Master', isOnScholarship =true, livesInDormitory =true,
    studentCardId ='34534634', learningFrom ='Full'}
     */
}
