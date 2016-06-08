package br.com.zup.testedesenvolvedor1;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ze12augusto
 */
public class DirectionTest {
    
    @Test
    public void testTurnToCommandDirectionWithCommandRAndDirectionNMustReturnDirectionE() {
        System.out.println("testTurnToCommandDirectionWithCommandRAndDirectionNMustReturnDirectionE");
        Direction result = Direction.turnToCommandDirection(Direction.N, Command.R);
        assertEquals("Incorrect direction!", Direction.E, result);
    }
    
    @Test
    public void testTurnToCommandDirectionWithCommandRAndDirectionEMustReturnDirectionS() {
        System.out.println("testTurnToCommandDirectionWithCommandRAndDirectionEMustReturnDirectionS");
        Direction result = Direction.turnToCommandDirection(Direction.E, Command.R);
        assertEquals("Incorrect direction!", Direction.S, result);
    }
    
    @Test
    public void testTurnToCommandDirectionWithCommandRAndDirectionSMustReturnDirectionW() {
        System.out.println("testTurnToCommandDirectionWithCommandRAndDirectionSMustReturnDirectionW");
        Direction result = Direction.turnToCommandDirection(Direction.S, Command.R);
        assertEquals("Incorrect direction!", Direction.W, result);
    }

    @Test
    public void testTurnToCommandDirectionWithCommandRAndDirectionWMustReturnDirectionN() {
        System.out.println("testTurnToCommandDirectionWithCommandRAndDirectionWMustReturnDirectionN");
        Direction result = Direction.turnToCommandDirection(Direction.W, Command.R);
        assertEquals("Incorrect direction!", Direction.N, result);
    }
    
    @Test
    public void testTurnToCommandDirectionWithCommandLAndDirectionNMustReturnDirectionW() {
        System.out.println("testTurnToCommandDirectionWithCommandLAndDirectionNMustReturnDirectionW");
        Direction result = Direction.turnToCommandDirection(Direction.N, Command.L);
        assertEquals("Incorrect direction!", Direction.W, result);
    }
    
    @Test
    public void testTurnToCommandDirectionWithCommandLAndDirectionWMustReturnDirectionS() {
        System.out.println("testTurnToCommandDirectionWithCommandLAndDirectionWMustReturnDirectionS");
        Direction result = Direction.turnToCommandDirection(Direction.W, Command.L);
        assertEquals("Incorrect direction!", Direction.S, result);
    }
    
    @Test
    public void testTurnToCommandDirectionWithCommandLAndDirectionSMustReturnDirectionE() {
        System.out.println("testTurnToCommandDirectionWithCommandLAndDirectionSMustReturnDirectionE");
        Direction result = Direction.turnToCommandDirection(Direction.S, Command.L);
        assertEquals("Incorrect direction!", Direction.E, result);
    }
    
    @Test
    public void testTurnToCommandDirectionWithCommandLAndDirectionEMustReturnDirectionN() {
        System.out.println("testTurnToCommandDirectionWithCommandLAndDirectionEMustReturnDirectionN");
        Direction result = Direction.turnToCommandDirection(Direction.E, Command.L);
        assertEquals("Incorrect direction!", Direction.N, result);
    }
    
}
