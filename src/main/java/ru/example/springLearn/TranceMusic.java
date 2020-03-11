package ru.example.springLearn;

import org.springframework.stereotype.Component;

@Component("musicBeanTrance")
public class TranceMusic implements Music {
    @Override
    public String getSong() {
        return "Apollyon (Original Mix)";
    }
}
