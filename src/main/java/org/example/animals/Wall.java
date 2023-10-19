package org.example.animals;

public class Wall implements Challenge{
    private int wallHeight;
    public Wall(Wallheight wallHeight) {
        this.height = wallHeight.getHeight();
        this.title = wallHeight.getTitle();

    }
    int height;
    String title;
    @Override
    public boolean isCan(Participant participant) {
        if (participant.jump(height)) {
            return true;
        }
        else return false;
    }
}
