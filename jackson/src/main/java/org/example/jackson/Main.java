package org.example.jackson;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.javaprop.JavaPropsMapper;
import java.io.IOException;
import java.io.InputStream;

public class Main {

    static class Person {
        public String name;
        public int age;
    }

    public static void main(String[] args) throws IOException {
        Person p1 = readFromJson();
        Person p2 = readFromProperties();
        System.out.println(p1.name + "'s age is " + p1.age);
        System.out.println(p2.name + "'s age is " + p2.age);
    }

    static Person readFromJson() throws IOException {
        InputStream is = ClassLoader.getSystemResourceAsStream("data.json");
        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(is);
        return mapper.convertValue(root.get("data"), Person.class);
    }

    static Person readFromProperties() throws IOException {
        InputStream is = ClassLoader.getSystemResourceAsStream("data.properties");
        JavaPropsMapper mapper = new JavaPropsMapper();
        JsonNode root = mapper.readTree(is);
        return mapper.convertValue(root.get("data"), Person.class);
    }
}
