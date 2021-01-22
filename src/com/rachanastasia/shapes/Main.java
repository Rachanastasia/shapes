package com.rachanastasia.shapes;

public class Main {
    public static void main(String[] args){
        Circle c1 = new Circle();
        Circle c2 = new Circle(10, 15, 20);

        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle(1, 2, 3, 4, 5, 6);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(t1);
        System.out.println(t2);
    }
}
