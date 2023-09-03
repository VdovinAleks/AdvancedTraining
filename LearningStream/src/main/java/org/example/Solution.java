package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class Solution {

//    public static int getCountOfFreeEmails(List<String> emails) {
//        Stream<String> count = emails.stream()
//                .filter(mail -> Objects.equals(mail.split("@")[1], "gmail.com"))
//                ;
//
//    }
    public static void main(String[] args) {
        List<String> emails = new ArrayList<>();
        emails.add("info@gmail.com");
        emails.add("info@yandex.ru");
        emails.add("support@hexlet.io");
        emails.add("info@hotmail.com");
        emails.add("support.yandex.ru@host.com");

        int count  = Math.toIntExact(emails.stream()
                .filter(mail -> mail.endsWith("gmail.com") || mail.endsWith("yandex.ru") || mail.endsWith("hotmail.com"))
                .count());

        System.out.println(count);
    }
}
