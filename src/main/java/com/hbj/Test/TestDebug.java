package com.hbj.Test;

import java.util.ArrayList;
import java.util.List;

public class TestDebug {
    public static void main(String[] args) {
        a();
    }
    public static void a(){
        List<Object> list = new ArrayList();
        for (int i=0;i<=10;i++){
            list.add(i);
        }
        System.out.println(list.toString());
    }

}
