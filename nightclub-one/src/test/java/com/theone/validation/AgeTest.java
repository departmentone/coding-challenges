package com.theone.validation;

import static org.junit.jupiter.api.Assertions.*;

import com.theone.validation.contracts.AgeInterface;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import java.time.LocalDate;

@DisplayName("Age Test")
class AgeTest {
    AgeInterface ageVerifier = null;

    @BeforeEach
    void init() {
        this.ageVerifier = new Age();
    }

    @Test
    void testGetAgeCorrect() {
        LocalDate cDate = LocalDate.of(2019, 10, 11);
        Age ownAgeVerifier = new Age(cDate);

        LocalDate bDate = LocalDate.of(2000, 1, 1);

        int age = ownAgeVerifier.getAge(bDate);

        assertEquals(19, age, "calculated age is wrong");
    }

    @Test
    void testGetAgeWrongBelow() {
        LocalDate cDate = LocalDate.of(2019, 10, 11);
        Age ownAgeVerifier = new Age(cDate);

        LocalDate bDate = LocalDate.of(2001, 1, 1);

        int age = ownAgeVerifier.getAge(bDate);

        assertNotEquals(19, age, "calculated age is wrong");
    }

    @Test
    void testGetAgeWrongAbove() {
        LocalDate cDate = LocalDate.of(2019, 10, 11);
        Age ownAgeVerifier = new Age(cDate);

        LocalDate bDate = LocalDate.of(1999, 1, 1);

        int age = ownAgeVerifier.getAge(bDate);

        assertNotEquals(19, age, "calculated age is wrong");
    }
}
