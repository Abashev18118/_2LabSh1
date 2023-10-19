package org.example.animals;
import org.example.animals.*;
public class Main {
    public static void main(String[] args) {

        Participant[] participants = { //участники
                new Human(9, 550, "Sergay"),
                new Cat(7, 900, "Boris",1),
                new Cat(1, 100, "FeliKs",1),
                new Robot(3,400,"Vally"),
                new Cat(5, 250, "Barsik",1)
        };
        Challenge[] challenges = {
                new RunningRoad(RoadLenght.LONG),
                new Wall(Wallheight.HIGH)
        };

        for(Participant p: participants) {
            for (Challenge c: challenges) {
                if (!c.isCan(p)) break;
            }
        }
    }
}







