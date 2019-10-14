package com.theone.validation.contracts;

import java.time.LocalDate;

public interface AgeInterface {
    enum DRINKING_AGE_GROUP {       // According to German law
        NO_ALCOHOL,                 // Under 14
        SOFT_ALCOHOL_WITH_PARENTS,  // 14 to 15
        SOFT_ALCOHOL,               // 16 to 17
        HARD_ALCOHOL,               // 18 and over
    }

    public int getAge(LocalDate dateOfBirth);
    public boolean allowedToDrink(LocalDate dateOfBirth, DRINKING_AGE_GROUP drinkingAgeGroup);
    public boolean allowedToDrinkMinimum(LocalDate dateOfBirth);
    public DRINKING_AGE_GROUP getDrinkingAgeGroup(LocalDate dateOfBirth);
}
