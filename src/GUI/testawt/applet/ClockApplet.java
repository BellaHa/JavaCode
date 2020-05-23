/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.testawt.applet;

import java.awt.*;
import java.applet.*;

import java.applet.*;
import java.awt.*;
import java.util.*;

public class ClockApplet extends Applet implements Runnable{
   Thread t,cur_t;
   public void start(){
      System.out.println("Sinh ra mot luong moi!");
      t = new Thread(this);
      t.start();
   }
   public void run(){
      cur_t = Thread.currentThread();
    
     while(cur_t == t){
         repaint();
        try{
            cur_t.sleep(1000);    
         }
        catch(InterruptedException e){}
     }
   }
   public void paint(Graphics g){
      Calendar cal = new GregorianCalendar();
      String hour = String.valueOf(cal.get(Calendar.HOUR));
      String minute = String.valueOf(cal.get(Calendar.MINUTE));
      String second = String.valueOf(cal.get(Calendar.SECOND));
      g.drawString(hour + ":" + minute + ":" + second, 20, 30);
   }
}