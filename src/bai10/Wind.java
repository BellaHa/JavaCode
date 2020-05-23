/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai10;

class Instrument {
	public void play() {}
	static void tune(Instrument i) {
		i.play();
   }
}
class Wind extends Instrument {
	public static void main(String args[]) {
		Wind flute = new Wind();
		Instrument.tune(flute); // Upcasting
	}
}

