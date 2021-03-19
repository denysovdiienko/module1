package oda.edu.module2_classes;/*
  @author   Denys Ovdiienko
  @project   oda.edu
  @class  RectangularBox
  @version  1.0.0 
  @since 17.03.2021 - 20.09
*/

import java.util.Objects;

public class RectangularBox {
    private double sideA;
    private double sideB;
    private double height;


    public RectangularBox(){

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
    public String toString() {
        return "RectangularBox{" +
                "sideA = " + sideA +
                ", sideB = " + sideB +
                ", height = " + height +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RectangularBox that = (RectangularBox) o;
        return Double.compare(that.getSideA(), getSideA()) == 0 &&
                Double.compare(that.getSideB(), getSideB()) == 0 &&
                Double.compare(that.getHeight(), getHeight()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSideA(), getSideB(), getHeight());
    }


    public RectangularBox(double sideA, double sideB, double height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    public double Perimeter(){
        //Perimeter= 2sideA + 2sideB
        return 2*(this.sideA) + 2*(this.sideB);
    }
    public double Square(){
       // S=2(ab + ah + bh)
        return 2*((this.sideA * this.sideB) + (this.sideA * this.height)
                + (this.sideB * this.height));
    }
    public double Volume(){
        //V=abc
        return this.sideA * this.sideB * this.height;
    }
    public double Diagonal(){
        // d = koren' ( a2+b2+c2)
        return Math.sqrt(Math.pow(this.sideA,2) + Math.pow(this.sideB,2)
                + Math.pow(this.height,2));
        }
    }

