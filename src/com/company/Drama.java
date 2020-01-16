package com.company;

public class Drama extends Film implements Printable {
    int dr = 20;
    String drm = "Melodrama";

    public Drama(int dr, String drm) {
        this.dr = dr;
        this.drm = drm;
    }

    public int getDr() {
        return dr;
    }

    public void setDr(int dr) {
        this.dr = dr;
    }

    public String getDrm() {
        return drm;
    }

    public void setDrm(String drm) {
        this.drm = drm;
    }

@Override
    public void print() {
        System.out.println(getDr()+getDrm());
    }
}
