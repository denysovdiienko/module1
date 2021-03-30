package oda.edu;

import oda.edu.module2_classes.factory.FigureFactory;
import oda.edu.module2_classes.polymorphism.RectangularBox1;
import oda.edu.module2_classes.polymorphism.interfaces.IGeomtry;

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

        IGeomtry d1 = FigureFactory.create(10,5,2);

        System.out.println(d1);

/*RectangularBox1{sideA=10.0, sideB=6.0, height=5.0}
RectangularBox1{"sideA":10.0,"sideB":6.0,"sideD":5.0}
<RectangularBox1> + <sideA>10.0</sideA> + <sideB>6.0</sideB> + <height>5.0</height></RectangularBox1>
280.0
32.0
RectangularBox1{sideA=10.0, sideB=5.0, height=2.0}
*/

    }
}
