package oda.edu;

import oda.edu.module2_classes.RectangularBox;
import oda.edu.module2_classes.factory.Rectangle1;
import oda.edu.module2_classes.factory.RectangleFactory;
import oda.edu.module2_classes.polymorphism.RectangularBox1;

public class Main {

    public static void main(String[] args) {
    /*    RectangularBox q1 = new RectangularBox(6,2,5);
        RectangularBox q2 = new RectangularBox();

        q2.setSideA(10);
        q2.setSideB(5);
        q2.setHeight(8);

        System.out.println(q1);
        System.out.println("Perimeter of Rectangle : " + q1.Perimeter());
        System.out.println("Square of Rectangle : " + q1.Square());
        System.out.println("Volume of Rectangle : " + q1.Volume());
        System.out.println("Rectangle Diagonal Length : " + q1.Diagonal());
        System.out.println(q2);
        System.out.println("Perimeter of Rectangle : " + q2.Perimeter());
        System.out.println("Square of Rectangle : " + q2.Square());
        System.out.println("Volume 2 of Rectangle : " + q2.Volume());
        System.out.println("Rectangle 2 Diagonal Length : " + q2.Diagonal());
*/
        /*Rectangle1 r1 = new Rectangle1(3,4);
        Rectangle1 r11 = RectangleFactory.create(3,4);
        System.out.println(r1);
        System.out.println(r11);*/
        RectangularBox1 q1 = new RectangularBox1(10,6,5);
        System.out.println(q1);
        System.out.println(q1.toJSON());
        System.out.println(q1.toXML());
        System.out.println(q1.getSquare());
        System.out.println(q1.getPerimeter());

    }
}
