package com.example;

import com.example.Greeting;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

@RunWith(JUnitPlatform.class)
public class GreetingUnitTest {

    @Test
    void whenGreetingMustReplyGreetingsHumans() {

        OutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);
        String output = new String("greetings humans!" + System.getProperty("line.separator"));

        Greeting greet = new Greeting();
        greet.Greeting();

        assertTrue(output.equals(((ByteArrayOutputStream) os).toString()));

        PrintStream restoreOut = System.out;
        System.setOut(restoreOut);
    }
}
