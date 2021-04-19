package oda.edu.finalTask;/*
  @author   Denys Ovdiienko
  @project   oda.edu
  @class  Duplicates
  @version  1.0.0 
  @since 19.04.2021 - 18.48
*/

import java.util.Arrays;

public class Duplicates {
    public static boolean hasDuplicates(int[] array) {
        Arrays.sort(array);
        boolean result = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    result=true;
                    break;
                }
            }
        }
        return result;
    }

                    public static void main (String[]args){
                        int[] array = {1, 5, 3, 6, 2, 9, 33, 21};
                        System.out.println(hasDuplicates(array));  // false
                        array[5] = 1;
                        System.out.println(hasDuplicates(array)); // true
                    }
                }

