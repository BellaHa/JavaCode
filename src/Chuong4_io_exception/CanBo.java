/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chuong4_io_exception;

//import bai4.*;

/**
 *
 * @author admin
 */
public class CanBo extends Nguoi{
    private String capHam;
    private String chucVu;
    private double luong; 
    public CanBo(){
        this("","","","","","",0);
        
    }
    public CanBo(String hoTen, String ngaySinh, String gioiTinh, String queQuan, String capHam, String chucVu, double luong) {
        super(hoTen,ngaySinh,gioiTinh,queQuan);
        this.capHam = capHam;
        this.chucVu = chucVu;
        this.luong = luong;
        
    }
    public String getCapHam() {
        return capHam;
    }
    public String getChucVu() {
        return chucVu;
    }
    public void setCapHam(String capHam) {
        this.capHam = capHam;
    }
    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }
    public void setLuong(double l)throws NumberFormatException {this.luong = l;}
    public double getLuong() throws NumberFormatException {return this.luong;}
    public int tinhTuoi(){
        int tuoi=0;
        //code tính tuổi 
        return tuoi;
    }
    public void kiemtratuoi(){
        if (tinhTuoi() < 18)
            throw new ArithmeticException("Chưa đủ tuổi tuyển dụng");
        else
            System.out.println("Đủ tuổi tuyển dụng");

    }
    public void inThongtin(){
        super.inThongtin();
        System.out.printf("\tCấp hàm:%s\tChức vụ:%s\tLương:%5.3f\n",this.getCapHam(),this.getChucVu(),this.getLuong());
           
    }
}	
