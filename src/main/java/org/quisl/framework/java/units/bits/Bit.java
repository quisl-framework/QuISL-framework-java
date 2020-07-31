package org.quisl.framework.java.units.bits;

import java.util.Objects;

public class Bit {

    public static final Integer ZERO_STATE = 0;
    public static final Integer ONE_STATE = 1;

    private Long id;

    private int state;

    private String stateName;


    public Bit(Long id, Integer state, String stateName) {
        this.id = id;
        this.state = state;
        this.stateName = stateName;
    }

    public Bit(Long id, Integer state) {
        this.id = id;
        this.state = state;
        this.stateName = "";
    }

    public Bit(Long id) {
        this.id = id;
        this.state = ZERO_STATE;
        this.stateName = "";
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getState() {
        return this.state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Bit bit = (Bit) o;

        return state == bit.state &&
                Objects.equals(id, bit.id);

    }

    @Override
    public int hashCode() {
        return Objects.hash(id, state);
    }

    @Override
    public String toString() {
        return "Bit{" +
                "id=" + id +
                ", state=" + state +
                '}';
    }
}
