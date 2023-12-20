package org.example.animals;
public class Human implements Participant, superRun {
    private int maxHeight;
    private int maxLenght;
    public static int superRunCount = 2;
    private String name;

    public Human(int maxHeight, int maxLenght, String name) {
        this.maxHeight = maxHeight;
        this.maxLenght = maxLenght;
        this.name = name;
    }
    @Override
    public boolean run(int dist) {
        if (dist <= maxLenght) {
            System.out.println(this.name + " пробежал " + dist + " м");
            return true;
        } else if (superRunCount > 0) {
            boolean result = superRun(this.name);
            if (superRunCount > 0) {
                superRunCount--;
            }
            return result;
        } else {
            System.out.println(this.name + " не смог пробежать " + dist + " м и выбывает");
            return false;
        }
    }
    @Override
    public boolean jump(int height) {
        if (height <= maxHeight) {
            System.out.println(this.name + " перепрыгнул " + height + " м");
            return true;
        } else {
            System.out.println(this.name + " не смог перепрыгнуть " + height + " м и выбывает");
            return false;
        }
    }
}