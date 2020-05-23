/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong5;

import Chuong4_io_exception.*;

/**
 *
 * @author admin
 */
public class Nguoi{
    protected String hoten;
    protected String ngaysinh;
    protected String gioitinh;
    protected String quequan;
    // phuong thuc khoi tao
    Nguoi(){
        this("","","","");
       
    }
    Nguoi(String _hoten,String _ngaysinh, String _gioitinh, String _quequan){
        this.hoten = _hoten;
        this.ngaysinh = _ngaysinh;
        this.gioitinh = _gioitinh;
        this.quequan   = _quequan;
       
    }
    // cac phuong thuc nhap
    public void nhapTen(String _hoten){this.hoten = _hoten;}
    public void nhapNgaysinh(
       String _ngaysinh){this.ngaysinh = _ngaysinh;}
    public void nhapGioitinh(
        String _gioitinh){this.gioitinh = _gioitinh;}
    public void nhapQuequan(String _quequan){
       this.quequan   = _quequan;}
    // cac phuong thuc lay thong tin
    public String layTen(){return this.hoten;}
    public String layNgaysinh(){ return this.ngaysinh;}
    public String layGioitinh(){return this.gioitinh;}
    public String layQuequan(){return this.quequan;}
    // in thong tin can bo
    public void inThongtin(){
        System.out.printf("Họ và tên: %s\t Ngày sinh: %s \t Giới tính: %s \t Quê quán:%s", this.layTen(),this.layNgaysinh(),this.layGioitinh(),this.layQuequan());
      
    }
}

