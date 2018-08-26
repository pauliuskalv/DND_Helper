package com.dnd_fan.dnd_program.model;

public class Character implements Comparable<Character> {
    private int mCharacterId;

    private String mName;
    private String mClass;
    private String mSubclass;

    private int mLevel;
    private int mCopperCount;
    private int mSilverCount;
    private int mGoldCount;
    private int mPlatinumCount;

    private int mStrength;
    private int mIntelligence;
    private int mDexterity;
    private int mConstitution;
    private int mWisdom;
    private int mCharisma;

    public Character(
            int mCharacterId,
            String mName,
            String mClass,
            String mSubclass,
            int mLevel,
            int mCopperCount,
            int mSilverCount,
            int mGoldCount,
            int mPlatinumCount,
            int mStrength,
            int mIntelligence,
            int mDexterity,
            int mConstitution,
            int mWisdom,
            int mCharisma
    ) {
        this.mCharacterId = mCharacterId;
        this.mName = mName;
        this.mClass = mClass;
        this.mSubclass = mSubclass;
        this.mLevel = mLevel;
        this.mCopperCount = mCopperCount;
        this.mSilverCount = mSilverCount;
        this.mGoldCount = mGoldCount;
        this.mPlatinumCount = mPlatinumCount;
        this.mStrength = mStrength;
        this.mIntelligence = mIntelligence;
        this.mDexterity = mDexterity;
        this.mConstitution = mConstitution;
        this.mWisdom = mWisdom;
        this.mCharisma = mCharisma;
    }

    public int getCharacterId() {
        return mCharacterId;
    }

    public String getCharacterName() {
        return mName;
    }

    public String getCharacterClass() {
        return mClass;
    }

    public String getCharacterSubclass() {
        return mSubclass;
    }

    public int getCharacterLevel() {
        return mLevel;
    }

    public int getCharacterCopperCount() {
        return mCopperCount;
    }

    public int getCharacterSilverCount() {
        return mSilverCount;
    }

    public int getCharacterGoldCount() {
        return mGoldCount;
    }

    public int getCharacterPlatinumCount() {
        return mPlatinumCount;
    }

    public int getStrength() {
        return mStrength;
    }

    public int getIntelligence() {
        return mIntelligence;
    }

    public int getDexterity() {
        return mDexterity;
    }

    public int getConstitution() {
        return mConstitution;
    }

    public int getWisdom() {
        return mWisdom;
    }

    public int getCharisma() {
        return mCharisma;
    }

    public int compareTo(Character character) {
        return this.mName.compareTo(character.getCharacterName());
    }
}
