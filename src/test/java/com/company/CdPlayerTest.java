package com.company;

import junit.framework.TestCase;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CdPlayerConfig.class)
public class CdPlayerTest extends TestCase {

    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();

    @Autowired
    private MediaPlayer cdPlayer; // Spring will create an instance of CdPlayer

    @Test
    public void testCdPlayerWithSpring() {
        cdPlayer.play();
        assertEquals(log.getLog(), "Playing Born to Run by Bruce Springsteen");
    }


    // Ignore because change to dependency injection by Spring
//    @Ignore
//    @Test
//    public void testCdPlayer() {
//        MediaPlayer cdPlayer = new CdPlayer();
//        cdPlayer.play();
//        assertEquals(log.getLog(), "Playing Born to Run by Bruce Springsteen");
//    }

}