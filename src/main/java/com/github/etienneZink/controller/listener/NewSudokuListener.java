package com.github.etienneZink.controller.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.github.etienneZink.controller.Controller;

/**
 * Listener to react if the new-button gets pressed
 */
public class NewSudokuListener implements ActionListener {

    private Controller controller;

    public NewSudokuListener(Controller controller){
        this.controller = controller;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        controller.newSudoku();
    }
    
}