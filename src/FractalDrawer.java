// FractalDrawer class draws a fractal of a shape indicated by user input

// Written by Brock Williams (will7159) and Rayan Amir (amir0045)

import java.awt.Color;

import java.util.Scanner;

import java.util.Random;


public class FractalDrawer {
    private double totalArea=0;  // member variable for tracking the total area
    private Random rand = new Random();

    public FractalDrawer() {}  // contructor

    /*
    drawFractal creates a new Canvas object, determines which shape to draw a fractal by calling the appropriate helper
    function, and after recursion drawFractal returns the total area of the fractal
     */

    public double drawFractal(String type) {
        Canvas newCanvas = new Canvas();
        if (type.equals("Circle")) {
            drawCircleFractal(140, 400.0, 400.0, Color.GREEN, newCanvas, 0);
            return totalArea;
        } // if user types circle, this if statement is ran. Then draws circle fractals

        else if (type.equals("Triangle")) {
            drawTriangleFractal(200, 250, 400.0, 600, Color.green, newCanvas, 0);
            return totalArea; // Shifted Y downwards to see whole fractal image (400, 400 is center)
        } // if user types triangle, this if statement is ran. Then draws triangle fractals

        else if (type.equals("Rectangle")) {
            drawRectangleFractal(150, 100, 300, 300, Color.green, newCanvas, 0);
            return totalArea;
        } // if user types circle, this if statement is ran. Then draws rectangle fractals

        else {
            return 0;
        } // we are assuming we have a friendly user. If the user doesn't enter an appropriate shape, it returns 0
    }


    public void drawTriangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level) {
        if (level == 7) {
            return;

        } // base case of recursive function

        else {
            float r = rand.nextFloat(); // float r, g, and b are random floats used to create a random color
            float g = rand.nextFloat();
            float b = rand.nextFloat();

            Triangle myTriangle = new Triangle(x, y, width, height);

            Color triangleColor = new Color(r, g, b);

            myTriangle.setColor(triangleColor);

            can.drawShape(myTriangle); // Use canvas class to draw our triangle
            totalArea += myTriangle.calculateArea(); // adds the total area of each shape

            drawTriangleFractal(width/2, height/2, x+width, y, triangleColor, can, level+1);
            // first recursion moves right
            drawTriangleFractal(width/2, height/2, x-(width/2), y, triangleColor, can, level+1);
            // second recursion moves left
            drawTriangleFractal(width/2, height/2, x+(width/4), y-height, triangleColor, can, level+1);
            // third recursion moves up
        }
    } // recursive case of triangle fractal. Must be called 3 times to hit each vertex of the triangle


    public void drawCircleFractal(double radius, double x, double y, Color c, Canvas can, int level) {
        if (level == 7) {
            return;
        } // base case of recursive function

        else {
            float r = rand.nextFloat(); // float r, g, and b are random floats used to create a random color for circle
            float g = rand.nextFloat();
            float b = rand.nextFloat();

            Color circleColor = new Color(r, g, b);

            Circle myCircle = new Circle(x, y, radius);

            myCircle.setColor(circleColor);

            can.drawShape(myCircle); // Using Canvas class to draw our circle

            totalArea += myCircle.calculateArea(); // Calculates the area after each recursion

            double diameter = radius*2;
            drawCircleFractal(radius/2, x+diameter - (radius/2), y, circleColor, can, level+1);
            // first recursion moves right
            drawCircleFractal(radius/2, x, y-diameter + (radius/2), circleColor, can, level+1);
            // second recursion moves up
            drawCircleFractal(radius/2, x-diameter + (radius/2), y, circleColor, can, level+1);
            // third recursion moves left
            drawCircleFractal(radius/2, x, y+diameter - (radius/2), circleColor, can, level+1);
            // fourth recursion moves down
        }
    } // recursive case of circle fractal, must be called 4 times to hit each "side" of the circle


    public void drawRectangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level) {
        if (level == 7) {

        } // base case of rectangle fractal

        else {
            float r = rand.nextFloat(); // float r, g, b are random floats used to create a random color for rectangle
            float g = rand.nextFloat();
            float b = rand.nextFloat();

            Color shapeColor = new Color(r, g, b);

            Rectangle myRectangle = new Rectangle(x, y, width, height);

            myRectangle.setColor(shapeColor);

            can.drawShape(myRectangle); // Using Canvas class to draw our rectangle

            totalArea += myRectangle.calculateArea(); // Calculates totalArea of each rectangle drawn

            drawRectangleFractal(width/2, height/2, x-(width/2), y-(height/2), shapeColor, can, level+1);
            // first recursion goes to top left corner
            drawRectangleFractal(width/2, height/2, x-(width/2), y+(height), shapeColor, can, level+1);
            // second recursion goes to bottom left corner
            drawRectangleFractal(width/2, height/2, x+(width), y-(height/2), shapeColor, can, level+1);
            // third recursion goes to top right corner
            drawRectangleFractal(width/2, height/2, x+(width), y+(height), shapeColor, can, level+1);
            // fourth recursion goes to bottom right corner

        }
    }


    public static void main(String[] args){
        FractalDrawer fractalDrawer = new FractalDrawer(); // Create FractalDrawer object to access drawFractal method

        System.out.print("What shape would you like to draw? "); // Ask user for their input
        Scanner userInput = new Scanner(System.in); // Use scanner to record user input

        String shapeSelection = userInput.next(); // Converts userInput into a string so we can use .equal()

        if (shapeSelection.equals("Circle")) { // Use .equal() to see if our user input was equal to "Circle"
            System.out.println("Circle Total Area is: " + fractalDrawer.drawFractal("Circle"));
        } // Draws a circle fractal recursively. Prints out the total area afterwards

        else if (shapeSelection.equals("Triangle")) { // Use .equal() to see if our user input was equal to "Triangle"
            System.out.println("Triangle Total Area is: " + fractalDrawer.drawFractal("Triangle"));
        } // Draws a triangle fractal recursively. Prints out the total area afterwards

        else if (shapeSelection.equals("Rectangle")) { // Use .equal() to see if our user input was equal to "Rectangle"
            System.out.println("Rectangle Total Area is: " + fractalDrawer.drawFractal("Rectangle"));
        } // Draws a circle rectangle recursively. Prints out the total area afterwards

    }
}
