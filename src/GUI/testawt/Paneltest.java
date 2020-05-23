/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import  java.awt.*;
      class Paneltest  extends Panel {
            public  static void main (String arg [ ]) {
                     Paneltest p= new Paneltest ( );
                     Frame   f= new Frame ("kiem tra panel");
                     f.add (p);
                     f.setSize (300,200);
                     f.setVisible (true);
           }
           public Paneltest ( )
           {
            }
  }

