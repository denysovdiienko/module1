package oda.edu.module1;/*
  @author   Denys Ovdiienko
  @project   oda.edu
  @class  Integral
  @version  1.0.0 
  @since 08.03.2021 - 19.55
*/

public class Integral {
    public static double getIntegral(int secant){
        double start = 0;
        double finish = Math.PI;
        int steps = 1000;
        double step = (finish-start)/steps;
        double area = 0;
        double height = 0;
        for (int i = 0; i < steps; i++) {
            if (Math.sin(i * step) < 0.1 * secant){
                height = Math.sin(i * step);
            }else {
                height = 0.1 * secant;
            }
            double currentArea = height * step;
            area = area + currentArea;
        }
        return area;
    }

    public static void main(String[] args) {
        System.out.println("Sinusoid area : " + getIntegral(4));  //last number in student card.
    }

    /*Sinusoid area : 1.0943930786405696*/
}
