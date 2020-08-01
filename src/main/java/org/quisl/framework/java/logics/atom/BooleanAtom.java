package org.quisl.framework.java.logics.atom;

public class BooleanAtom {

    private String booleanAtomStringRepresentation;

    private Boolean[] booleanClauses;

    private Boolean booleanAtomValue;

    public BooleanAtom(String literals, String booleanAtomStringRepresentation,
                       Boolean [] booleanClauses) {



        this.booleanClauses = booleanClauses;

        this.booleanAtomValue = true;

        for(Boolean booleanClause : booleanClauses) {

            if(!booleanClause) {

                this.booleanAtomValue = false;

                break;

            }

        }

    }

    public Boolean getBooleanAtomValue() {
        return this.booleanAtomValue;
    }

    public void setBooleanAtomValue(Boolean booleanAtomValue) {
        this.booleanAtomValue = booleanAtomValue;
    }
}
