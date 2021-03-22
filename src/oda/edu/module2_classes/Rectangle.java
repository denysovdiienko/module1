package oda.edu.module2_classes;/*
  @author   Denys Ovdiienko
  @project   oda.edu
  @class  Rectangle
  @version  1.0.0 
  @since 17.03.2021 - 19.33
*/

import java.util.Objects;

public class Rectangle {
    private int length;
    private int width;
//klass eto opisanie ob'ektov
    public Rectangle() {
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
//get daet , set vistavlyaet dliny/shiriny.
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
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Rectangle rectangle = (Rectangle) o;
        return getLength() == rectangle.getLength() &&
                getWidth() == rectangle.getWidth();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLength(), getWidth());
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length = " + length +
                ", width = " + width +
                '}';


    }

    public int getArea(){
        return this.getWidth() * this.getLength();
    }
}
