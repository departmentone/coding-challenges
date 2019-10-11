package com.theone.validation;

import com.theone.validation.contracts.AgeInterface;

import java.time.LocalDate;
import java.time.Period;

public class Age implements AgeInterface {
    LocalDate currentDate;
            
    public Age() {
        this.currentDate = LocalDate.now();
    }
    
    public Age(LocalDate currentDate) {
        this.currentDate = currentDate;
    }
    
    @Override
    public int getAge(LocalDate dateOfBirth) {
        return Period.between(dateOfBirth, this.currentDate).getYears();
    }

    @Override
    public boolean allowedToDrink(LocalDate dateOfBirth) {
        return false;
    }

    @Override
    public boolean allowedToDrinkAtLeast(LocalDate dateOfBirth, DRINKING_AGE_GROUP drinkingAgeGroup) {
        return false;
    }

    @Override
    public DRINKING_AGE_GROUP getDrinkingAgeGroup(LocalDate dateOfBirth) {
        return null;
    }

    @Override
    public AGE_GROUP getAgeGroup(LocalDate birthDate, LocalDate currentDate) {
        return null;
    }
}
