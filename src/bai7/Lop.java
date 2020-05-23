/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai7;

/**
 *
 * @author admin
 */
import bai5.*;
import java.lang.Math;
public class Lop{
   	//final int sosv = 40;
	final int computer =(int)(Math.random()*20);
	static int count=0;
	//public Lop(){}
	public static void print(){
		System.out.println("Lop thu "+(++count));
   }
	public static void main(String[] args){
		Lop lop1 = new Lop();
		Lop lop2 = new Lop();
		Lop lop3 = new Lop();			
		lop1.print();
		lop2.print();
		lop3.print();
                Lop.print();
	}

}

