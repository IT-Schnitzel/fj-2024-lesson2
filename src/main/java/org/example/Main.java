package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("Hello world!");

        Cat cat = new Cat("cat");
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File("cat.json"), cat);

    }
}