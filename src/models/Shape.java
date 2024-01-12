package models;

import java.util.ArrayList;

public class Shape {
    private ArrayList<Point> points;

    public Shape() {
        points = new ArrayList<>();
    }

    public void addPoint(Point point) {
        points.add(point);
    }

    public double calculatePerimeter() {
        double perimeter = 0;
        for (int i = 0; i < points.size(); i++) {
            Point thisPoint = points.get(i);
            Point nextPoint = points.get((i + 1) % points.size());
            perimeter += thisPoint.getDistance(nextPoint);
        }
        return perimeter;
    }

    public double getLongestSide() {
        double longestSide = 0;
        for (int i = 0; i < points.size(); i++) {
            Point thisPoint = points.get(i);
            Point nextPoint = points.get((i + 1) % points.size());
            double sideLength = thisPoint.getDistance(nextPoint);
            longestSide = Math.max(longestSide, sideLength);
        }
        return longestSide;
    }

    public double getAverageSide() {
        double averageSide = 0;
        for (int i = 0; i < points.size(); i++) {
            Point thisPoint = points.get(i);
            Point nextPoint = points.get((i + 1) % points.size());
            averageSide += thisPoint.getDistance(nextPoint);
        }
        return averageSide / points.size();
    }
}
