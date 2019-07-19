package com.mobileapps.week05day04fragment.models;

import java.util.ArrayList;

public class Celebrity
{
    private int id;
    private String firstName;
    private String lastName;
    private String category;
    private String bio;
    private String picture;


    public Celebrity() {
    }

    public Celebrity(int id, String firstName, String lastName, String category, String bio, String picture) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.category = category;
        this.bio = bio;
        this.picture = picture;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }


}
