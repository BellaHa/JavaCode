/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.testawt;
 
import java.awt.Button;
import java.awt.Frame;
 
public class Frame2 {
    Frame2 () {
        Frame f = new Frame();
        f.setTitle("Ví dụ 2 AWT trong Java");
        Button b = new Button("Bấm nút");
         b.setBounds(30, 50, 80, 30);
        f.add(b);
        f.setSize(300, 300);
        f.setLayout(null);
       // f.pack();
        f.setVisible(true);
    }
 
    public static void main(String args[]) {
       new Frame2 ();
    }
}