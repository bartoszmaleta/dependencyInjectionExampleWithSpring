package com.company;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import static org.junit.Assert.*;

public class CdPlayerTest {

    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();

    @Test
    public void testCdPlayer() {
        MediaPlayer cdPlayer = new CdPlayer();
        cdPlayer.play();
        assertEquals(log.getLog(), "Playing Born to Run by Bruce Springsteen");
    }

}