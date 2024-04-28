/**
 * TODO
 *
 * @Author lzf
 * @Date 2024-04-26 11:37
 **/

package com.book.pojo;

public class Admin {
    private Integer admin_id;
    private String password;

    public Admin() {
        //必须要，反射创建对象,底层反射在用
        //System.out.println("反射");
    }

    public Admin(Integer admin_id, String password) {
        this.admin_id = admin_id;
        this.password = password;
    }

    public Integer getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(Integer admin_id) {
        this.admin_id = admin_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "admin_id=" + admin_id +
                ", password=" + password +
                '}';
    }
}
