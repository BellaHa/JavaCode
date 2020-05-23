/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai18;

/**
 *
 * @author admin
 */
class Rectangle implements Action{
   int width, height, x,y;
   public Rectangle(int _x, int _y, int _width, int _height) {
			x= _x;
			y=_y;
			width = _width;
			height = _height;
			draw();
	}
	public void erase() {
			System.out.println("Xoa o diem (" + x + "," + y + ")");
	}
	
	public void draw() {
			System.out.println("Tao o diem (" + x + "," + y + ")" +
         " hinh chu nhat chieu dai "+width+"chieu rong" +height);
	}
	public void moveTo(int x, int y) {
      	erase();
      	x = x;
      	y = y;
      	draw();
   }
}

