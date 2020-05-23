/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai15;

import bai2.*;

/**
 *
 * @author admin
 */
public class Nguoi {
	private String ten;   // tên
	private Date ngaysinh;  // ngày sinh
	public String layTen(){ 
		// lấy ra tên người
		return ten; 
	} 
        public void talk(){
		System.out.println("Toi la Nguoi!");
	}
        Nguoi(){}

}

