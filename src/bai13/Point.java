/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai13;

/**
 *
 * @author admin
 */
public class Point {
   Point(int x, int y,String color){//code
       x=x;
       y=y;
       color = color;
   }
   Point(){this(0,0,"");}
   public void draw(){//code
       System.out.println("Vẽ điểm");
   }// vẽ điểm
   private int x,y;
   String color; 
}

