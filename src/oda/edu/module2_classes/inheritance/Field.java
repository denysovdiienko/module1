package oda.edu.module2_classes.inheritance;/*
  @author   Denys Ovdiienko
  @project   oda.edu
  @class  Field
  @version  1.0.0 
  @since 22.03.2021 - 16.20
*/

import oda.edu.module2_classes.Rectangle;

import java.util.Objects;

public class Field extends Rectangle {
    private String typeOfField;
    private String typeOfProduct;
    private boolean isPlowed;

    //constructors
    public Field(String typeOfField, String typeOfProduct, boolean isPlowed) {
        this.typeOfField = typeOfField;
        this.typeOfProduct = typeOfProduct;
        this.isPlowed = isPlowed;
    }

    public Field(int length, int width, String typeOfField, String typeOfProduct, boolean isPlowed) {
        super(length, width);
        this.typeOfField = typeOfField;
        this.typeOfProduct = typeOfProduct;
        this.isPlowed = isPlowed;


    }

    //getters and setters

    public String getTypeOfField() {
        return typeOfField;
    }

    public void setTypeOfField(String typeOfField) {
        this.typeOfField = typeOfField;
    }

    public String getTypeOfProduct() {
        return typeOfProduct;
    }

    public void setTypeOfProduct(String typeOfProduct) {
        this.typeOfProduct = typeOfProduct;
    }

    public boolean isPlowed() {
        return isPlowed;
    }

    public void setPlowed(boolean plowed) {
        isPlowed = plowed;
    }

    @Override
    public String toString() {
        return "Field{" + super.toString() +
                "typeOfField ='" + typeOfField + '\'' +
                ", typeOfProduct ='" + typeOfProduct + '\'' +
                ", isPlowed =" + isPlowed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Field field = (Field) o;
        return isPlowed() == field.isPlowed() &&
                getTypeOfField().equals(field.getTypeOfField()) &&
                getTypeOfProduct().equals(field.getTypeOfProduct());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getTypeOfField(), getTypeOfProduct(), isPlowed());
    }
}
