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


        MusicPlayerTask musicPlayerTask = context.getBean("musicPlayerTask",MusicPlayerTask.class);
        musicPlayerTask.playMusicMy();
        context.close();
    }
}
