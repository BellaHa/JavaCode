/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai6;

import bai4.*;

/**
 *
 * @author admin
 */
import java.util.*;
public class Demo {
        public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        Nguoi ng1 = new Nguoi("Nguyễn Văn A","15/10/1970","Nam"," Hà Nội");
        Nguoi ng2 = new Nguoi();
        CanBo cb1 = new CanBo("Nguyễn Văn A","15/10/1970", "Nam", " Hà Nội","Trung tá","Trưởng khoa");
        CanBo cb2 = new CanBo();
        List<Nguoi> lst = new ArrayList<Nguoi>();
        lst.add(cb1);
        lst.add(ng1);
        for(Nguoi i:lst)
            
        
       // cb1.inThongtin();
       // cb2.inThongtin();
       
        System.out.println("IN cb:");
        input(sc,(Object)cb2);
       // cb2.inThongtin();
     		}
        public static void input(Scanner sc, Object ng){
            if(ng instanceof Nguoi){
                
                System.out.println("Nhập tên:");
               // String s = new String();
              //  s= sc.nextLine();
                ((Nguoi) ng).nhapTen(sc.nextLine());
                //System.out.println(((Nguoi) ng).layTen());
            
                if(ng instanceof CanBo){
                    System.out.println("Nhập cấp hàm:");
                   ((CanBo) ng).setCapHam(sc.nextLine());
                //System.out.println(((CanBo) ng).getCapHam());
                }
            
            }
        }
         public static void input(Scanner sc, Nguoi ng){
            
                System.out.println("Nhập tên:");
               // String s = new String();
              //  s= sc.nextLine();
                 ng.nhapTen(sc.nextLine());
                //System.out.println(((Nguoi) ng).layTen());
            
                if(ng instanceof CanBo){
                    System.out.println("Nhập cấp hàm:");
                   ((CanBo) ng).setCapHam(sc.nextLine());
                //System.out.println(((CanBo) ng).getCapHam());
                }
            
            
        }
}
