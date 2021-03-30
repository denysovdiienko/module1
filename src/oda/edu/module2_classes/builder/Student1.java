package oda.edu.module2_classes.builder;/*
  @author   Denys Ovdiienko
  @project   oda.edu
  @class  Student
  @version  1.0.0 
  @since 19.03.2021 - 18.35
*/


import java.time.LocalDate;
import java.util.Objects;

public class Student1 extends Person1 {
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

    public Student1(String firstName, String lastName, String sex, LocalDate dateOfBirth, String addressOfLiving, String nationality, String citizenship, String identificationNumber,
                    boolean isMarried, double height, double weight, String country, String city, String street) {
        super(firstName, lastName, sex, dateOfBirth, addressOfLiving, nationality, citizenship, identificationNumber, isMarried, height, weight, country, city, street);
    }

    public Student1(int age, String firstName, String lastName, String sex, LocalDate dateOfBirth, String addressOfLiving,
                    String nationality, String citizenship, String identificationNumber, boolean isMarried, double height,
                    double weight, String country, String city, String street) {

        super(firstName, lastName, sex, dateOfBirth, addressOfLiving, nationality,
                citizenship, identificationNumber, isMarried, height, weight, country, city, street);
    }

    public Student1(String firstName, String lastName, String sex, LocalDate dateOfBirth, String addressOfLiving,
                    String nationality, String citizenship, String identificationNumber,
                    boolean isMarried, double height, double weight, String country, String city,
                    String street, String group, String chair, String university, String department,
                    String specialty, String academicDegree, boolean isOnScholarship, boolean livesInDormitory,
                    String studentCardId, String learningFrom) {

        super(firstName, lastName, sex, dateOfBirth, addressOfLiving, nationality, citizenship, identificationNumber, isMarried, height, weight, country, city, street);
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

    public Student1() {
        super();
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
        Student1 student = (Student1) o;
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


    public static class Builder {
        private Student1 studentToBuild;

        public Builder() {
            this.studentToBuild = new Student1();
        }

        public Builder setGroup(String group) {
            studentToBuild.setGroup(group);
            return this;
        }

        public Builder setChair(String chair) {
            studentToBuild.setChair(chair);
            return this;
        }

        public Builder setUniversity(String university) {
            studentToBuild.setUniversity(university);
            return this;
        }

        public Builder setDepartment(String department) {
            studentToBuild.setDepartment(department);
            return this;
        }

        public Builder setSpecialty(String specialty) {
            studentToBuild.setSpecialty(specialty);
            return this;
        }

        public Builder setAcademicDegree(String academicDegree) {
            studentToBuild.setAcademicDegree(academicDegree);
            return this;
        }

        public Builder setOnScholarship(boolean onScholarship) {
            studentToBuild.setOnScholarship(onScholarship);
            return this;
        }

        public Builder setlivesInDormitory(boolean livesInDormitory) {
            studentToBuild.setLivesInDormitory(livesInDormitory);
            return this;
        }

        public Builder setStudentCardId(String studentCardId) {
            studentToBuild.setStudentCardId(studentCardId);
            return this;
        }

        public Builder setLearningFrom(String learningFrom) {
            studentToBuild.setLearningFrom(learningFrom);
            return this;
        }
        /*    private String firstName;
    private String lastName;
    private String sex;
    private LocalDate dateOfBirth;//vmesto age
    private String addressOfLiving;
    private String nationality;
    private String citizenship;
    private String identificationNumber;
    private boolean isMarried;
    private double height;
    private double weight;
    private String country;
    private String city;
    private String street;*/
        public Builder setFirstName(String firstName) {
            studentToBuild.setFirstName(firstName);
            return this;
        }
        public Builder setLastName(String lastName) {
            studentToBuild.setLastName(lastName);
            return this;
        }
        public Builder setSex(String sex) {
            studentToBuild.setSex(sex);
            return this;
        }
        public Builder setDateOfBirth(LocalDate dateOfBirth) {
            studentToBuild.setDateOfBirth(dateOfBirth);
            return this;
        }
        public Builder setAddressOfLiving(String addressOfLiving) {
            studentToBuild.setAddressOfLiving(addressOfLiving);
            return this;
        }
        public Builder setNationality(String nationality) {
            studentToBuild.setNationality(nationality);
            return this;
        }
        public Builder setCitizenship(String citizenship) {
            studentToBuild.setCitizenship(citizenship);
            return this;
        }
        public Builder setIdentificationNumber(String identificationNumber) {
            studentToBuild.setIdentificationNumber(identificationNumber);
            return this;
        }
        public Builder setMarried(boolean isMarried) {
            studentToBuild.setMarried(isMarried);
            return this;
        }
        public Builder setHeight(double height) {
            studentToBuild.setHeight(height);
            return this;
        }
        public Builder setWeight(double weight) {
            studentToBuild.setWeight(weight);
            return this;
        }
        public Builder setCountry(String country) {
            studentToBuild.setCountry(country);
            return this;
        }
        public Builder setCity(String city) {
            studentToBuild.setCity(city);
            return this;
        }
        public Builder setStreet(String street) {
            studentToBuild.setStreet(street);
            return this;
        }
    public Student1 build() {
        return studentToBuild;
    }
}

}


