/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai8;

/**
 *
 * @author admin
 */
class Homer {
	char doh(char c) {
		System.out.println("char");
		return 'd';
	}
	float doh(float f) {
		System.out.println("float");
		return 1.0f;
	}
}
class Milhouse {}
class Bart extends Homer {
	void doh(Milhouse m) {}
}
public class Hide {
	public static void main(String args[]) {
		Bart b = new Bart();
		b.doh(1); // doh(float) used
		b.doh('x');
		b.doh(1.0f);
		b.doh(new Milhouse());
	}
}
