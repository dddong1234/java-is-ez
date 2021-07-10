package com.lilspicy.ch07.practice;

import java.awt.*;
import java.awt.event.*;

public class Exercise7_9 {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.addWindowFocusListener(new EventHandler());
    }
}

class EventHandler extends WindowAdapter {
    public void windowClosing(WindowEvent e) {
        e.getWindow().setVisible(false);
        e.getWindow().dispose();
        System.exit(0);
    }
}