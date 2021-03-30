package oda.edu.module2_classes.builder;/*
  @author   Denys Ovdiienko
  @project   oda.edu
  @class  MyInteger
  @version  1.0.0 
  @since 30.03.2021 - 17.38
*/

public class MyInteger {
    public static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                //is not prime
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("The number 1001 is prime, it's - " + isPrime(1001));
        System.out.println("The number 101 is prime, it's - " + isPrime(101));
        System.out.println("The number 55 is prime, it's - " + isPrime(55));
        System.out.println("The number 19 is prime, it's - " + isPrime(19));
        System.out.println("The number 3 is prime, it's - " + isPrime(3));

    }
}

