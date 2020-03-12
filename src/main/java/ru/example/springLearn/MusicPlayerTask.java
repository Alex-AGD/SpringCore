package ru.example.springLearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
//@Scope("prototype")
public class MusicPlayerTask {
    private List<Music> musicList = new ArrayList<>();
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
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



