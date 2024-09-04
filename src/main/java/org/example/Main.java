package org.example;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;

public class Main {

    private  static Logger logger= LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) throws IOException {
        logger.info("App start");
        System.out.println("Hello world!");

        //Cat cat = new Cat("cat");
        //ObjectMapper objectMapper = new ObjectMapper();
        //objectMapper.writeValue(new File("cat.json"), cat);

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            City city = objectMapper.readValue(new File("city.json"), City.class);
            System.out.println(city);
            logger.debug("Try change coords");
            XmlMapper xmlMapper = new XmlMapper();
            xmlMapper.writeValue(new File("city.xml"), city);
            File file = new File("city.xml");
            logger.info("Created XML");
        } catch (IOException e) {
            System.out.println("exept");
            //throw new RuntimeException(e);
        }
        logger.warn("Wrong data");
        try {
            ObjectMapper objectMapper2 = new ObjectMapper();
            City city2 = objectMapper2.readValue(new File("city-error.json"), City.class);
            System.out.println(city2);
        } catch (Exception e) {
            logger.error("Error during second test");
            System.out.println("exepted test 2");
            //throw new RuntimeException(e);
        }
        logger.info("App finished");
    }
}