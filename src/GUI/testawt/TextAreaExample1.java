/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.testawt;


import java.awt.Frame;
import java.awt.TextArea;
 
public class TextAreaExample1 {
 
    public TextAreaExample1() {
        Frame f = new Frame();
        TextArea area = new TextArea("Xin chào đến với môn học lập trình GUI\n"
                + "Ví dụ AWT TextArea");
        area.setBounds(20, 30, 300, 300);
        f.setTitle("Ví dụ AWT TextArea");
        f.add(area);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
 
    public static void main(String args[]) {
        new TextAreaExample1();
    }
}