package com.github.etienneZink.controller.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.github.etienneZink.controller.Controller;

public class ClearListener implements ActionListener {

    private Controller controller;

    public ClearListener(Controller controller){
        this.controller = controller;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        controller.clear();
    }
    

}