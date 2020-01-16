package com.company;

public class Fantasy extends Film implements Printable  {
    int fnts = 15;
    String name = "Galaxy";

    public int getFnts() {
        return fnts;
    }

    public void setFnts(int fnts) {
        this.fnts = fnts;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public Fantasy(int fnts, String name) {
        this.fnts = fnts;
        this.name = name;

    }

    @Override
    public void print() {
        System.out.println(getFnts()+getName());
    }
}
