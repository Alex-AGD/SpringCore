package ru.example.springLearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class MusicPlayerMy {
    private Music music;
    private String name;
    private int volume;

    public Music getMusic() {
        return music;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    //IoC
    public MusicPlayerMy(Music music) {
        this.music = music;
    }

    public MusicPlayerMy(){}


    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }

}
