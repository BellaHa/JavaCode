/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

/**
 *
 * @author admin
 */
public class CanBo extends Nguoi{
    private String capHam;
    private String chucVu;
    private double luong; 
    public CanBo(){
        
        System.out.println("Khởi tạo không tham số cho lớp CanBo!");
    }
    public CanBo(String hoTen, String ngaySinh, String gioiTinh, String queQuan, String capHam, String chucVu) {
       
        this.hoten = hoTen;
        this.ngaysinh = ngaySinh;
        this.gioitinh = gioiTinh;
        this.quequan = queQuan;
        this.capHam = capHam;
        this.chucVu = chucVu;
        System.out.println("Khởi tạo có tham số cho lớp CanBo!");
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
    
    public void inThongtin(){
        super.inThongtin();
        System.out.println(", " + capHam);
        System.out.println(", " + chucVu);
       // System.out.println("Số người:"+ Nguoi.x);  
    }
}	
