package info.gucchi.sample;

import java.util.Map;

public class Properties {
    public static void main(String[] args) {
        System.out.println("java.version: " + System.getProperty("java.version"));
        var text = "hello";
        System.out.println(text);
	System.out.println(System.getProperty("text"));
    }
}
