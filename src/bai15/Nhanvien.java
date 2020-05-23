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
public class Nhanvien extends Nguoi{
	//Khai báo 1 người - Quan hệ has-as   
	private Nguoi nguoi; 
	private double luong; // lương
	public String layTen(){ 
		// lấy ra tên nhân viên
		return nguoi.layTen();
	}
        public void talk(){
		System.out.println("Toi la Nhan vien!");
	}
        Nhanvien(){}

}
