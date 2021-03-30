package oda.edu.module2_classes.polymorphism;/*
  @author   Denys Ovdiienko
  @project   oda.edu
  @class  RectangularBox1
  @version  1.0.0 
  @since 29.03.2021 - 19.59
*/

import oda.edu.module2_classes.polymorphism.interfaces.IGeomtry;
import oda.edu.module2_classes.polymorphism.interfaces.IPacking;

import java.util.Objects;

public class RectangularBox1 implements IPacking,IGeomtry {
    private double sideA;
    private double sideB;
    private double height;


    public RectangularBox1() {

    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RectangularBox1 that = (RectangularBox1) o;
        return Double.compare(that.getSideA(), getSideA()) == 0 &&
                Double.compare(that.getSideB(), getSideB()) == 0 &&
                Double.compare(that.getHeight(), getHeight()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSideA(), getSideB(), getHeight());
    }

    @Override
    public String toString() {
        return "RectangularBox1{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", height=" + height +
                '}';
    }

    public RectangularBox1(double sideA, double sideB, double height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    public double Volume() {
        //V=abc
        return this.sideA * this.sideB * this.height;
    }

    public double Diagonal() {
        // d = koren' ( a2+b2+c2)
        return Math.sqrt(Math.pow(this.sideA, 2) + Math.pow(this.sideB, 2)
                + Math.pow(this.height, 2));
    }

    @Override
    public String toJSON() {
        return "RectangularBox1" + "{" + "\"" + "sideA" + "\"" + ":" + this.getSideA() +
                "," +
                "\"" + "sideB" + "\"" + ":" + this.getSideB() +
                "," +
                "\"" + "sideD" + "\"" + ":" + this.getHeight() +
                "}";
    }

    @Override
    public String toXML() {
        return "<RectangularBox1>" +
                " + <sideA>" + this.getSideA() + "</sideA>" +
                " + <sideB>" + this.getSideB() + "</sideB>" +
                " + <height>" + this.getHeight() + "</height>" +
                "</RectangularBox1>";
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.sideA) + 2 * (this.sideB);
    }

    @Override
    public double getSquare() {
        return 2 * ((this.sideA * this.sideB) + (this.sideA * this.height)
                + (this.sideB * this.height));
    }
}
