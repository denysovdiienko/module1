package oda.edu.module2_classes.factory;/*
  @author   Denys Ovdiienko
  @project   oda.edu
  @class  RectangleFactory
  @version  1.0.0 
  @since 24.03.2021 - 18.49
*/

public class RectangleFactory {
    public static Rectangle1 create(int length, int width){
        //put your logic here
        return new Rectangle1(length,width);
    }
}
