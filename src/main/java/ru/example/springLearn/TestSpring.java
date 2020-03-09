package ru.example.springLearn;

import com.sun.org.apache.bcel.internal.util.ClassPath;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        //ClassPath ислз из depend spring-context pom.xml
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                //name нашего конф файла resources
                "applicationContext.xml"
        );
        TestBean testBean = context.getBean("testBean", TestBean.class);
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
        musicPlayer1.playMusic();

        MusicPlayer musicPlayer2 = context.getBean("musicPlayerRock", MusicPlayer.class);
        musicPlayer2.playMusic();
        context.close();


    }
}
