/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai16.shape2;

import bai16.Circle;

/**
 *
 * @author admin
 */
public class Circle2 extends Shape2 implements Action{
    int r;
    public Circle2(int _x, int _y, int _r) {
        super(_x, _y);
        r = _r;
        draw();
        }
    public void moveTo(int x1, int y1) {
        erase();
        x = x1;
        y = y1;
        draw();
    }
    public void erase() {System.out.println("Than lop erase");}
    public void draw() {System.out.println("Than lop draw");}
    public static void main(String [] args){
        Circle c = new Circle (10,10, 100);
        c.erase();
        c.draw();
    }

}