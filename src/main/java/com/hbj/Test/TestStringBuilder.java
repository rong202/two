package com.hbj.Test;

import java.util.ArrayList;
import java.util.List;

public class TestStringBuilder {
    private static List<User> dataList = new ArrayList();
    public static void main(String[] args) {
        User user = new User("","","","1");
        TestStringBuilder testStringBuilder = new TestStringBuilder();
        testStringBuilder.test(user);
    }
    public  void test(User user){
        StringBuilder stringBuilder = new StringBuilder();
        String s = ",";
        if (!user.getId().isEmpty()){
            stringBuilder.append(s + user.getId());
        }
        if (!user.getName().isEmpty()){
            stringBuilder.append(s + user.getName());
        }
        if (!user.getAge().isEmpty()){
            stringBuilder.append(s + user.getAge());
        }
        if (!user.getBirthday().isEmpty()){
            stringBuilder.append(s + user.getBirthday());
        }

        if (stringBuilder.length()>0 && !"".equals(stringBuilder.toString()) && !"null".equals(stringBuilder.toString()) ){
            StringBuilder str = new StringBuilder();
            str = str.append("order by").append(stringBuilder) ;
            System.out.println(str);
            str.replace(8,9," ");
            System.out.println(str);
        }
        System.out.println("str----");

    }



    private static void a(){
        User user = new User("1","11","2","");
        StringBuilder stringBuilder = new StringBuilder();
        String s = ",";
        if (!user.getId().isEmpty()){
            stringBuilder.append(s + user.getId());
        }
        if (!user.getName().isEmpty()){
            stringBuilder.append(s + user.getName());
        }
        if (!user.getAge().isEmpty()){
            stringBuilder.append(s + user.getAge());
        }
        if (!user.getBirthday().isEmpty()){
            stringBuilder.append(s + user.getBirthday());
        }

        if (stringBuilder.length()>0 && !"".equals(stringBuilder.toString()) && !"null".equals(stringBuilder.toString()) ){

            StringBuilder str = new StringBuilder();
            str = str.append("order by").append(stringBuilder) ;
            System.out.println(str);
            str.replace(8,9," ");

            System.out.println(str);
        }


    }


}
