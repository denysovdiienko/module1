package oda.edu.module2_classes.builder;/*
  @author   Denys Ovdiienko
  @project   oda.edu
  @class  Person
  @version  1.0.0 
  @since 19.03.2021 - 18.34
*/

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Person1 {
    private String firstName;
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
    private String street;

    public Person1(String firstName, String lastName, String sex, LocalDate dateOfBirth,
                   String addressOfLiving, String nationality, String citizenship, String identificationNumber,
                   boolean isMarried, double height, double weight, String country, String city, String street) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.addressOfLiving = addressOfLiving;
        this.nationality = nationality;
        this.citizenship = citizenship;
        this.identificationNumber = identificationNumber;
        this.isMarried = isMarried;
        this.height = height;
        this.weight = weight;
        this.country = country;
        this.city = city;
        this.street = street;
    }

    public Person1() {

    }

    public int getAge() {
        return (int) ChronoUnit.YEARS.between(this.getDateOfBirth(),LocalDate.now());
    }

    public boolean isAdult(){
        boolean result;
        result = this.getAge() >= 18;
        return result;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddressOfLiving() {
        return addressOfLiving;
    }

    public void setAddressOfLiving(String addressOfLiving) {
        this.addressOfLiving = addressOfLiving;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person1 person = (Person1) o;
        return getAge() == person.getAge() &&
                isMarried() == person.isMarried() &&
                Double.compare(person.getHeight(), getHeight()) == 0 &&
                Double.compare(person.getWeight(), getWeight()) == 0 &&
                getFirstName().equals(person.getFirstName()) &&
                getLastName().equals(person.getLastName()) &&
                getSex().equals(person.getSex()) &&
                getDateOfBirth().equals(person.getDateOfBirth()) &&
                getAddressOfLiving().equals(person.getAddressOfLiving()) &&
                getNationality().equals(person.getNationality()) &&
                getCitizenship().equals(person.getCitizenship()) &&
                getIdentificationNumber().equals(person.getIdentificationNumber()) &&
                getCountry().equals(person.getCountry()) &&
                getCity().equals(person.getCity()) &&
                getStreet().equals(person.getStreet());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAge(), getFirstName(), getLastName(), getSex(), getDateOfBirth(), getAddressOfLiving(),
                getNationality(), getCitizenship(), getIdentificationNumber(), isMarried(), getHeight(), getWeight(), getCountry(), getCity(), getStreet());
    }

    @Override
    public String toString() {
        return "Person{" +
                ", firstName ='" + firstName + '\'' +
                ", lastName ='" + lastName + '\'' +
                ", sex ='" + sex + '\'' +
                ", dateOfBirth =" + dateOfBirth +
                ", addressOfLiving ='" + addressOfLiving + '\'' +
                ", nationality ='" + nationality + '\'' +
                ", citizenship ='" + citizenship + '\'' +
                ", identificationNumber ='" + identificationNumber + '\'' +
                ", isMarried =" + isMarried +
                ", height =" + height +
                ", weight =" + weight +
                ", country ='" + country + '\'' +
                ", city ='" + city + '\'' +
                ", street = '" + street + '\'' +
                '}';
    }



}
