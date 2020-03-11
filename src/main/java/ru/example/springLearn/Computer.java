package ru.example.springLearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private int id;
    private MusicPlayerTask musicPlayerTask;

    @Autowired
    public Computer(MusicPlayerTask musicPlayerTask) {
        this.id = 1;
        this.musicPlayerTask = musicPlayerTask;
    }

    @Override
    public String toString() {
        return "Computer" + id + " " + musicPlayerTask.playMusicAutowired();

    }
}