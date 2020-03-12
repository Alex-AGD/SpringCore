package ru.example.springLearn;
import java.util.Random;

//@Component
//@Scope("prototype")
public class MusicPlayerTask {
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
    private TranceMusic tranceMusic;

    public MusicPlayerTask(ClassicalMusic classicalMusic, RockMusic rockMusic, TranceMusic tranceMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
        this.tranceMusic = tranceMusic;
    }

    public void playMusic(MusicGenre genre) {
        Random random = new Random();

        int randomNumber = random.nextInt(3);
        if (genre == MusicGenre.CLASSICAL) {
            System.out.println(classicalMusic.getSong().get(randomNumber));
                System.out.println(tranceMusic.getSong().get(randomNumber));
        } else {
            System.out.println(rockMusic.getSong().get(randomNumber));
        }
    }
}



