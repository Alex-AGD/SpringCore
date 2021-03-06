package ru.example.springLearn;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.annotation.Annotation;


public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);


        //ClassPath ислз из depend spring-context pom.xml
/*        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                //name нашего конф файла resources
                "applicationContext.xml"
        );*



 /*       TestBean testBean = context.getBean("testBean", TestBean.class);
        System.out.println(testBean.getName());
        //обязательно нужно закрыть вконце после раб с ClassPathXmlApplicationContext
        //context.close();

        Music music = context.getBean("musicBeanClassic", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music); //OiC
        musicPlayer.playMusic();
        //context.close();


        Music musicRock = context.getBean("musicBeanRock", Music.class);
        MusicPlayer musicPlayerTwo = new MusicPlayer(musicRock); //OiC
        musicPlayerTwo.playMusic();
        //context.close();


        //dependency injection
        MusicPlayer musicPlayer1 = context.getBean("musicPlayerClassic", MusicPlayer.class);
        musicPlayer1.setVolume(99);
        musicPlayer1.playMusic();
        System.out.println(musicPlayer1.getVolume());

        MusicPlayer musicPlayer5 = context.getBean("musicPlayerClassic", MusicPlayer.class);
        musicPlayer5.setVolume(22);
        System.out.println(musicPlayer5.getVolume());

        MusicPlayer musicPlayer2 = context.getBean("musicPlayerRock", MusicPlayer.class);
        musicPlayer2.playMusic();
        //context.close();
        boolean comparison = musicPlayer1 == musicPlayer5;
        System.out.println(comparison);

        //dependency injection with setter/getter
        MusicPlayer musicPlayer3 = context.getBean("musicPlayerClassicSetter", MusicPlayer.class);
        musicPlayer3.playMusic();

        System.out.println(musicPlayer3.getName());
        System.out.println(musicPlayer3.getVolume());
        //context.close();

        //dependency injection with setter/getter from musicPlayer.properties
        MusicPlayer musicPlayer4 = context.getBean("musicPlayerClassicSetterFromProperties", MusicPlayer.class);
        musicPlayer4.playMusic();
        System.out.println(musicPlayer4.getName());
        System.out.println(musicPlayer4.getVolume());

        //Home task (list playMusic)
        MusicPlayerTask musicPlayerTask = context.getBean("musicPlayerTask", MusicPlayerTask.class);
        musicPlayerTask.playMusicMy();
        //context.close();


        //default singleton without scope
        ClassicalMusic classicalMusic = context.getBean("musicBeanClassic", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());


        Music music1 = context.getBean("musicBeanTrance", Music.class);
        MusicPlayer musicPlayer6 = new MusicPlayer(music1);
        musicPlayer6.playMusic();*/


        MusicPlayerTask musicPlayerTask1 = context.getBean("musicPlayerTask",MusicPlayerTask.class);
        //musicPlayerTask1.playMusicMy();
        musicPlayerTask1.playMusic(MusicGenre.CLASSICAL);
        musicPlayerTask1.playMusic(MusicGenre.ROCK);
        musicPlayerTask1.playMusic(MusicGenre.TRANCE);

/*
        ClassicalMusic classicalMusic1 = context.getBean("musicBeanClassic", ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = context.getBean("musicBeanClassic", ClassicalMusic.class);

        System.out.println(classicalMusic1 == classicalMusic2);*/


/*        Computer computer = context.getBean("computer",Computer.class);
        System.out.println(computer);*/

    }
}
