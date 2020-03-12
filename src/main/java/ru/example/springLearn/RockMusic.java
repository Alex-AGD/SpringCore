package ru.example.springLearn;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component("musicBeanRock")

public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Wind Alive";
    }
}
