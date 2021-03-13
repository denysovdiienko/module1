package oda.edu.module1;/*
  @author   Denys Ovdiienko
  @project   oda.edu
  @class  AboutMe
  @version  1.0.0 
  @since 08.03.2021 - 18.12
*/

public class AboutMe {
    public static void main(String[] args) {
        byte myAge = 21;
        System.out.println("I'm " + myAge + " years old.");

        short yearOfBirth = 1999;
        System.out.println("I was born in " + yearOfBirth);

        int mySalary = 100_000;
        System.out.println("My future salary will be " + mySalary + "$");

        long  worldPopulation = 7_000_000_000L;
        System.out.println("Global population is about " + worldPopulation + " humans");

        float height = 196.5f;
        System.out.println("My height is : " + height + " cm");

        double weight = 77.7;
        System.out.println("My weight is :  " + weight + " kgs");

        char sign = 'D'; // bukvi,chisla, s 1 skobkami
        System.out.println("The first letter of my name is " + sign);

        boolean pravda = true;
        System.out.println("i'm a man and it is " + pravda);

        String str = "Hello Java";
        System.out.println(str);
    }
}
 /*
*I'm 21 years old.
*I was born in 1999
*My future salary will be 100000$
*Global population is about 7000000000 humans
*My height is : 196.5 cm
*My weight is :  77.7 kgs
*The first letter of my name is D
*i'm a man and it is true
*Hello Java
*/

