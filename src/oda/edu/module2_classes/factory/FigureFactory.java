package oda.edu.module2_classes.factory;/*
  @author   Denys Ovdiienko
  @project   oda.edu
  @class  FigureFactory
  @version  1.0.0 
  @since 30.03.2021 - 16.24
*/

import oda.edu.module2_classes.Rectangle;
import oda.edu.module2_classes.RectangularBox;
import oda.edu.module2_classes.polymorphism.RectangularBox1;
import oda.edu.module2_classes.polymorphism.interfaces.IGeomtry;

import static oda.edu.module2_classes.factory.Figures.*;

public class FigureFactory {

    public static IGeomtry create(double sideA, double sideB, double height) {
        if (sideA == sideB && sideB == height) {
            return new Cube(sideA);
        } else if (height == 0 || sideA == 0 || sideB == 0) {
            return new Rectangle((int) sideA,(int) sideB);
        }
        return new RectangularBox1(sideA, sideB, height);
    }

    public static IGeomtry create(double sideA, double sideB, double height, Figures figures) {
        if (figures.equals(RECTANGLEBOX)) return new RectangularBox1(sideA, sideB, height);
        if (figures.equals(CUBE)) return new Cube(sideA);
        if (figures.equals(RECTANGLE)) return new Rectangle(sideA, sideB);
        return null;
    }
}
