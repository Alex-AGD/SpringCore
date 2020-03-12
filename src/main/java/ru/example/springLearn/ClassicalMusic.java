package ru.example.springLearn;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("musicBeanClassic")
@Scope("prototype")
public class ClassicalMusic implements Music {
    private ClassicalMusic() {
    }

    public static ClassicalMusic getClassicalMusic() {  //new obj from method
        return new ClassicalMusic();
    }

    //@PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    //@PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
