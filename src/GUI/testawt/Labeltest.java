/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.testawt;

import   java.awt.*;
   class  Labeltest  extends Frame {
       Label  label1 = new Label ("Chào mừng các em đã đến với môn học lập trình GUI");
    public   Labeltest (String title) {
              super (title);
              add (label1);
    }
      public static void main (String arg [ ]) {
           Labeltest  f = new Labeltest ("Test Label");
           f.setSize(500,500);
           f.setVisible(true);
           
      }
    }

