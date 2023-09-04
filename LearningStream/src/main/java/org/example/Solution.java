package org.example;

import scala.collection.immutable.Stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Solution {
    public static HashMap<Integer, String> ListUserToMap(List<User> user) {
        return new HashMap<>(user.stream()
                .peek(u -> System.out.println(user))
                .collect(Collectors.toMap(User::getId, User::getName)));
    }

    public static void main(String[] args) {
//        List<String> emails = new ArrayList<>();
//        emails.add("info@gmail.com");
//        emails.add("info@yandex.ru");
//        emails.add("support@hexlet.io");
//        emails.add("info@hotmail.com");
//        emails.add("support.yandex.ru@host.com");
//
//        int count = Math.toIntExact(emails.stream()
//                .filter(mail -> mail.endsWith("gmail.com") || mail.endsWith("yandex.ru") || mail.endsWith("hotmail.com"))
//                .count());
//
//        System.out.println(count);


        List<User> users = List.of(
                new User("Andrew", 1),
                new User("Gosha", 2),
                new User("Misha", 3)
        );
        HashMap<Integer, String> MapUsers = ListUserToMap(users);
        System.out.println(MapUsers);
    }


}
