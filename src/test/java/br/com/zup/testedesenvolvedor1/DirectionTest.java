package br.com.zup.testedesenvolvedor1;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ze12augusto
 */
public class DirectionTest {
    
    @Test
    public void testTurnToCommandDirectionWithCommandRAndDirectionWMustReturnDirectionN() {
        System.out.println("testTurnToCommandDirectionWithCommandRAndDirectionWMustReturnDirectionN");
        Direction result = Direction.turnToCommandDirection(Direction.W, Command.R);
        assertEquals("Incorrect direction!", Direction.N, result);
    }
    
    @Test
    public void testTurnToCommandDirectionWithCommandLAndDirectionEMustReturnDirectionN() {
        System.out.println("testTurnToCommandDirectionWithCommandLAndDirectionEMustReturnDirectionN");
        Direction result = Direction.turnToCommandDirection(Direction.E, Command.L);
        assertEquals("Incorrect direction!", Direction.N, result);
    }
    
}
