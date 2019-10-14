package com.theone.validation;

import static org.junit.jupiter.api.Assertions.*;

import com.theone.validation.contracts.AgeInterface;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import java.time.LocalDate;

@DisplayName("Age Test")
class AgeTest {
    @Test
    void testAllowedToDrink() {
        LocalDate cDate = LocalDate.of(2019, 10, 11);
        Age ownAgeVerifier = new Age(cDate);

        LocalDate bDate = LocalDate.of(2002, 1, 1);
        assertTrue(ownAgeVerifier.allowedToDrink(bDate, AgeInterface.DRINKING_AGE_GROUP.SOFT_ALCOHOL), "allowed to drink");
        bDate = LocalDate.of(2000, 1, 1);
        assertTrue(ownAgeVerifier.allowedToDrink(bDate, AgeInterface.DRINKING_AGE_GROUP.SOFT_ALCOHOL), "allowed to drink");
        bDate = LocalDate.of(2005, 1, 1);
        assertFalse(ownAgeVerifier.allowedToDrink(bDate, AgeInterface.DRINKING_AGE_GROUP.SOFT_ALCOHOL), "not allowed to drink");
    }
}
