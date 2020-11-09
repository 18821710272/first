package com.qf.pojo;

public class User {
    private Integer u_id;
    private String u_name;
    private String u_pass;
    private String u_sex;
    private Integer u_vip;

    public User() {
    }

    public User(Integer u_id, String u_name, String u_pass, String u_sex, Integer u_vip) {
        this.u_id = u_id;
        this.u_name = u_name;
        this.u_pass = u_pass;
        this.u_sex = u_sex;
        this.u_vip = u_vip;
    }

    public Integer getU_id() {
        return u_id;
    }

    public void setU_id(Integer u_id) {
        this.u_id = u_id;
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public String getU_pass() {
        return u_pass;
    }

    public void setU_pass(String u_pass) {
        this.u_pass = u_pass;
    }

    public String getU_sex() {
        return u_sex;
    }

    public void setU_sex(String u_sex) {
        this.u_sex = u_sex;
    }

    public Integer getU_vip() {
        return u_vip;
    }

    public void setU_vip(Integer u_vip) {
        this.u_vip = u_vip;
    }

    @Override
    public String toString() {
        return "User{" +
                "u_id=" + u_id +
                ", u_name='" + u_name + '\'' +
                ", u_pass='" + u_pass + '\'' +
                ", u_sex='" + u_sex + '\'' +
                ", u_vip=" + u_vip +
                '}';
    }
}
