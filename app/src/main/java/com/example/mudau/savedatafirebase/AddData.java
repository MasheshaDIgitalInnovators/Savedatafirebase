package com.example.mudau.savedatafirebase;

/**
 * Created by mudau on 9/29/2017.
 */

public class AddData {

    String name,surname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public AddData(String name, String surname) {

        this.name = name;
        this.surname = surname;
    }
}
