package edu.iu.habahram.databsedemo.model;

public enum Status {
    SUBMITTED("Submitted"),
    PENDING("Pending"),
    SHIPPED("Shipped"),
    DELIVERED("Delivered");

    private final String label;

    Status(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return label;
    }
}
