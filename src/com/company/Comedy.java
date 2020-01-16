package com.company;

public class Comedy extends Film implements Printable  {
    int a= 2;
    String  b ="Hahaha";

    public Comedy(int a, String b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    @Override
    public void print() {
        System.out.println(getA()+getB());
    }
}
