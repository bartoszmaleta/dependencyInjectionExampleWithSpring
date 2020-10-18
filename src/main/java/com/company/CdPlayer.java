package com.company;

public class CdPlayer implements MediaPlayer {

    private CompactDisc cd;

    @Override
    public void play() {
        this.cd.play();
    }
}
