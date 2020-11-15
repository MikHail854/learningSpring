package ru.chigurov;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static ru.chigurov.EnumMusic.CLASSICAL;
import static ru.chigurov.EnumMusic.ROCK;

public class MusicPlayer {

    private List<Music> genre;


    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }



    public MusicPlayer(List<Music> genre) {
        this.genre = genre;
    }


    public String playMusic() {
        Random random = new Random();

        // случайное целое число между 0 и 2
        int randomNumber = random.nextInt(3);
        int randomNumb = random.nextInt(3);

        return "Playing: " + genre.get(randomNumber).getSong().get(randomNumb);
    }

/*
        switch (enumMusic){
            case CLASSICAL:
                return "Playing: " + genre.get(0).getSong().get(randomNumber);
            case ROCK:
                return "Playing: " + genre.get(1).getSong().get(randomNumber);
            case JAZZ:
                return "Playing: " + genre.get(2).getSong().get(randomNumber);
            default:
                return "Playing: no music";
        }
*/


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
