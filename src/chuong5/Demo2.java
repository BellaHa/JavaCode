/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong5;

import java.util.Scanner;
import java.util.*;

/**
 *
 * @author admin
 */
public class Demo2 {
    public static void main(String []args){
        /*
         LinkedList ll = new LinkedList();
        CanBo cb1 = new CanBo("Nguyễn văn A","15/10/1990","nam","HN","TU","K",500);
        CanBo cb2 = new CanBo("Trần Thị B","01/03/1990","nữ","HN","TU","K",500);
        ll.add(cb1);
        ll.add(cb2);
        
        
        System.out.println("Xuất danh sách liên kết: ");
        for(int i=0; i<2; i++)
        { CanBo temp = (CanBo) ll.get(i);
          temp.inThongtin();
        }
        System.out.println("Nội dung ban đầu của dslk: "+ll);
        System.out.println("Xoa các phần từ của dslk");
        ll.remove(cb1);
        ll.remove(0);
        System.out.println("Nội dung sau xóa của dslk: "+ll);
        
         for(int i=0; i<2; i++)
             ll.add(i, cb1);
        CanBo temp =(CanBo) ll.removeFirst();
        temp.inThongtin();
        temp =(CanBo)ll.removeLast();
        temp.inThongtin();
        */
        
        CanBo[] lscb;
        int n; 
         Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cán bộ: ");
         n = Integer.valueOf(sc.nextLine());
        lscb = new CanBo[n];
    try{
         
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
       
     	          
        } catch (ArrayIndexOutOfBoundsException | NullPointerException | NumberFormatException |ArithmeticException e) {
            System.out.println("Có lỗi xảy ra:" + e);
        }
        
        finally{
            System.out.println("Chương trình đã chạy xong");
        } 
              
        ArrayList<CanBo> ls = new ArrayList<CanBo>();
         for(int i =0; i<n; i++)
            ls.add(lscb[i]);
        
        System.out.println("In ra ArrayList:");
        for(int i=0; i< ls.size(); i++)
        {
            CanBo cb = ls.get(i);
            cb.inThongtin();
        }
        System.out.println("Sử dụng Iterator để In ra ArrayList:");
        Iterator<CanBo> it = ls.iterator();
        while(it.hasNext()){
            CanBo temp = it.next();
            temp.inThongtin();
        }
        ListIterator<CanBo> lt = ls.listIterator();
        while(lt.hasNext()){
            CanBo temp =lt.next();
            temp.inThongtin();
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