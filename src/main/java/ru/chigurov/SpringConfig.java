package ru.chigurov;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan("ru.chigurov")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }

    @Bean
    public JazzMusic jazzMusic(){
        return new JazzMusic();
    }

    @Bean
    public List<Music> genreMusic(){
        List<Music> genre = new ArrayList<>();
        genre.add(classicalMusic());
        genre.add(rockMusic());
        genre.add(jazzMusic());
        return genre;
    }

    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(genreMusic());
    }

    @Bean
    public Computer computer(){
        return new Computer(musicPlayer());
    }

}
