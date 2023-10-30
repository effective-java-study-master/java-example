package assignment.ch04.sub23;


import assignment.ch04.sub23.good.Circle;
import assignment.ch04.sub23.good.GoodFigure;
import assignment.ch04.sub23.good.Rectangle;

class MainTest23 {

    public static void main(String[] args) {

        // bad case
        BadFigure badFigure = new BadFigure(3);
        System.out.println(badFigure.shape);
        System.out.println(badFigure.area());
        badFigure = new BadFigure(2, 3);
        System.out.println(badFigure.shape);
        System.out.println(badFigure.area());
        // CIRCLE
        // 28.274333882308138
        // RECTANGLE
        // 6.0

        // good case
        Circle circle = new Circle(3);
        System.out.println(circle.area());

        Rectangle rectangle = new Rectangle(2, 3);
        System.out.println(rectangle.area());
        // 28.274333882308138
        // 6.0

        System.out.println(circle instanceof GoodFigure);
        System.out.println(rectangle instanceof GoodFigure);
        // true
        // true
    }

}