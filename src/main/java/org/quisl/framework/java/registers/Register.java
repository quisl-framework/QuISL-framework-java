package org.quisl.framework.java.registers;

import java.util.Objects;

public abstract class Register {

    private Long id;

    private String registerName;

    public Register(Long id, String registerName) {
        this.id = id;
        this.registerName = registerName;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Register register = (Register) o;

        return Objects.equals(this.id, register.id);

    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }
}
