package net.northmo.dsmcnary.installerassistant;

import org.junit.Test;

/**
 * Created by Daniel McNary on 11/27/2016.
 */

public class getTowerCountTest {
    @Test
    public void getTowerCountTest() throws Exception {

        assertNotEquals(-1, DBHandler::getTowerCount());
    }
}}
