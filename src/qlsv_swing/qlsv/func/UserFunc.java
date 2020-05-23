package qlsv_swing.qlsv.func;

import qlsv_swing.qlsv.entity.User;

public class UserFunc {
    public boolean checkUser(User user) {
        if (user != null) {
            if ("admin".equals(user.getUserName()) 
                    && "admin".equals(user.getPassword())) {
                return true;
            }
        }
        return false;
    }
}
