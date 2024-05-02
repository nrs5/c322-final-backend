package edu.iu.habahram.databsedemo.model;

public enum Color {
    MIXED("Mixed"),
    RED("Red"),
    YELLOW("Yellow"),
    GREEN("Green"),
    ORANGE("Orange");

    private final String label;

    Color(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return label;
    }
}
