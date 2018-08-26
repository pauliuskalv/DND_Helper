package com.dnd_fan.dnd_program.model;

public class ClassSavingThrows {
    private boolean mStrengthThrow;
    private boolean mDexterityThrow;
    private boolean mConstitutionThrow;
    private boolean mIntelligenceThrow;
    private boolean mWisdomThrow;
    private boolean mCharismaThrow;

    public ClassSavingThrows(
            boolean mStrengthThrow,
            boolean mDexterityThrow,
            boolean mConstitutionThrow,
            boolean mIntelligenceThrow,
            boolean mWisdomThrow,
            boolean mCharismaThrow
    ) {
        this.mStrengthThrow = mStrengthThrow;
        this.mDexterityThrow = mDexterityThrow;
        this.mConstitutionThrow = mConstitutionThrow;
        this.mIntelligenceThrow = mIntelligenceThrow;
        this.mWisdomThrow = mWisdomThrow;
        this.mCharismaThrow = mCharismaThrow;
    }

    public boolean isStrengthThrow() {
        return mStrengthThrow;
    }

    public boolean isDexterityThrow() {
        return mDexterityThrow;
    }

    public boolean isConstitutionThrow() {
        return mConstitutionThrow;
    }

    public boolean isIntelligenceThrow() {
        return mIntelligenceThrow;
    }

    public boolean isWisdomThrow() {
        return mWisdomThrow;
    }

    public boolean isCharismaThrow() {
        return mCharismaThrow;
    }
}
