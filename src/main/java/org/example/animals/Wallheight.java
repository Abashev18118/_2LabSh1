package org.example.animals;

public enum Wallheight {
    SHORT("Маленькая", 2),MIDDLE("Средняя", 5), HIGH("Высокая", 10);
    private String title;
    private  int height;
    Wallheight(String title, int height) {
        this.title = title;
        this.height = height;
    }

    public String getTitle() {
        return title;
    }

    public int getHeight() {
        return height;
    }
}
