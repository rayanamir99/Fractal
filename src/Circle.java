// Written by Brock Williams (will7159) and Rayan Amir (amir0045)

import java.awt.Color;

public class Circle {
    private double xPosition;
    private double yPosition;
    private double radius;
    private Color shapeColor;

    public Circle(double x, double y, double circleRadius) { // Constructor for Circle object
        this.xPosition = x;
        this.yPosition = y;
        this.radius= circleRadius;

    }

    public double calculatePerimeter() {
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    } // calculates perimeter

    public double calculateArea() {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    } // calculates area to eventually be returned

    public void setColor(Color c) {
        shapeColor = c;

    } // sets (mutates) color

    public void setPos(double x, double y) {
        this.xPosition = x;
        this.yPosition = y;
    } // mutator to set X and Y position for circle

    public void setRadius(double r) {
        this.radius = r;
    } // mutator to set radius

    public Color getColor() {
        return shapeColor;
    } // accessor method, returns shape color

    public double getXPos() {
        return this.xPosition;
    } // accessor method, returns x position

    public double getYPos() {
        return this.yPosition;
    } //accessor method, returns y position

    public double getRadius() {
        return this.radius;
    } // accessor method, returns radius

}