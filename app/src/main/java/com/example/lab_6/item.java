package com.example.lab_6;

public class item {
    String name;
    String email;
    int image;

    public item(String name,String email,int image) {
        this.name =name;
        this.email=email;
        this.image=image;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
