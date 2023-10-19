package org.example.animals;

public enum RoadLenght {
    SHORT("Короткая дистанция", 100), MIDDLE("Средняя дистанция", 300), LONG("Длинная дистанция", 560);
    private String title;
    private  int lenght;
    RoadLenght(String title, int lenght) {
        this.title = title;
        this.lenght = lenght;
    }

    public String getTitle() {
        return title;
    }

    public int getLenght() {
        return lenght;
    }
}
