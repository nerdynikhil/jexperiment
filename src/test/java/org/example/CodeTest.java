package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CodeTest {
    @Test
    public void testSayHello(){
        Code code = new Code();
        assertEquals("Hello world!", code.sayHello());
    }
}
