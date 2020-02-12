package com.differentmvc.view;
import com.differentmvc.model.*;

public class GeneralView{
    Shape[] shapes = {
            new Circle("red", 11.2),
            new Circle("blue", 11),
            new Circle("pink", 2),
            new Rectangle("red", 2, 1),
            new Rectangle("grey", 11, 22),
            new Rectangle("blue", 12, 1),
            new Rectangle("black", 7, 5),
            new Triangle("grey", 2, 4, 5),
            new Triangle("green", 5, 6, 10),
    };

    public void print(String figure) {
        if(figure.equals("shapes")){
            for (Shape elem : shapes) {
                System.out.println(elem.draw());
            }
        }
        for (int i = 0; i < shapes.length; i++) {
            if ((shapes[i].getClass().getSimpleName()).equals(figure)) {
                System.out.println(shapes[i].draw());
            }
        }
        if(!figure.equals("shapes")&&!figure.equals("Circle") && !figure.equals("Rectangle") && !figure.equals("Triangle")){
            System.out.println("mb, next time");
        }
    }
}