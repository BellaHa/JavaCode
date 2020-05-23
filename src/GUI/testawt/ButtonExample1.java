/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.testawt;


import java.awt.Button;
import java.awt.Frame;
 
public class ButtonExample1 {
    public static void main(String[] args) {
        Frame f = new Frame("Button Example");
        Button b = new Button("Click Here");
        b.setBounds(50, 100, 80, 30);
        f.add(b);
        f.setSize(400, 200);
        f.setLayout(null);
        f.setVisible(true);
    }
}