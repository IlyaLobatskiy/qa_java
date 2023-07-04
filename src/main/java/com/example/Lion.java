package com.example;

import java.util.List;

public class Lion {
    protected Feline feline;
    protected String sex;


    public Lion(Feline feline, String sex) {
        this.feline = feline;
        this.sex = sex;
    }

    public int getKittens() {
        return feline.getKittens();
    }

    public boolean doesHaveMane() throws Exception {
        if ("Самец".equals(sex)) {
            return true;
        } else if ("Самка".equals(sex)) {
            return false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }

    public List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }
}