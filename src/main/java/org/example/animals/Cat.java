package org.example.animals;
public class Cat implements Participant, superRun {
    public boolean superRunCount1 = true;
    private int maxHeight;
    private int maxLenght;
    private String name;

    public Cat(int maxHeight, int maxLenght, String name) {
        this.maxHeight = maxHeight;
        this.maxLenght = maxLenght;
        this.name = name;
    }
    @Override
    public boolean run(int dist) {
        if (dist <= maxLenght) {
            System.out.println("Кот " + this.name + " пробежал " + dist + "м");
            return true;
        } else if (superRunCount1) {
            boolean result = superRun(this.name);
            if (result) {
                superRunCount1 = false; // Устанавливаем superRunCount в false после использования
            }
            return result;
        } else {
            System.out.println("Кот " + this.name + " не смог пробежать " + dist + "м и выбывает");
            return false;
        }
    }
    @Override
    public boolean jump(int height) {
        if (height <= maxHeight) {
            System.out.println("Кот " + this.name + " перепрыгнул " + height + "м");
            return true;
        } else {
            System.out.println("Кот " + this.name + " не смог перепрыгнуть " + height + "м и выбывает");
            return false;
        }
    }
}