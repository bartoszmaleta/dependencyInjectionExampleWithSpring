package com.company;

import org.springframework.stereotype.Component;

@Component
public class BornToRun implements CompactDisc {

    private String title = "Born to Run";
    private String artist = "Bruce Springsteen";

    @Override
    public void play() {
        System.out.printf("Playing %s by %s", title, artist);
    }
}
