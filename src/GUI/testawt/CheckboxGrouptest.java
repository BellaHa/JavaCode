/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.testawt;

/**
 *
 * @author MyPC
 */
   
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
 
public class CheckboxGrouptest {
    public CheckboxGrouptest() {
        Frame f = new Frame("Ví dụ AWT CheckboxGroup");
        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox checkbox1 = new Checkbox("Nam", cbg, false);
        checkbox1.setBounds(100, 50, 50, 50);
        Checkbox checkbox2 = new Checkbox("Nữ", cbg, true);
        checkbox2.setBounds(100, 90, 50, 50);
        f.add(checkbox1);
        f.add(checkbox2);
        f.setSize(400, 200);
        f.setLayout(null);
        f.setVisible(true);
    }
 
    public static void main(String args[]) {
        new CheckboxGrouptest();
    }
    }
