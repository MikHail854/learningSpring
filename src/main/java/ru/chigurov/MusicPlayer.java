package ru.chigurov;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static ru.chigurov.EnumMusic.CLASSICAL;
import static ru.chigurov.EnumMusic.ROCK;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
    private JazzMusic jazzMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic, JazzMusic jazzMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
        this.jazzMusic = jazzMusic;
    }


    public String playMusic(EnumMusic enumMusic){
        Random random = new Random();

        // случайное целое число между 0 и 2
        int randomNumber = random.nextInt(3);

        switch (enumMusic){
            case CLASSICAL:
                return "Playing: " + classicalMusic.getSong().get(randomNumber);
            case ROCK:
                return "Playing: " + rockMusic.getSong().get(randomNumber);
            case JAZZ:
                return "Playing: " + jazzMusic.getSong().get(randomNumber);
            default:
                return "Playing: no music";
        }

    }

    /*private List<Music> musicList = new ArrayList<>();
    private String name;

    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public MusicPlayer(){

    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic(){
        for (Music music: musicList){
            System.out.println("Playing: " + music.getSong());
        }
//        System.out.println("Playing: " + music.getSong());
    }*/
}
