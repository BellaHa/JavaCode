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
public class Demo {
    public static void main(String[] args) {
        Quanly m = new Quanly();
        Nhanvien e = m;// upcasting: an toan
        Nguoi p = e; // upcasting: an toan
        p.talk();    
// p la Nguoi, nhung lai noi Toi la Nhan vien
        e.talk();
// e la Nhan vien, nhung lai noi Toi la Quan ly


    }
}
