/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai9.giaovien;
import bai2.Nguoi;
/**
 *
 * @author admin
 */
public class Giaovien extends Nguoi{
   	
   	public String layTen(){
		System.out.println("Ten giao vien!");
		return super.layTen();
	}
	public static void main(String args[]){
		Giaovien frd = new Giaovien();
		frd.layTen();
	}
}
