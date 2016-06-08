package br.com.zup.testedesenvolvedor1;

import java.util.ArrayList;

/**
 *
 * @author ze12augusto
 */
public class Rover {
    
    private Coordinate coordinate;

    public Rover(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }
    
    public Coordinate commandToMove(ArrayList<Command> commands){
        for(Command command : commands){
            if(command == Command.M){
                coordinate.moveToDirection(coordinate.getHeading());
            }else{
                Direction direction = Direction.turnToCommandDirection(coordinate.getHeading(), command);
                coordinate.setHeading(direction);
            }
        }
        return coordinate;
    }
} 