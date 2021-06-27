package com.example.HW5_3.User;


import com.example.HW5_3.model.User;

import java.util.List;

public class UserCheck {
    public static boolean checkUserLogin(String username, String pwd) {
        List<User> users=UserManagement.loadUsers();
        boolean admit=false;
        for(int i= 0;i<users.size();i++){
            if((users.get(i).getName()).equals(username)&&(users.get(i).getPsd()).equals(pwd)){
                admit=true;
            }
        }
        return admit;
    }
}
