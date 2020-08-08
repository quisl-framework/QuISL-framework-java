package org.quisl.framework.java.registers;

import java.util.Objects;

public abstract class Register {

    private Long id;

    private Character prefix;

    private String registerName;

    private Integer registerSize;


    public Register(Long id, Character prefix, String registerName, Integer registerSize) {

        this.id = id;

        this.prefix = prefix;

        this.registerName = registerName;

        this.registerSize = registerSize;

    }


    public Long getId() {

        return this.id;

    }

    public void setId(Long id) {
        this.id = id;
    }

    public Character getPrefix() {
        return this.prefix;
    }

    public void setPrefix(Character prefix) {
        this.prefix = prefix;
    }

    public String getRegisterName() {

        return this.registerName;

    }

    public void setRegisterName(String registerName) {

        this.registerName = registerName;

    }

    public Integer getRegisterSize() {

        return this.registerSize;

    }

    public void setRegisterSize(Integer registerSize) {

        this.registerSize = registerSize;

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
