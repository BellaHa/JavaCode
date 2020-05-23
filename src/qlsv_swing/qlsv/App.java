package qlsv_swing.qlsv;

import java.awt.EventQueue;

import qlsv_swing.qlsv.controller.LoginController;
import qlsv_swing.qlsv.view.LoginView;

public class App {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                LoginView view = new LoginView();
                LoginController controller = new LoginController(view);
                // hiển thị màn hình login
                controller.showLoginView();
            }
        });
    }
}