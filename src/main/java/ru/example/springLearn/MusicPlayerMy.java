package ru.example.springLearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class MusicPlayerMy {

    private Music music1;
    private Music music2;

    private String name;
    private int volume;

    public Music getMusic() {
        return music1;
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
        this.music1 = music;
    }

    public Music getMusic1() {
        return music1;
    }

    public void setMusic1(Music music1) {
        this.music1 = music1;
    }

    public Music getMusic2() {
        return music2;
    }

    public void setMusic2(Music music2) {
        this.music2 = music2;
    }

    //IoC
    @Autowired
    public MusicPlayerMy(@Qualifier("musicBeanClassic") Music music) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public MusicPlayerMy(){}


    public void playMusic() {
        System.out.println("Playing: " + music1.getSong());
    }

}
