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
public class Demo {
    public static void main(String args[]) {
        Circle c = new Circle(10,10,80);
        Rectangle r = new Rectangle(5,10,50,60);
        c.draw();
        r.draw();
        c.moveTo(15,20);
        r.moveTo(50,90);
        c.erase();
        r.erase();
    }
}
