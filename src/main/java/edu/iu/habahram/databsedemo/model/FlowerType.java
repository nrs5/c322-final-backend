package edu.iu.habahram.databsedemo.model;

public enum FlowerType {
    MIXED("Mixed"),
    ROSES("Roses"),
    LILIES("Lilies"),
    TULIPS("Tulips"),
    DAISIES("Daisies");

    private final String label;

    FlowerType(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return label;
    }
}

