package edu.iu.habahram.databsedemo.model;

public enum Occasion {
    MOTHERS_DAY("Mother's Day"),
    BIRTHDAY("Birthday"),
    THANK_YOU("Thank You");

    private final String label;

    Occasion(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return label;
    }
}
