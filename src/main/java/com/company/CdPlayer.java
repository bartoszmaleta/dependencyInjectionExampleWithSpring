package com.company;

public class CdPlayer implements MediaPlayer {

    private CompactDisc cd;

    public CdPlayer() {
        this.cd = new BornToRun();
    }

    @Override
    public void play() {
        this.cd.play();
    }
}
