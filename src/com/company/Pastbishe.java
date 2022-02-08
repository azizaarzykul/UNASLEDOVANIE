package com.company;

public class Pastbishe {
    private String name;
    private String address;
    private String nameChaban;
    private Korova[] korovy;
    private Baran[] koilor;
    private Loshad[] attar;

    public Pastbishe(String name, String address, String nameChaban, Korova[] korovy, Baran[] koilor, Loshad[] attar) {
        this.name = name;
        this.address = address;
        this.nameChaban = nameChaban;
        this.korovy = korovy;
        this.koilor = koilor;
        this.attar = attar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNameChaban() {
        return nameChaban;
    }

    public void setNameChaban(String nameChaban) {
        this.nameChaban = nameChaban;
    }

    public Korova[] getKorovy() {
        return korovy;
    }

    public void setKorovy(Korova[] korovy) {
        this.korovy = korovy;
    }

    public Baran[] getKoilor() {
        return koilor;
    }

    public void setKoilor(Baran[] koilor) {
        this.koilor = koilor;
    }

    public Loshad[] getAttar() {
        return attar;
    }

    public void setAttar(Loshad[] attar) {
        this.attar = attar;
    }
}


