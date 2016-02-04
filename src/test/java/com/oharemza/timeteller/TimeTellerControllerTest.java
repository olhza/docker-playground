package com.oharemza.timeteller;

import org.junit.Before;
import org.junit.Test;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneOffset;

import static org.junit.Assert.assertEquals;


public class TimeTellerControllerTest {

    private Clock clock;
    private TimeTellerController controller;

    @Before
    public void setUp() {
        clock = Clock.fixed(Instant.EPOCH, ZoneOffset.UTC);
        controller = new TimeTellerController(clock);
    }

    @Test
    public void testTell() {
        String now = controller.tell();

        assertEquals("1970-01-01T00:00:00Z", now);
    }

}
