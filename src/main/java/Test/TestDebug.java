package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestDebug {
    public static void main(String[] args) {
        a();
    }
    public static void a(){
        List<Object> list = new ArrayList();
        for (int i=0;i<=10;i++){
            list.add(i);
        }
        List<Integer> integers = Arrays.asList(1, 2, 3, 4);
        integers.stream().filter(i->i>3).collect(Collectors.toSet());

        for(int i=0;i<100;i++){
            System.out.println(i);
        }
        System.out.println(list.toString());
        System.out.println("git add .");
        System.out.println("合并分支123");
    }

}
