package com.hbj.Test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestLombda {
    public static void main(String[] args) {
        User user = new User("","","1", "11");
        User user2 = new User("","","1", "11");
        User user3 = new User("","","1", "11");
        User user4 = new User("","","1", "11");
        ArrayList<User> users = new ArrayList<>();
        users.add(user);
        users.add(user4);
        users.add(user2);
        users.add(user3);
        users.stream().map(User::getId).forEach(
                System.out::println
        );
        String collect = users.stream().map(User::getId).collect(
                Collectors.joining(",")
        );
        System.out.println(collect);
        System.out.println("-----------------------------");
        String names = users.stream().map(User::getName).collect(Collectors.joining(","));
        System.out.println(names);

        List<String> cities = Arrays.asList("Milan",
                "London",
                "New York",
                "San Francisco");
        String citiesCommaSeparated = String.join(",", cities);
        System.out.println(citiesCommaSeparated);

        String collect1 = cities.stream().collect(Collectors.joining(","));
        System.out.println(collect1);

        String collect2 = cities.stream().map(String::toUpperCase).collect(Collectors.joining(","));
        System.out.println(collect2);

    }
    private static final String SEPARATOR = ",";
    public static String toCsv(List<String> listToConvert){
        return String.join(SEPARATOR, listToConvert);
    }
    @Test
    public void a(){
        List<String> cities = Arrays.asList(
                "Milan", "London", "New York", "San Francisco");
        String expected = "Milan,London,New York,San Francisco";
       // assertEquals(expected, toCsv(cities));

        Comparator<Integer> tComparator = (x, y) -> {
            return Integer.compare(x, y);
        };
    }
}
