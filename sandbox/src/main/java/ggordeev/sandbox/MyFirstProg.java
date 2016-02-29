package ggordeev.sandbox;

import java.awt.*;

public class MyFirstProg {

  public static void main(String[] args) {

    Point p1 = new Point(1,1);
    Point p2 = new Point(2,2);

    System.out.println("Точка p1 = " + p1.x + "," + p1.y);
    System.out.println("Точка p2 = " + p2.x + "," + p2.y);
    System.out.println("Расстояние между точками p1 и p2 = " + Point.distance(p1,p2));
  }


}