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
        // TODO Implementation required: return the current Age.
        return -1;
    }

    @Override
    public boolean allowedToDrink(LocalDate dateOfBirth, DRINKING_AGE_GROUP drinkingAgeGroup) {
        // TODO Implementation required: return whether allowed to drink
        return false;
    }

    @Override
    public boolean allowedToDrinkMinimum(LocalDate dateOfBirth) {
        // TODO Implementation required: return whether allowed to drink (SOFT_ALCOHOL_WITH_PARENTS)
        return false;
    }

    @Override
    public DRINKING_AGE_GROUP getDrinkingAgeGroup(LocalDate dateOfBirth) {
        // TODO Implementation required; Please remember Test driven development
        return null;
    }
}
