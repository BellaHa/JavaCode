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
public class Circle extends Point{
   Circle(int x, int y, String color, int bk){
      super(x,y,color);
       bk = bk;
   }
   Circle(){}
   public void draw(){
       System.out.println("Vẽ đường tròn");
   } // vẽ 1 đường tròn
   private int bk;
   public static void main(String args[]) {
     	Point p = new Point(0,0,"white");
        Circle c =new Circle(100,100,"blue",50);
        p.draw(); 
        // Vẽ 1 điểm trắng tại điểm (0,0)
        c.draw(); 
        // Vẽ một hình tròn màu xanh, bán kính 50 tâm tại điểm (100,100)

	}
}

