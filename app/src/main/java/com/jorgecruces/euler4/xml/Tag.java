package com.jorgecruces.euler4.xml;

public class Tag {

    private final String name;
    private final String value;
    private final String attribute;

    public Tag(String name, String value) {
        this(name,value,null);
    }

    public Tag(String name, String value, String attribute) {
        this.name = name;
        this.value = value;
        this.attribute = attribute;
    }


    @Override
    public String toString() {
        return value;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    public String getAttribute() {
        return attribute;

    }
}

