package org.example.class_object;

class Circle_a {
    int radius;
    public Circle_a(int radius) {
        this.radius = radius;
    }
    public double getArea() {
        return 3.14*radius*radius;
    }
}


public class CircleArray {
    public static void main(String[] args) {
        Circle_a [] c;
        c = new Circle_a[5];

        for(int i=0; i<c.length; i++)
            c[i] = new Circle_a(i);

        for(int i=0; i<c.length; i++)
            System.out.print((int)(c[i].getArea()) + " ");
    }
}
