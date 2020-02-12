package com.differentmvc.contoller;

import com.differentmvc.model.*;
import com.differentmvc.view.GeneralView;

public class GeneralController  {
    private String figure;
    public GeneralController(String figure) {
        this.figure = figure;
    }

    public void edit(){
            GeneralView generalView = new GeneralView();
            generalView.print(figure);
    }
}
