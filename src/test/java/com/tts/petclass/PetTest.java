package com.tts.petclass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetTest {

    Pet testPet;
    private final String TEST_NAME = "Testy";
    private final int TEST_AGE = 10;
    private final String TEST_LOC = "California";
    private final String TEST_TYPE = "Dog";

    @BeforeEach
    void setUp() {
        testPet = new Pet(TEST_NAME, TEST_AGE, TEST_LOC, TEST_TYPE);
    }

    // Constructor Tests
    @Test
    void constructorEmpty() {
        try {
            new Pet();
        } catch (Error e) {
            System.out.println("Error creating instance of Pet class with empty constructor: " + e);
            fail();
        }
    }

    @Test
    void constructorFull() {
        try {
            new Pet("name", 1, "location", "type");
        } catch (Error e) {
            System.out.println("Error creating instance of Pet class with empty constructor: " + e);
            fail();
        }
    }

    // Getter Tests
    @Test
    void getName() {
        String retrievedName = "";
        // try to use the Getter and assign to a variable
        try {
            retrievedName = testPet.getName();
        } catch (Error e) {
            // error assigning result to string
            System.out.println("Error assigning getName() result to string: " + e);
            fail();
        }
        // Assert that pet name contains any characters
        assertTrue(retrievedName.length() > 0);
        // Assert that retrieved name matches test data
        assertEquals(TEST_NAME, retrievedName);
    }

    @Test
    void getAge() {
        int retrievedAge = -99;

        try {
            retrievedAge = testPet.getAge();
        } catch (Error e) {
            System.out.println("Error assigning getAge() result to int: " + e);
            fail();
        }
        assertEquals(TEST_AGE, retrievedAge);
    }

    @Test
    void getType() {
        String retrievedType = "";
        // try to use the Getter and assign to a variable
        try {
            retrievedType = testPet.getType();
        } catch (Error e) {
            // error assigning result to string
            System.out.println("Error assigning getType() result to string: " + e);
            fail();
        }
        // Assert that pet name contains any characters
        assertTrue(retrievedType.length() > 0);
        // Assert that retrieved name matches test data
        assertEquals(TEST_TYPE, retrievedType);
    }

    // Setter Tests
    @Test
    void setName() {
        String setNameTest = "ThisNameIsOnlyATest";
        testPet.setName(setNameTest);

        String currentName = testPet.getName();
        assertNotEquals(TEST_NAME, currentName);
        assertEquals(setNameTest, currentName);
    }

    @Test
    void setAge() {
        int setAgeTest = 123;
        testPet.setAge(setAgeTest);

        int currentAge = testPet.getAge();
        assertNotEquals(TEST_AGE, currentAge);
        assertEquals(setAgeTest, currentAge);
    }

    @Test
    void setLocation() {
        String setLocationTest = "ThisLocationIsOnlyATest";
        testPet.setLocation(setLocationTest);

        String currentLocation = testPet.getLocation();
        assertNotEquals(TEST_LOC, currentLocation);
        assertEquals(setLocationTest, currentLocation);
    }

    @Test
    void setType() {
        String setTypeTest = "ThisTypeIsOnlyATest";
        try {
            testPet.setType(setTypeTest);
        } catch (Error e) {
            System.out.println("Error setting pet type: " + e);
            fail();
        }
        String currentType = testPet.getType();
        assertNotEquals(TEST_TYPE, currentType);
        assertEquals(setTypeTest, currentType);
    }


}