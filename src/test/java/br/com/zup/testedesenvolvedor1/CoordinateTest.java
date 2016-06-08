package br.com.zup.testedesenvolvedor1;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author ze12augusto
 */
public class CoordinateTest {
    
    private Map map;
    
    @Before
    public void setup(){
        map = new Map(5, 5, 0, 0);
    }
    
    @Test
    public void testMoveToDirectionFromNWithDirectionSAndY1MustReturnY0() {
        System.out.println("testMoveToDirectionFromNWithDirectionSAndY1MustReturnY0");
        Coordinate coordinate = new Coordinate(0, 1, Direction.N, map);
        coordinate.moveToDirection(Direction.S);
        assertEquals("Incorrect coodinate y!", (long) 0, (long) coordinate.getY());
    }
    
    @Test
    public void testMoveToDirectionFromSWithDirectionNAndY0MustReturnY1() {
        System.out.println("testMoveToDirectionFromSWithDirectionNAndY0MustReturnY1");
        Coordinate coordinate = new Coordinate(0, 0, Direction.S, map);
        coordinate.moveToDirection(Direction.N);
        assertEquals("Incorrect coodinate y!", (long) 1, (long) coordinate.getY());
    }
    
    @Test
    public void testMoveToDirectionFromWWithDirectionEAndX0MustReturnX1() {
        System.out.println("testMoveToDirectionFromWWithDirectionEAndX0MustReturnX1");
        Coordinate coordinate = new Coordinate(0, 0, Direction.W, map);
        coordinate.moveToDirection(Direction.E);
        assertEquals("Incorrect coodinate x!", (long) 1, (long) coordinate.getX());
    }
    
    @Test
    public void testMoveToDirectionFromEWithDirectionWAndX0MustReturnX0() {
        System.out.println("testMoveToDirectionFromEWithDirectionWAndX0MustReturnX0");
        Coordinate coordinate = new Coordinate(0, 1, Direction.E, map);
        coordinate.moveToDirection(Direction.W);
        assertEquals("Incorrect coodinate x!", (long) 0, (long) coordinate.getX());
    }
    
}
