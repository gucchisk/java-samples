package info.gucchi.sample;

import java.util.Map;

public class Properties {
    public static void main(String[] args) {
        System.out.println("jdk.version: " + System.getProperty("jdk.version"));
        System.out.println("java.version: " + System.getProperty("java.version"));
        String text = "hello";
        System.out.println(text);
        System.out.println(System.getProperty("text"));
    }
}
