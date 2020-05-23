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
public class Demo {
        public static void main(String []args){
        Nguoi ng1 = new Nguoi("Nguyễn Văn A","15/10/1970","Nam"," Hà Nội");
        Nguoi ng2 = new Nguoi();
        CanBo cb1 = new CanBo("Nguyễn Văn A","15/10/1970", "Nam", " Hà Nội","Trung tá","Trưởng khoa");
        CanBo cb2 = new CanBo();
        cb1.inThongtin();
        cb2.inThongtin();
     		}

}
