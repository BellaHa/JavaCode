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
abstract public class Shape{
    protected int x, y;
    public Shape(){}
    public Shape(int _x, int _y){
        x = _x;
        y = _y;
    }
    public void moveTo(int x1, int y1) {
        erase();
        x = x1;
        y = y1;
        draw();
    }
    
    abstract public void erase();
    abstract public void draw();
    
}
