package com.itheima.domain;

import org.springframework.format.annotation.DateTimeFormat;

import javax.xml.crypto.Data;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class Account implements Serializable{
    private String uname;
    private String password;
    private Double money;

    @Override
    public String toString() {
        return "Account{" +
                "uname='" + uname + '\'' +
                ", password='" + password + '\'' +
                ", money=" + money +
                ", users=" + users +
                ", birthday=" + birthday +
                ", map=" + map +
                ", user=" + user +
                '}';
    }

    private List<User>users;

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
//@DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

    public Map<String, User> getMap() {
        return map;
    }

    public void setMap(Map<String, User> map) {
        this.map = map;
    }

    private Map<String ,User>map;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    private User user;


    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }


}
