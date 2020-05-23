/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai19;

interface CanFight {
	void fight();
}
interface CanSwim {
  	void swim();
}
interface CanFly {
  	void fly();
}
class ActionCharacter {
   public void fight() {}
}
class Hero extends ActionCharacter
	implements CanFight, CanSwim, CanFly {
  	public void swim() {}
  	public void fly() {}
}
public class Adventure {
  	static void t(CanFight x) { x.fight(); }
  	static void u(CanSwim x) { x.swim(); }
  	static void v(CanFly x) { x.fly(); }
  	static void w(ActionCharacter x) { x.fight(); }
  	public static void main(String args[]) {
		Hero spiderman = new Hero();
		t(spiderman); // Coi nhu la mot CanFight
    	u(spiderman); // Coi nhu la mot CanSwim
   		v(spiderman); // Coi nhu la mot CanFly
    	w(spiderman); // Coi nhu la mot ActionCharacter
  	}
}
