package ru.example.springLearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class MusicPlayer {
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
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer(){}


    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }

}
