package oda.edu.module1;/*
  @author   Denys Ovdiienko
  @project   oda.edu
  @class  Palindrom
  @version  1.0.0 
  @since 08.03.2021 - 18.19
*/

public class Palindrom {
 public static boolean isPalindrom1(String text){
        text = text.replaceAll("[^A-Za-zА-Яа-я]", ""); //delete trash
        text = text.toLowerCase();
        boolean result = true;
        for(int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {
                result = false;
                break;
            }
        }
        return result;
    }

    //build a reverse string
    public static boolean isPalindrom2(String text) {
        text = text.replaceAll("[^A-Za-zА-Яа-я]", ""); //delete trash
        text = text.toLowerCase();
        boolean result = true;
        String reversed = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed = reversed + text.charAt(i);
        }
        return reversed.equals(text);
    }

    //use string builder
    public static boolean isPalindrom3(String text) {
        text = text.replaceAll("[^A-Za-zА-Яа-я]", ""); //delete trash
        text = text.toLowerCase();
        StringBuilder sb = new StringBuilder(text);
        String reversed = sb.reverse().toString();
        return (reversed.equals(text));
    }

    public static void main(String[] args) {
        String text = "На доме чемодан.";
        System.out.println("First way :");
        System.out.println(text + " is a palindrome - " + isPalindrom1(text));
        System.out.println("Second way : ");
        System.out.println(text + " is a palindrome - " + isPalindrom2(text));
        System.out.println("Third way : ");
        System.out.println(text + " is a palindrome - " + isPalindrom3(text));
        /*  First way :
            На доме чемодан. is a palindrome - true
            Second way :
            На доме чемодан. is a palindrome - true
            Third way :
            На доме чемодан. is a palindrome - true
        */
    }
}
