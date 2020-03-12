package ru.example.springLearn;

import java.util.ArrayList;
import java.util.List;

//@Component("musicBeanTrance")
public class TranceMusic implements Music {
    private List<String> songs = new ArrayList<>();

    {
        songs.add("Telescope Extended Mix");
        songs.add("I Love You Extended Mix");
        songs.add("Blue Monday Extended Mix");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }

    @Override
    public List<String> getSong() {
        return songs;
    }
}