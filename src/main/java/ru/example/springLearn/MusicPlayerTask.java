package ru.example.springLearn;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayerTask {
    private List<Music> musicList = new ArrayList<>();
    private String name;
    private int volume;


    public List<Music> getMusicList() {
        return musicList;
    }

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

}



