// Written by Brock Williams (will7159) and Rayan Amir (amir0045)

import java.awt.*;

public class Rectangle {
    private double Xposition;
    private double Yposition;
    private double width;
    private double height;
    private Color shapeColor;

    public Rectangle(double Xposition, double Yposition, double width, double height) { // constructor for rectangle
        this.Xposition = Xposition;
        this.Yposition = Yposition;
        this.width = width;
        this.height = height;
    }

    public double calculatePerimeter() {
        double perimeter1 = width*2;
        double perimeter2 = height*2;
        double perimeter = perimeter1 + perimeter2;
        return perimeter;
    } // calculates perimeter of rectangle

    public double calculateArea() {
        double area = width * height;
        return area;
    } // calculates area, eventually gets returned

    public void setColor(Color c) {
        shapeColor = c;

    } // mutator method, sets shapeColor

    public void setPos(double Xposition1, double Yposition1) {
        this.Xposition = Xposition1;
        this.Yposition = Yposition1;
    } // mutator method, sets X and Y position

    public void setHeight(double height1) {
        this.height = height1;
    } // mutator method, sets height of rectangle

    public void setWidth(double width1) {
        this.width = width1;
    } // mutator method, sets width of rectangle

    public Color getColor() {
        return shapeColor;

    } // accessor method, returns shapeColor

    public double getXPos() {
        return this.Xposition;
    } // accessor method, returns xPosition

    public double getYPos() {
        return this.Yposition;
    } // accessor method, returns yPosition

    public double getHeight() {
        return this.height;
    } // accessor method, returns rectangle height

    public double getWidth() {
        return this.width;
    } // accessor method, returns rectangle width
}