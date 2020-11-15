package ru.chigurov;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class RockMusic implements Music{
    private List sound = new ArrayList();;
    private int random;

    // Блок инициализации объекта (англ. Instance initialization block)
    // Выполняется каждый раз, когда создается объект класса
    {
        sound.add("rock first song");
        sound.add("rock second song");
        sound.add("rock third song");
    }

    @Override
    public List<String> getSong() {
        return sound;
    }
}
