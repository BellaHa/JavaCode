/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai11;

class Test {
   public static void main(String args[]) {
     	in(5);
	in(5.0);
	}
    public static void in(int i) {
        System.out.println("int i = " + i);
    }
    public static void in(double d) { // cùng tên, khác tham số
        System.out.println("double d = " + d);
    }
}

