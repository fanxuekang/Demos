package com.iss.day06;

import java.util.Objects;

public class User {
    int id;
    String email;
    String pwd;

    public User(){};
    public User(int id, String email, String pwd) {
        this.id = id;
        this.email = email;
        this.pwd = pwd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                Objects.equals(email, user.email) &&
                Objects.equals(pwd, user.pwd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, pwd);
    }
}
