/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.testawt;

import   java.awt.*;
      class   FrameDemo  extends Frame {   
	public  FrameDemo (String title){       
            super (title);
        }
        public  static void main(String arg [ ]) {
            FrameDemo f= new FrameDemo("Thử Frame");
            f.setSize (300,200);
            f.setVisible (true);
            }
       }

