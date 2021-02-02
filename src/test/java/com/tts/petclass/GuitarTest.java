package com.tts.petclass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuitarTest {

    Guitar simulatedGuitar;
    private static final String TEST_GUITAR_NAME = "TEST GUITAR";
    private static final String TEST_ARG2 = "ESP";
    private static final int TEST_GUITAR_DATE = 60;
    private static final String NEW_TEST_GUITAR_NAME = "WASHBURN";
    private static final String NEW_TEST_ARG2 = "G";
    private static final int NEW_TEST_GUITAR_DATE = 2000;

    @BeforeEach
    void setUp() {
        simulatedGuitar = new Guitar(TEST_GUITAR_NAME, TEST_ARG2, TEST_GUITAR_DATE);
    }

    // Constructor Tests
    @Test
    void constructorEmpty() {
        try {
            new Guitar();
        } catch (Error e) {
            System.out.println("Error making new Guitar with empty constructor: " + e);
            fail();
        }
        Guitar testGuitar = new Guitar();
        assertNotEquals(null, testGuitar);
    }

    @Test
    void constructorTwoArg() {
        String arg1 = "Two Arg Constructor Deck";
        String arg2 = "BWU";
        try {
            new Guitar(arg1, arg2);
        } catch (Error e) {
            System.out.println("Error in 2arg constructor: " + e);
            fail();
        }
        Guitar testGuitar = new Guitar(arg1, arg2);
        assertNotEquals(null, testGuitar);
    }

    @Test
    void constructorFull() {
        String arg1 = "Full Constructor Guitar";
        String arg2 = "ESP";
        int arg3 = 60;
        try {
            new Guitar(arg1, arg2, arg3);
        } catch (Error e) {
            System.out.println("Error in full arg constructor: " + e);
        }
        Guitar testGuitar = new Guitar(arg1, arg2, arg3);
        assertNotEquals(null, testGuitar);
    }

    // Getter Tests
    @Test
    void getName() {
        String testVariable = simulatedGuitar.getName();
        assertEquals(TEST_GUITAR_NAME, testVariable);
    }

    @Test
    void getColors() {
        String testVariable = simulatedGuitar.getColors();
        assertEquals(TEST_ARG2, testVariable);
    }

    @Test
    void getDate() {
        int testVariable = simulatedGuitar.getDate();
        assertEquals(TEST_GUITAR_DATE, testVariable);
    }

    // Setter Tests
    @Test
    void setName() {
        try{
            simulatedGuitar.setName(NEW_TEST_GUITAR_NAME);
        } catch (Error e) {
            System.out.println("Error setting Variable One: "+ e);
        }
        assertEquals(NEW_TEST_GUITAR_NAME, simulatedGuitar.getName());
    }

    @Test
    void setColors() {
        try{
            simulatedGuitar.setColors(NEW_TEST_ARG2);
        } catch (Error e) {
            System.out.println("Error setting Variable Two: "+ e);
        }
        assertEquals(NEW_TEST_ARG2, simulatedGuitar.getColors());
    }

    @Test
    void setDate() {
        try{
            simulatedGuitar.setDate(NEW_TEST_GUITAR_DATE);
        } catch (Error e) {
            System.out.println("Error setting Variable Three: "+ e);
        }
        assertEquals(NEW_TEST_GUITAR_DATE, simulatedGuitar.getDate());
    }

    // Boolean Return Test
    @Test
    void getLegalSize() {
        boolean retrievedBool = false;
        try {
            retrievedBool = simulatedGuitar.getLegalSize();
        } catch (Error e){
            System.out.println("Error assigning Bool: " + e);
            fail();
        }
        assertNotEquals(null,retrievedBool);
    }

    // String Return Test
    @Test
    void returnString() {
        String retrievedString = "";
        try {
            retrievedString = simulatedGuitar.getFullDescription();
        } catch (Error e){
            System.out.println("Error assigning String: " + e);
            fail();
        }
        assertNotEquals(null,retrievedString);
    }
}