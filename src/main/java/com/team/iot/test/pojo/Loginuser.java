package com.team.iot.test.pojo;

public class Loginuser {

    private String user;
    private String password;

    @Override
    public String toString() {
        return "Loginuser{" +
                "user='" + user + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Loginuser(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public Loginuser() {
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
