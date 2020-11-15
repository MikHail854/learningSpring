package ru.chigurov;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

public class ClassicalMusic implements Music{
    private List <String> sound = new ArrayList();;

    // Блок инициализации объекта (англ. Instance initialization block)
    // Выполняется каждый раз, когда создается объект класса
    {
        sound.add("classical first song");
        sound.add("classical second song");
        sound.add("classical third song");
    }

    @PostConstruct
    public void doMyInit(){
        System.out.println("Doing my initialization");
    }

    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Doing my destruction");
    }

    @Override
    public List<String> getSong() {
        return sound;
    }

    //    private ClassicalMusic(){
//    }
//
//    public static ClassicalMusic getClassicalMusic(){
//        return new ClassicalMusic();
//    }
//
//    public void doMyInit(){
//        System.out.println("Do my initialization");
//    }
//
//    public void doMyDestroy(){
//        System.out.println("Do my destruction");
//    }


}
