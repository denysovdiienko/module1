package oda.edu.module2_classes.inheritance;/*
  @author   Denys Ovdiienko
  @project   oda.edu
  @class  FieldMain
  @version  1.0.0 
  @since 22.03.2021 - 17.15
*/

public class FieldMain {
    public static void main(String[] args) {
        Field field = new Field("garden plot","potato",true);
        Field field1 = new Field("plot of land", " sunflower" , false);
        System.out.println(field);
        System.out.println(field1);
    }
    /*
    Field{Rectangle{length = 0, width = 0}typeOfField ='garden plot', typeOfProduct ='potato', isPlowed =true}
    Field{Rectangle{length = 0, width = 0}typeOfField ='plot of land', typeOfProduct =' sunflower', isPlowed =false}
    */
}
