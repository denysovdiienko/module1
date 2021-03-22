package oda.edu.module2_classes.inheritance;/*
  @author   Denys Ovdiienko
  @project   oda.edu
  @class  Student
  @version  1.0.0 
  @since 19.03.2021 - 18.35
*/

import java.time.LocalDate;
import java.util.Objects;

public class Student extends Person {
    private String group;
    private String chair;
    private String university;
    private String department;
    private String specialty;
    private String academicDegree;
    private boolean isOnScholarship; // have got scholarship or not
    private boolean livesInDormitory; //lives in student hostel or not
    private String studentCardId; // student card
    private String learningFrom; // could be day full-time or external


    public Student(int age, String firstName, String lastName, String sex, LocalDate dateOfBirth, String addressOfLiving,
                   String nationality, String citizenship, String identificationNumber, boolean isMarried, double height,
                   double weight, String country, String city, String street) {

        super(age, firstName, lastName, sex, dateOfBirth, addressOfLiving, nationality,
                citizenship, identificationNumber, isMarried, height, weight, country, city, street);
    }

    public Student(int age, String firstName, String lastName, String sex, LocalDate dateOfBirth, String addressOfLiving,
                   String nationality, String citizenship, String identificationNumber,
                   boolean isMarried, double height, double weight, String country, String city,
                   String street, String group, String chair, String university, String department,
                   String specialty, String academicDegree, boolean isOnScholarship, boolean livesInDormitory,
                   String studentCardId, String learningFrom) {

        super(age, firstName, lastName, sex, dateOfBirth, addressOfLiving, nationality, citizenship, identificationNumber, isMarried, height, weight, country, city, street);
        this.group = group;
        this.chair = chair;
        this.university = university;
        this.department = department;
        this.specialty = specialty;
        this.academicDegree = academicDegree;
        this.isOnScholarship = isOnScholarship;
        this.livesInDormitory = livesInDormitory;
        this.studentCardId = studentCardId;
        this.learningFrom = learningFrom;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getChair() {
        return chair;
    }

    public void setChair(String chair) {
        this.chair = chair;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getAcademicDegree() {
        return academicDegree;
    }

    public void setAcademicDegree(String academicDegree) {
        this.academicDegree = academicDegree;
    }

    public boolean isOnScholarship() {
        return isOnScholarship;
    }

    public void setOnScholarship(boolean onScholarship) {
        isOnScholarship = onScholarship;
    }

    public boolean isLivesInDormitory() {
        return livesInDormitory;
    }

    public void setLivesInDormitory(boolean livesInDormitory) {
        this.livesInDormitory = livesInDormitory;
    }

    public String getStudentCardId() {
        return studentCardId;
    }

    public void setStudentCardId(String studentCardId) {
        this.studentCardId = studentCardId;
    }

    public String getLearningFrom() {
        return learningFrom;
    }

    public void setLearningFrom(String learningFrom) {
        this.learningFrom = learningFrom;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return isOnScholarship() == student.isOnScholarship() &&
                isLivesInDormitory() == student.isLivesInDormitory() &&
                getGroup().equals(student.getGroup()) &&
                getChair().equals(student.getChair()) &&
                getUniversity().equals(student.getUniversity()) &&
                getDepartment().equals(student.getDepartment()) &&
                getSpecialty().equals(student.getSpecialty()) &&
                getAcademicDegree().equals(student.getAcademicDegree()) &&
                getStudentCardId().equals(student.getStudentCardId()) &&
                getLearningFrom().equals(student.getLearningFrom());
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() +
                "group ='" + group + '\'' +
                ", chair ='" + chair + '\'' +
                ", university ='" + university + '\'' +
                ", department ='" + department + '\'' +
                ", specialty ='" + specialty + '\'' +
                ", academicDegree ='" + academicDegree + '\'' +
                ", isOnScholarship =" + isOnScholarship +
                ", livesInDormitory =" + livesInDormitory +
                ", studentCardId ='" + studentCardId + '\'' +
                ", learningFrom ='" + learningFrom + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getGroup(), getChair(), getUniversity(), getDepartment(), getSpecialty(), getAcademicDegree(),
                isOnScholarship(), isLivesInDormitory(), getStudentCardId(), getLearningFrom());
    }
}
