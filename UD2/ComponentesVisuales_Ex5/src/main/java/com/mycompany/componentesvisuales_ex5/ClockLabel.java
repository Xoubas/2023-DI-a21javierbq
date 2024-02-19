/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.componentesvisuales_ex5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author a21javierbq
 */
public class ClockLabel extends JLabel implements Serializable {

    private boolean format24;

    public ClockLabel() {
        super();

        format24 = true;
        Timer t = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                updateClock();
            }
        });
        t.start();
    }

    private void updateClock() {
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter formatter;
        formatter = format24 ? DateTimeFormatter.ofPattern("HH:mm:ss") : DateTimeFormatter.ofPattern("hh:mm:ss a");
        
        this.setText(ldt.format(formatter));
    }
    
    public void setFormat(boolean format){
        format24= format;
        updateClock();
    }
}
