package org.quisl.framework.java.math.utils.alphabets;

public enum GreekAlphabetLetter {


    ALPHA_UPPERCASE( (byte) 0x01, 1,
            'Α', "Alpha (Uppercase"),
    ALPHA_LOWERCASE( (byte) 0x02, 1,
            'α', "Alpha (Lowercase"),
    BETA_UPPERCASE( (byte) 0x03, 2,
            'Β', "Beta (Uppercase"),
    BETA_LOWERCASE( (byte) 0x04, 2,
            'β', "Beta (Lowercase"),
    GAMMA_UPPERCASE( (byte) 0x05, 3,
            'Γ', "Gamma (Uppercase"),
    GAMMA_LOWERCASE( (byte) 0x06, 3,
            'γ', "Gamma (Lowercase"),
    DELTA_UPPERCASE( (byte) 0x07, 4,
            'Δ', "Delta (Uppercase"),
    DELTA_LOWERCASE( (byte) 0x08, 4,
            'δ', "Delta (Lowercase"),
    EPSILON_UPPERCASE( (byte) 0x09, 5,
            'Ε', "Epsilon (Uppercase"),
    EPSILON_LOWERCASE( (byte) 0x10, 5,
            'ε', "Epsilon (Lowercase"),
    ZETA_UPPERCASE( (byte) 0x11, 6,
            'Ζ', "Zeta (Uppercase"),
    ZETA_LOWERCASE( (byte) 0x12, 6,
            'ζ', "Zeta (Lowercase"),
    ETA_UPPERCASE( (byte) 0x13, 7,
            'Η', "Eta (Uppercase"),
    ETA_LOWERCASE( (byte) 0x14, 7,
            'η', "Eta (Lowercase"),
    THETA_UPPERCASE( (byte) 0x15, 8,
            'Θ', "Theta (Uppercase"),
    THETA_LOWERCASE( (byte) 0x16, 8,
            'θ', "Theta (Lowercase"),
    IOTA_UPPERCASE( (byte) 0x17, 9,
            'Ι', "Iota (Uppercase"),
    IOTA_LOWERCASE( (byte) 0x18, 9,
            'ι', "Iota (Lowercase"),
    KAPPA_UPPERCASE( (byte) 0x19, 10,
            'Κ', "Kappa (Uppercase"),
    KAPPA_LOWERCASE( (byte) 0x20, 10,
            'κ', "Kappa (Lowercase"),
    LAMBDA_UPPERCASE( (byte) 0x21, 11,
            'Λ', "Lambda (Uppercase"),
    LAMBDA_LOWERCASE( (byte) 0x22, 11,
            'λ', "Lambda (Lowercase"),
    MU_UPPERCASE( (byte) 0x23, 12,
            'Μ', "Mu (Uppercase"),
    MU_LOWERCASE( (byte) 0x24, 12,
            'μ', "Mu (Lowercase"),
    NU_UPPERCASE( (byte) 0x25, 13,
            'Ν', "Nu (Uppercase"),
    NU_LOWERCASE( (byte) 0x26, 13,
            'ν', "Nu (Lowercase"),
    XI_UPPERCASE( (byte) 0x27, 14,
            'Ξ', "Xi (Uppercase"),
    XI_LOWERCASE( (byte) 0x28, 14,
            'ξ', "Xi (Lowercase"),
    OMICRON_UPPERCASE( (byte) 0x29, 15,
            'Ο', "Omicron (Uppercase"),
    OMICRON_LOWERCASE( (byte) 0x30, 15,
            'ο', "Omicron (Lowercase"),
    PI_UPPERCASE( (byte) 0x31, 16,
            'Π', "Pi (Uppercase"),
    PI_LOWERCASE( (byte) 0x32, 16,
            'π', "Pi (Lowercase"),
    RHO_UPPERCASE( (byte) 0x33, 17,
            'Ρ', "Rho (Uppercase"),
    RHO_LOWERCASE( (byte) 0x34, 17,
            'ρ', "Rho (Lowercase"),
    SIGMA_UPPERCASE( (byte) 0x35, 18,
            'Σ', "Sigma (Uppercase"),
    SIGMA_LOWERCASE( (byte) 0x36, 18,
            'σ', "Sigma (Lowercase"),
    TAU_UPPERCASE( (byte) 0x37, 19,
            'Τ', "Tau (Uppercase"),
    TAU_LOWERCASE( (byte) 0x38, 19,
            'τ', "Tau (Lowercase"),
    UPSILON_UPPERCASE( (byte) 0x39, 20,
            'Υ', "Upsilon (Uppercase"),
    UPSILON_LOWERCASE( (byte) 0x40, 20,
            'υ', "Upsilon (Lowercase"),
    PHI_UPPERCASE( (byte) 0x41, 21,
            'Φ', "Phi (Uppercase"),
    PHI_LOWERCASE( (byte) 0x42, 21,
            'φ', "Phi (Lowercase"),
    CHI_UPPERCASE( (byte) 0x43, 22,
            'Χ', "Chi (Uppercase"),
    CHI_LOWERCASE( (byte) 0x44, 22,
            'χ', "Chi (Lowercase"),
    PSI_UPPERCASE( (byte) 0x45, 23,
            'Ψ', "Psi (Uppercase"),
    PSI_LOWERCASE( (byte) 0x46, 23,
            'ψ', "Psi (Lowercase"),
    OMEGA_UPPERCASE( (byte) 0x47, 24,
            'Ω', "Omega (Uppercase"),
    OMEGA_LOWERCASE( (byte) 0x48, 24,
            'ω', "Omega (Lowercase");



    private final byte greekAlphabetCharacterID;

    private final int greekAlphabetCharacterNum;

    private final char greekAlphabetCharacterSymbol;

    private final String greekAlphabetCharacterName;


    GreekAlphabetLetter(byte greekAlphabetCharacterID, int greekAlphabetCharacterNum,
                        char greekAlphabetCharacterSymbol, String greekAlphabetCharacterName) {

        this.greekAlphabetCharacterID = greekAlphabetCharacterID;
        this.greekAlphabetCharacterNum = greekAlphabetCharacterNum;

        this.greekAlphabetCharacterSymbol = greekAlphabetCharacterSymbol;
        this.greekAlphabetCharacterName = greekAlphabetCharacterName;

    }

    public byte getGreekAlphabetCharacterID() {

        return this.greekAlphabetCharacterID;

    }

    public int getGreekAlphabetCharacterNum() {

        return this.greekAlphabetCharacterNum;

    }

    public char getGreekAlphabetCharacterSymbol() {

        return this.greekAlphabetCharacterSymbol;

    }

    public String getGreekAlphabetCharacterName() {

        return this.greekAlphabetCharacterName;

    }

}
