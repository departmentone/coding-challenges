package com.theone.validation.contracts;

import java.time.LocalDate;

public interface AgeInterface {
    enum AGE_GROUP {
        INFANT,             // Age 0
        TODDLER,            // Age 1-2
        CHILD,              // Age 4-8
        PREADOLESCENCE,     // Age 9-13
        ADOLESCENCE,        // Age 14-17
        ADULT,              // Age 18->
    }

    enum DRINKING_AGE_GROUP {       // According to German law
        NO_ALCOHOL,                 // Under 14
        SOFT_ALCOHOL_WITH_PARENTS,  // 14 to 15
        SOFT_ALCOHOL,               // 16 to 17
        HARD_ALCOHOL,               // 18 and over
    }

    public int getAge(LocalDate dateOfBirth);
    public boolean allowedToDrink(LocalDate dateOfBirth);
    public boolean allowedToDrinkAtLeast(LocalDate dateOfBirth, DRINKING_AGE_GROUP drinkingAgeGroup);
    public DRINKING_AGE_GROUP getDrinkingAgeGroup(LocalDate dateOfBirth);
    public AGE_GROUP getAgeGroup(LocalDate birthDate, LocalDate currentDate);
}
