/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.testawt;


import java.awt.Frame;
import java.awt.TextField;
 
public class TextFieldExample1 {
    public static void main(String args[]) {
        Frame f = new Frame("TextField Example");
        TextField t1, t2;
        t1 = new TextField("Điền thông tin môn học lập trình GUI");
        t1.setBounds(50, 100, 300, 30);
        t2 = new TextField("Vi du AWT TextFiled");
        t2.setBounds(50, 150, 200, 30);
        f.add(t1);
        f.add(t2);
        f.setSize(400, 250);
        f.setLayout(null);
        f.setVisible(true);
    }
}
