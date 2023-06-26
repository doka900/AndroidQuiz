package com.example.androidquiz.model;

public class Friend {

    int image;
    String name;
    String rang;
    String zvezde;

    public Friend(int image, String name, String rang, String zvezde) {
        this.image = image;
        this.name = name;
        this.rang = rang;
        this.zvezde = zvezde;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRang() {
        return rang;
    }

    public void setRang(String rang) {
        this.rang = rang;
    }

    public String getZvezde() {
        return zvezde;
    }

    public void setZvezde(String zvezde) {
        this.zvezde = zvezde;
    }
}
