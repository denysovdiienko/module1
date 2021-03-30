package oda.edu.module2_classes.factory;/*
  @author   Denys Ovdiienko
  @project   oda.edu
  @class  Cube
  @version  1.0.0 
  @since 30.03.2021 - 16.35
*/

import oda.edu.module2_classes.polymorphism.interfaces.IGeomtry;

import java.util.Objects;

public class Cube implements IGeomtry {
    private double sideA;

    public Cube(double sideA) {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cube cube = (Cube) o;
        return Double.compare(cube.getSideA(), getSideA()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSideA());
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    @Override
    public String toString() {
        return "Cube{" +
                "sideA=" + sideA +
                '}';
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getSquare() {
        return 0;
    }
}
