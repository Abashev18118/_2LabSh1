package org.example.animals;
import org.example.animals.*;
public class Main {
    public static void main(String[] args) {
        Participant[] participants = { //участники

                new Cat(5, 250, "Barsik"),

                new Cat(1, 100, "FeliKs"),
                new Cat(7, 900, "Boris"),
                new Human(9, 250, "Sergay"),
                new Human(9, 250, "Jiorno"),
                new Human(9, 250, "Denchik"),
                new Robot(3,400,"Vally")
        };
        Challenge[] challenges = {
                new RunningRoad(RoadLenght.LONG),
                new RunningRoad(RoadLenght.LONG),
                new RunningRoad(RoadLenght.LONG),
                new RunningRoad(RoadLenght.LONG),
                new Wall(Wallheight.HIGH)
        };
//Они должны быть в 1 интерфейсе кот не содержит интерфейс в себе
        for(Participant p: participants) {
            for (Challenge c: challenges) {
                if (!c.isCan(p)) break;
            }
        }
    }
}







