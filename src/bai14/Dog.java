/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai14;

class Animal {
	public void print() { System.out.println("In tu lop cha Animal");}
	public String toString(){
		return "toString cua  Animal";
	}
}
public class Dog extends Animal {
	public void print() { 
		System.out.println("In tu lop con Dog");
	}
	public String toString(){
		return "toString cua Animal";
	}
	public static void main(String args[]) {
		Animal animal = new Animal();
		Dog dog = new Dog();
		animal.print();
		System.out.println(animal.toString());
		dog.print();
		System.out.println(dog.toString());
	}
}

