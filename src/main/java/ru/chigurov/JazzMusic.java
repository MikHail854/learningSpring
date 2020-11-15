package ru.chigurov;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JazzMusic implements Music{
    private List<String> sound = new ArrayList<>();
    {
        sound.add("jazz first song");
        sound.add("jazz second song");
        sound.add("jazz third song");
    }

    @Override
    public List<String> getSong() {
        return sound;
    }
}
