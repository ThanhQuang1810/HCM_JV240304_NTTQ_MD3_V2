package ss9.bt1;

import java.util.Random;


public class Main {
    public static void main(String[] args) {
        Resizable[] shapes = new Resizable[3];
        shapes[0] = new Circle(10);
        shapes[1] = new Rectangle(5, 10);
        shapes[2] = new Square(7);

        Random random = new Random();

        for (Resizable shape : shapes) {
            System.out.println("Before resizing: " + shape);
            if (shape instanceof Circle) {
                System.out.println("Area: " + ((Circle) shape).getArea());
            } else if (shape instanceof Rectangle) {
                System.out.println("Area: " + ((Rectangle) shape).getArea());
            } else if (shape instanceof Square) {
                System.out.println("Area: " + ((Square) shape).getArea());
            }

            double percent = 1 + random.nextInt(100);
            shape.resize(percent);

            System.out.println("After resizing by " + percent + "%: " + shape);
            if (shape instanceof Circle) {
                System.out.println("Area: " + ((Circle) shape).getArea());
            } else if (shape instanceof Rectangle) {
                System.out.println("Area: " + ((Rectangle) shape).getArea());
            } else if (shape instanceof Square) {
                System.out.println("Area: " + ((Square) shape).getArea());
            }

            System.out.println();
        }
    }
}

