package com.company;

public class Main {

    public static void main(String[] args) {
        createObject("Comedy").print();
        System.out.println("________________");
        createObject("Drama").print();
        System.out.println("________________");
        createObject("Fantasy").print();
        System.out.println("________________");


    }
    public static Printable createObject(String className) {
        Printable printable = null;
        switch (className) {
            case "Comedy":
                printable = new Comedy(2, "   American_Boy");
                break;

            case "Drama":
             printable  = new Drama(20, "  Melodrama -1+1");
             break;

            case "Fantasy":
                printable = new Fantasy(15, "  Avatar");
                break;
        }
        return printable;
}
}

