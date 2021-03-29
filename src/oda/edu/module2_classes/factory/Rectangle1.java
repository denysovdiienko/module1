package oda.edu.module2_classes.factory;/*
  @author   Denys Ovdiienko
  @project   oda.edu
  @class  Rectangle1
  @version  1.0.0 
  @since 24.03.2021 - 18.46
*/

public class Rectangle1 {
    private int length;
    private int width;

    public Rectangle1() {
    }

    public Rectangle1(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle1{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
