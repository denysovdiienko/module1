package oda.edu.module2_classes.factory;/*
  @author   Denys Ovdiienko
  @project   oda.edu
  @class  RectangleFactory
  @version  1.0.0 
  @since 24.03.2021 - 18.49
*/

import oda.edu.module2_classes.polymorphism.RectangularBox1;

public class RectangleFactory {
    public static RectangularBox1 create(double sideA, double sideB, double height){
        if (sideA == sideB && sideB == height){
            return null;
        }else if (height == 0 || sideA == 0 || sideB == 0){
            return null;
        }
        return new RectangularBox1(sideA,sideB,height);
    }
}
