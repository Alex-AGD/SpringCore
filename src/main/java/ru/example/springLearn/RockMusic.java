package ru.example.springLearn;

import java.util.ArrayList;
import java.util.List;

//@Component("musicBeanRock")
public class RockMusic implements Music {
    private List<String> songs = new ArrayList<>();
        {
            songs.add("Wind cries Mary");
            songs.add("Paint it black");
            songs.add("Can't seem to make you mine");
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