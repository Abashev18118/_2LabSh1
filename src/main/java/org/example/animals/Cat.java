package org.example.animals;
public class Cat implements Participant,superRun {
     int superRunCount;
    int maxHeight;
    int maxLenght;
    String name;


    public Cat(int maxHeight, int maxLenght, String name,int superRunCount) {
        this.maxHeight = maxHeight;
        this.maxLenght = maxLenght;
        this.name = name;
        this.superRunCount=superRunCount;

    }

    @Override
    public boolean run(int dist) {
        if (dist <= maxLenght) {
            System.out.println("Кот " +this.name + " пробежал " + dist + "м");
            return true;
        }

        else if (superRunCount > 0) {
            return superRun();
        }
        else {System.out.println("Кот " +this.name + " не смог пробежать " + dist + "м и выбывает");
            return false;
        }

    }
    @Override
    public boolean jump(int height) {
        if (height<= maxHeight) {
            System.out.println("Кот "+ this.name+ " перепрыгнул " + height  +"м");
            return true;
        }

        else {
            System.out.println("Кот "+ this.name+ " не смог перепрыгнуть " + height  +"м и выбывает");
            return false;
        }
    }
    public boolean superRun() {
        System.out.println("Кот " + this.name+ " пробежал с экстра");
        superRunCount--;
        return true;

    }

}