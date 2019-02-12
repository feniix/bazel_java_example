package com.example;

import com.example.GreetingKT;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

@RunWith(JUnitPlatform.class)
public class GreetingKTUnitTest {

    @Test
    void whenGreetingKTMustReplyGreetingsHumansKT() {

        OutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);
        String output = "greetings humans!!! (from kotlin)" + System.getProperty("line.separator");

        GreetingKT greetkt = new GreetingKT();
        greetkt.GreetingKT();

        assertTrue(output.equals(((ByteArrayOutputStream) os).toString()));

        PrintStream restoreOut = System.out;
        System.setOut(restoreOut);
    }
}
