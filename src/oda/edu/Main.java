package oda.edu;

import oda.edu.module2_classes.RectangularBox;

public class Main {

    public static void main(String[] args) {
        RectangularBox q1 = new RectangularBox(6,2,5);
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

    }
}
