package com.example;

import java.util.List;

public class LionAlex extends Lion {

    private final List<String> friends = List.of("Зебра Марти", "Бегемотиха Глория", "Жираф Мелман");
    private final String placeOfLiving = "Нью-Йоркский зоопарк";

    public LionAlex() throws Exception {
        super("Самец");
    }

    public List<String> getFriends() {
        return friends;
    }

    public String getPlaceOfLiving() {
        return placeOfLiving;
    }

    @Override
    public int getKittens() {
        return 0;
    }
}