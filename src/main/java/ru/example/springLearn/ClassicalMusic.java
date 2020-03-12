package ru.example.springLearn;

import java.util.ArrayList;
import java.util.List;

//@Component("musicBeanClassic")
//@Scope("prototype")
public class ClassicalMusic implements Music {
    private List<String> songs = new ArrayList<>();

    {
        songs.add("Hungarian Rhapsody");
        songs.add("Symphony no. 5 in C Minor, op. 67");
        songs.add("Night on Bald Mountain");
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

