package ru.example.springLearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayerTask {
    private List<Music> musicList = new ArrayList<>();
    private String name;
    private int volume;
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayerTask(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public List<Music> getMusicList() {
        return musicList;
    }


    @Autowired
    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
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


    public void playMusicMy() {
        for (Music music : musicList
        ) {
            System.out.println("Playing: " + music.getSong());
        }
    }

    public String playMusicAutowired() {
        return "Playing: " + rockMusic.getSong() + " " + classicalMusic.getSong();

        //System.out.println("Playing: " + rockMusic.getSong());

    }
}



