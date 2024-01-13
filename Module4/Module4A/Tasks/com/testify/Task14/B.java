package com.testify.Task14;

public class B {
    public static void main(String[] args) {
        squareShape values = new squareShape();
        //set value of length
        values.setShapeLength(21);
        int length = values.getShapeLength();

        //set value of breadth
        values.setShapeBreadth(21);
        int breadth = values.getShapeBreadth();

        //formula for area
        int area = length * breadth;


        //System.out.println(area);
        System.out.println("The area of a square of length: " + length + " and breadth: " + breadth + " is " + area);
    }
}
