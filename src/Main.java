import Phonebook.*;
import Product.*;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

public class Main {

    private final static Random RANDOM = new Random();

    public static void main(String[] args) {

        // Задача 1.1
        Phonebook phonebook = new Phonebook();
        while (phonebook.getEntries().size() < 20) {
            phonebook.addPhone(getRandomName(), getPhoneNumber());
        }

        for (Map.Entry<FullName, String> entry : phonebook.getEntries()) {
            System.out.printf("%s - %s%n", entry.getKey(), entry.getValue());
        }

        // Задача 2.2
        Map<Integer, String> orderedMap = new LinkedHashMap<>();
        orderedMap.put(5, "rest5");
        orderedMap.put(4, "rest4");
        orderedMap.put(3, "rest3");
        orderedMap.put(6, "rest6");
        orderedMap.put(7, "rest7");
        orderedMap.put(8, "rest8");
        orderedMap.put(1, "rest1");
        orderedMap.put(2, "rest2");
        orderedMap.put(9, "rest9");
        orderedMap.put(10, "rest10");

        for (Map.Entry<Integer, String> entry : orderedMap.entrySet()) {
            System.out.printf("%d:%s%n",entry.getKey(),entry.getValue());
        }

    }

    // Задача 1.1
    public static FullName getRandomName(){
        String name = "Test" + RANDOM.nextInt(1000) + 1;
        String lastName = "Test" + RANDOM.nextInt(1000) + 1;
        return new FullName(name, lastName);
    }

    public static String getPhoneNumber() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 11; i++) {
            stringBuilder.append(RANDOM.nextInt(10) + 1);
        }
        return stringBuilder.toString();
    }
}