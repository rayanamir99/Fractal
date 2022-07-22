// Written by Brock Williams (will7159) and Rayan Amir (amir0045)

import java.lang.Math;
import java.awt.*;
public class Triangle {

    private double Xposition;
    private double Yposition;
    private double width;
    private double height;
    private Color shapeColor;

    public Triangle(double Xposition, double Yposition, double width, double height) {
        this.Xposition = Xposition;
        this.Yposition = Yposition;
        this.width = width;
        this.height = height;
    } // constructor for triangle object

    public double calculatePerimeter() {
        double sideLength = Math.sqrt(Math.pow(width/2, 2)+ Math.pow(height, 2));
        double perimeter = width + sideLength*2;
        return perimeter;
    } // calculates perimeter of triangle

    public double calculateArea() {
        double area = (width * height)/2;
        return area;
    } // calculates area of triangle to eventually be returned

    public void setColor(Color c) {
        shapeColor = c;
    } // mutator method, sets shapeColor

    public void setPos(double Xposition1, double Yposition1) {
        this.Xposition = Xposition1;
        this.Yposition = Yposition1;
    } // mutator method, sets X and Y position

    public void setWidth(double width1) {
        this.width = width1;
    }// mutator method, sets triangle width

    public void setHeight(double height1) {
        this.height = height1;
    } // mutator method, sets triangle height

    public Color getColor() {
        return shapeColor;

    } // accessor method, returns shapeColor

    public double getXPos() {
        return this.Xposition;
    } // accessor method, returns x position of triangle

    public double getYPos() {
        return this.Yposition;
    } // accessor method, returns y position of triangle

    public double getHeight() {
        return this.height;
    } // accessor method, returns height of triangle

    public double getWidth() {
        return this.width;
    } // accessor method, returns triangle width

}