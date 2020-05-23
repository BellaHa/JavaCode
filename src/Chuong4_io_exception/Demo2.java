/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chuong4_io_exception;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Demo2 {
    public static void main(String []args){
    try{
        CanBo[] lscb;
        int n; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cán bộ: ");
         n = Integer.valueOf(sc.nextLine());
        lscb = new CanBo[n];
        // Khởi tạo từng phần tử Cán bộ trong danh sách
       for(int i =0; i<n; i++)
            lscb[i] = new CanBo();
        System.out.println("Nhập từng cán bộ: ");
        for(int i =0; i<n; i++){
            String tmp = new String();
            System.out.println("Nhập họ tên: ");
            lscb[i].nhapTen(sc.nextLine());
            System.out.println("Nhập ngày sinh: ");
            lscb[i].nhapNgaysinh(sc.nextLine());
            System.out.println("Nhập giới tính: ");
            lscb[i].nhapGioitinh(sc.nextLine());
            System.out.println("Nhập quê quán: ");
            lscb[i].nhapQuequan(sc.nextLine());
            System.out.println("Nhập cấp hàm: ");
            lscb[i].setCapHam(sc.nextLine());
            System.out.println("Nhập chức vụ: ");
            lscb[i].setChucVu(sc.nextLine());
            System.out.println("Nhập lương: ");
            lscb[i].setLuong(Double.valueOf(sc.nextLine()));
        }
       
     	 System.out.println("Danh sách cán bộ: ");
          for(int i =0; i<n; i++){
              lscb[i].kiemtratuoi();
             
              lscb[i].inThongtin();
          }
          
        } catch (ArrayIndexOutOfBoundsException | NullPointerException | NumberFormatException |ArithmeticException e) {
            System.out.println("Có lỗi xảy ra:" + e);
        }
        
        finally{
            System.out.println("Chương trình đã chạy xong");
        } 
    
    }
}
  /*
        n = sc.nextInt();
        lscb = new CanBo[n];
        // Khởi tạo từng phần tử Cán bộ trong danh sách
        for(int i =0; i<n; i++)
            lscb[i] = new CanBo();
        System.out.println("Nhập từng cán bộ: ");
        for(int i =0; i<n; i++){
            String tmp = new String();
            System.out.println("Nhập họ tên: ");
            //tmp = sc.nextLine();
            lscb[i].nhapTen(sc.nextLine());
            System.out.println("Nhập ngày sinh: ");
            lscb[i].nhapNgaysinh(sc.nextLine());
            System.out.println("Nhập giới tính: ");
            lscb[i].nhapGioitinh(sc.nextLine());
            System.out.println("Nhập quê quán: ");
            lscb[i].nhapQuequan(sc.nextLine());
            System.out.println("Nhập cấp hàm: ");
            lscb[i].setCapHam(sc.nextLine());
            System.out.println("Nhập chức vụ: ");
            lscb[i].setChucVu(sc.nextLine());
            System.out.println("Nhập lương: ");
            lscb[i].setLuong(sc.nextDouble());
        }
    */