/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chuong4_io_exception;
/**
 *
 * @author admin
 */
public class Sinhvien extends Nguoi{
    private String lop, khoa;
    Sinhvien(){
        super();
        lop="";
        khoa = "";
        //System.out.println("Ko tham so SV");
    }
    Sinhvien(String _ht, String _gt, String _ns, String _qq, String _lop, String _khoa){
        super(_ht, _gt, _ns, _qq);
        this.lop = _lop;
        this.khoa = _khoa;
       // System.out.println("Co tham so SV");
    }
    // get và set cho từng thuộc tính của Sinhvien
    public void setLop(String _lop){this.lop = _lop;}
    public String getLop(){return this.lop;}
    
     public void setKhoa(String _khoa){this.khoa = _khoa;}
    public String getKhoa(){return this.khoa;}
    
    // In thông tin sinh viên
    public void inThongtin(){
        super.inThongtin();
        System.out.println(" Lớp:"+this.getLop()+" Khoa: "+this.getKhoa());
    
    }
}
