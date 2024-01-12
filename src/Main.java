import models.Point;
import models.Shape;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\NiKiT0$\\IdeaProjects\\assigment1\\src\\source");
        Scanner sc = new Scanner(file);
        Shape shape = new Shape();

        while (sc.hasNextLine()) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            Point point = new Point(x, y);
            shape.addPoint(point);
        }

        System.out.println("Perimeter: " + shape.calculatePerimeter());
        System.out.println("Longest Side: " + shape.getLongestSide());
        System.out.println("Average Side: " + shape.getAverageSide());
    }
    
}