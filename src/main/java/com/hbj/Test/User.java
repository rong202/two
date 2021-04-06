package com.hbj.Test;

public class User {
    private String Id;
    private String name;
    private String age;

    public String getAge() {
        return age;
    }

    public User(String id, String name, String age, String birthday) {
        Id = id;
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    private String birthday;

    public User(String id, String name) {
        Id = id;
        this.name = name;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
