package net.northmo.dsmcnary.installerassistant;

import org.junit.Test;

/**
 * Created by Daniel McNary on 11/27/2016.
 */

public class getTowerTest {

    int pre1;
    @Test
    public void getTowerTest() throws Exception {
        tower t;
        assertNotEquals(t, DBHandler::getTower(1));
    }
}