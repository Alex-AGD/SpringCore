package ru.example.springLearn;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("ru.example.springLearn")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    TranceMusic tranceMusic() {
        return new TranceMusic();
    }

    @Bean
    MusicPlayerMy musicPlayerMy() {
        return new MusicPlayerMy();
    }

    @Bean
    MusicPlayerTask musicPlayerTask() {
        return new MusicPlayerTask(classicalMusic(), rockMusic(), tranceMusic());
    }

    @Bean
    Computer computer() {
        return new Computer(musicPlayerTask());
    }

    @Bean
    ClassicalMusic musicBeanClassic() {
        return new ClassicalMusic();
    }
}
