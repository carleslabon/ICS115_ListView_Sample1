package com.example.siremil.eslabon_listview.Model;

public class College {

    private int logo;
    private String college;
    private String year;

    public College(int logo, String college, String year) {
        this.logo = logo;
        this.college = college;
        this.year = year;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

}
