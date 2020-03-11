package ru.example.springLearn;

import org.springframework.stereotype.Component;

@Component("musicBeanRock")
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Wind Alive";
    }
}
