/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.testawt;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
 
public class MenuItemExample {
    public MenuItemExample() {
        Frame frame = new Frame("Ví dụ Menu và MenuItem trong Java AWT");
        MenuBar menuBar = new MenuBar();
        Menu menu = new Menu("Menu");
        Menu submenu = new Menu("Xuất");
        MenuItem menuItem1 = new MenuItem("Tạo mới");
        MenuItem menuItem2 = new MenuItem("Mở");
        MenuItem menuItem3 = new MenuItem("Lưu");
        MenuItem menuItem4 = new MenuItem("Đóng");
        MenuItem menuItem5 = new MenuItem("In");
         MenuItem menuItem6 = new MenuItem("Gửi mail");
        menu.add(menuItem1);
        menu.add(menuItem2);
        menu.add(menuItem3);
        menu.add(menuItem4);
        submenu.add(menuItem5);
        submenu.add(menuItem6);
        menu.add(submenu);
        menuBar.add(menu);
        frame.setMenuBar(menuBar);
        frame.setSize(450, 250);
        frame.setLayout(null);
        frame.setVisible(true);
    }
 
    public static void main(String args[]) {
        new MenuItemExample();
    }
}