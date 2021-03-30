package oda.edu.module2_classes;/*
  @author   Denys Ovdiienko
  @project   oda.edu
  @class  Rectangle
  @version  1.0.0 
  @since 17.03.2021 - 19.33
*/

import oda.edu.module2_classes.polymorphism.interfaces.IGeomtry;

import java.util.Objects;

public class Rectangle implements IGeomtry {
    private int length;
    private int width;
    private double pricePerSquareMeter;

//klass eto opisanie ob'ektov
    public Rectangle(double pricePerSquareMeter) {
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    public Rectangle(int length, int width, double pricePerSquareMeter) {
        this.length = length;
        this.width = width;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    public Rectangle(double sideA, double sideB) {
    }

    //get daet , set vistavlyaet dliny/shiriny.
    public int getLength(int i) {
        return length;
    }

    public double getPricePerSquareMeter() {
        return pricePerSquareMeter;
    }

    public void setPricePerSquareMeter(double pricePerSquareMeter) {
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth(int i) {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return getLength(20) == rectangle.getLength(20) &&
                getWidth(50) == rectangle.getWidth(50) &&
                Double.compare(rectangle.getPricePerSquareMeter(), getPricePerSquareMeter()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLength(20), getWidth(50), getPricePerSquareMeter());
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", pricePerSquareMeter=" + pricePerSquareMeter +
                '}';
    }

    public double getArea(){
        return this.getWidth(1) * this.getLength(1);
    }

    private double getLength() {
        return 0;
    }

    private double getWidth() {
        return 0;
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
