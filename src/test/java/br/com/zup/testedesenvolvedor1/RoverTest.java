package br.com.zup.testedesenvolvedor1;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author ze12augusto
 */
public class RoverTest {
    
    private Map map;
    
    @Before
    public void setup(){
        map = new Map(5, 5, 0, 0);
    }
    
    @Test
    public void testCommandToMoveFirstExample() {
        System.out.println("testCommandToMoveFirstExample");
        Rover rover = new Rover(new Coordinate(1, 2, Direction.N, map));
        ArrayList<Command> commands = new ArrayList<>();
        commands.add(Command.L);
        commands.add(Command.M);
        commands.add(Command.L);
        commands.add(Command.M);
        commands.add(Command.L);
        commands.add(Command.M);
        commands.add(Command.L);
        commands.add(Command.M);
        commands.add(Command.M);
        Coordinate result = rover.commandToMove(commands);
        assertEquals("Incorrect coordinate x!", (long) 1, (long) result.getX());
        assertEquals("Incorrect coordinate y!", (long) 3, (long) result.getY());
        assertEquals("Incorrect heading!", Direction.N, result.getHeading());
    }
    
    @Test
    public void testCommandToMoveSecondExample() {
        System.out.println("testCommandToMoveSecondExample");
        Rover rover = new Rover(new Coordinate(3, 3, Direction.E, map));
        ArrayList<Command> commands = new ArrayList<>();
        commands.add(Command.M);
        commands.add(Command.M);
        commands.add(Command.R);
        commands.add(Command.M);
        commands.add(Command.M);
        commands.add(Command.R);
        commands.add(Command.M);
        commands.add(Command.R);
        commands.add(Command.R);
        commands.add(Command.M);
        Coordinate result = rover.commandToMove(commands);
        assertEquals("Incorrect coordinate x!", (long) 5, (long) result.getX());
        assertEquals("Incorrect coordinate y!", (long) 1, (long) result.getY());
        assertEquals("Incorrect heading!", Direction.E, result.getHeading());
    }
}
