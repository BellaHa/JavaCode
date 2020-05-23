/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai16;

/**
 *
 * @author admin
 */
class Rectangle extends Shape {
   int width, height;
   public Rectangle(int _x, int _y, int _width, int _height) {
		super(_x, _y);
       	width = _width;
       	height = _height;
       	draw();
	}
   public void erase() {
		System.out.println("Xoa o diem (" + x + "," + y + ")");
   }
   public void draw() {
      	System.out.println("Tao o diem (" + x + "," + y + ")" +
          "hinh chu nhat chieu dai "+width+"chieu rong" +height);
    }
}

