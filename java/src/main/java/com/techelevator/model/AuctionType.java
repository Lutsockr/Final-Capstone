package com.techelevator.model;

public class AuctionType {

    private int id;
    private String name;

    public AuctionType() {
    }

    public AuctionType(int id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "AuctionType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
