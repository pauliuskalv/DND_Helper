package com.dnd_fan.dnd_program.model;

public class Proficiency {
    private String mName;
    private String mType;

    public Proficiency(String mName, String mType) {
        this.mName = mName;
        this.mType = mType;
    }

    public String getProfName() {
        return mName;
    }

    public String getProfType() {
        return mType;
    }
}
