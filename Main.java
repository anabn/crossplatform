package com.differentmvc;

import com.differentmvc.contoller.GeneralController;

public class Main {
    private static String circle = "Circle";
    private static String rectangle = "Rectangle";
    private static String triangle = "Triangle";
    private static String shapes = "shapes";

    public static void main(String[] args) {
        GeneralController generalController = new GeneralController(triangle);
        generalController.edit();
    }
}
