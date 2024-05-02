package edu.iu.habahram.databsedemo.model;

import jakarta.persistence.*;

@Entity
@Table(schema = "flowers", name = "flowers")
public class Flower {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private float cost;
    @Enumerated(EnumType.STRING)
    private FlowerType type;
    @Enumerated(EnumType.STRING)
    private Occasion occasion;
    @Enumerated(EnumType.STRING)
    private Color color;

    public Flower() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public FlowerType getType() {
        return type;
    }

    public void setType(FlowerType type) {
        this.type = type;
    }

    public Occasion getOccasion() {
        return occasion;
    }

    public void setOccasion(Occasion occasion) {
        this.occasion = occasion;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}

