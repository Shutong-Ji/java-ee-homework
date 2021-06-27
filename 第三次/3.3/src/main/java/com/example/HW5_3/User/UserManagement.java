package com.example.HW5_3.User;

import com.example.HW5_3.model.User;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.nio.file.StandardOpenOption.APPEND;

public class UserManagement {

    public static List<User> loadUsers() {//User是User.java里的User
        List<User>users = new ArrayList<>();
        try (Stream<String> stream = Files.lines(Paths.get(UserConstant.USER_FILE))) {//以stream流的形式读取文件的所有行
            users = stream.map(line -> {
                String[] items = line.split("\\|");//以|的形式切割
                int id = Integer.parseInt(items[0]);
                String name = items[1];
                String pwd = items[2];

                return new User(id, name, pwd);
            }).collect(Collectors.toList());//返回一个收集器，该收集器将输入元素累加到一个新的list中
        } catch (Exception e) {
            e.printStackTrace();
        }
        return users;
    }
    public static User getUserByName(String name) {
        List<User> users = UserManagement.loadUsers();
        List<User> target= new ArrayList<>();
        for(int i=0;i<users.size();i++){//i有2个：txt里有两个元素（两个用户），用|把每个元素分成了好几个属性；从元素里面读取name来获取user
            if(users.get(i).getName().equals(name)){
                target.add(users.get(i));
            }
        }
        return target.get(0);//target得到的下标是0
    }



}
