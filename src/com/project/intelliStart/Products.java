package com.project.intelliStart;

public record Products(int id, String name, double price) {

    @Override
    public String toString() {
        return "ID=" + id +
                ",\tNAME: " + name +
                ",\tPRICE: " + price;
    }
}
