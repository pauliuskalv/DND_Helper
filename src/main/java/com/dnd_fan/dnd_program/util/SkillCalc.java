package com.dnd_fan.dnd_program.util;

public class SkillCalc {
    public static int calculateBonus(int parentValue) {
        return (parentValue - 10) / 2;
    }

    public static int calculateSkillBonus(int parentValue, boolean proficiency) {
        return calculateBonus(parentValue) * (proficiency ? 2 : 1);
    }
}
