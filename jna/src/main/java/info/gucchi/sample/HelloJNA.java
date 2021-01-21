package info.gucchi.sample;

import com.sun.jna.Library;
import com.sun.jna.Native;

public class HelloJNA {
    public interface CLibrary extends Library {
        CLibrary INSTANCE = (CLibrary) Native.load("jna", CLibrary.class);

        void say(String str);
        int func(int a, int b);
    }

    public static void main(String[] args) throws InterruptedException {
        String libdir = System.getProperty("user.dir") + "/src/main/c/build";
        System.setProperty("jna.library.path", libdir);
        System.out.println("libdir: " + libdir);
        CLibrary.INSTANCE.say("hello");
        CLibrary.INSTANCE.func(3, 4);
        System.out.println("finish");
    }
}
