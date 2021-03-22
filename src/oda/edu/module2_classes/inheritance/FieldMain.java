package oda.edu.module2_classes.inheritance;/*
  @author   Denys Ovdiienko
  @project   oda.edu
  @class  FieldMain
  @version  1.0.0 
  @since 22.03.2021 - 17.15
*/

public class FieldMain {
    public static void main(String[] args) {
        double pricePerSquareMeter = 20;
        Field field = new Field("garden plot","potato",true, 20);
        Field field1 = new Field("plot of land", " sunflower" , false, 20);
        field.setLength(2);
        field.setWidth(5);
        field1.setWidth(2);
        field1.setLength(2);
        System.out.println(field);
        System.out.println(field1);
        System.out.println(field.fieldPrice());
        System.out.println(field1.fieldPrice());

    }
    /*
    Field{Rectangle{length=2, width=5, pricePerSquareMeter=20.0}typeOfField ='garden plot', typeOfProduct ='potato', isPlowed =true}
    Field{Rectangle{length=2, width=2, pricePerSquareMeter=20.0}typeOfField ='plot of land', typeOfProduct =' sunflower', isPlowed =false}
    400.0
    240.0
    */
}
