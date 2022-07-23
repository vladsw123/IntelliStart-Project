package com.project.intelliStart;


public class Users {

    private final int id;
    private final String first_name;
    private final String last_name;
    private double amount_of_money;

    public Users(int id, String first_name, String last_name, double amount_of_money) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.amount_of_money = amount_of_money;
    }

    @Override
    public String toString() {
        return "ID=" + id +
                ",\tNAME: " + first_name +
                ",\tSURNAME: " + last_name +
                ",\tMONEY: " + amount_of_money + "\n";
    }

    public void setAmount_of_money(double price) {
        amount_of_money -= price;
    }
}
