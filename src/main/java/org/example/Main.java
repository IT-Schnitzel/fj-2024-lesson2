package org.example;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");

        //Cat cat = new Cat("cat");
        //ObjectMapper objectMapper = new ObjectMapper();
        //objectMapper.writeValue(new File("cat.json"), cat);

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            City city = objectMapper.readValue(new File("city.json"), City.class);
            System.out.println(city);
        } catch (IOException e) {
            System.out.println("exept");
            throw new RuntimeException(e);
        }

        try {
            ObjectMapper objectMapper2 = new ObjectMapper();
            City city2 = objectMapper2.readValue(new File("city-error.json"), City.class);
            System.out.println(city2);
        } catch (Exception e) {
            System.out.println("exepted test 2");
            //throw new RuntimeException(e);
        }

    }
}