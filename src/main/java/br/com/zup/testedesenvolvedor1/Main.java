package br.com.zup.testedesenvolvedor1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ze12augusto
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Map map = getMapCoordinates();
        while( map == null ){
            System.out.println("Invalid map coordinates!");
            map = getMapCoordinates();
        }
        while(true){
            Coordinate coordinate = getRoverCoordinates(map);
            while(coordinate == null){
                System.out.println("Invalid rover coordinates!");
                coordinate = getRoverCoordinates(map);
            }
            ArrayList<Command> commands = getRoverCommands();
            while(commands == null || commands.isEmpty()){
                System.out.println("Invalid rover commands!");
                commands = getRoverCommands();
            }
            Rover rover = new Rover(coordinate);
            Coordinate finalCoordinate = rover.commandToMove(commands);
            System.out.println("The final rover coordinate is");
            System.out.println(
                finalCoordinate.getX() +
                " " +
                finalCoordinate.getY() +
                " " +
                finalCoordinate.getHeading().name()
            );
        }
    }
    
    private static Map getMapCoordinates(){
        System.out.println("Enter the map coordinates!");
        Scanner scanner = new Scanner(System.in);
        String params = scanner.nextLine();
        if(params != null && !params.isEmpty()){
            String[] coordinates = params.split(" ");
            try{
                return new Map(
                        Integer.valueOf(coordinates[0]), 
                        Integer.valueOf(coordinates[1]), 
                        0, 
                        0
                );
            }catch(Exception ex){
                return null;
            }
        }else{
            return null;
        }
    }
    
    private static Coordinate getRoverCoordinates(Map map){
        System.out.println("Enter the rover coordinates");
        Scanner scanner = new Scanner(System.in);
        String params = scanner.nextLine();
        if(params != null && !params.isEmpty()){
            String[] coordinates = params.split(" ");
            try{
                return new Coordinate(
                        Integer.valueOf(coordinates[0]), 
                        Integer.valueOf(coordinates[1]), 
                        Direction.valueOf(coordinates[2].toUpperCase()), 
                        map
                );
            }catch(Exception ex){
                return null;
            }
        }else{
            return null;
        }
    }
    
    private static ArrayList<Command> getRoverCommands(){
        System.out.println("Enter the rover commands");
        Scanner scanner = new Scanner(System.in);
        String params = scanner.nextLine();
        if(params != null && !params.isEmpty()){
            String[] comands = params.split("(?!^)");
            try{
                ArrayList<Command> commands = new ArrayList<>();
                for(String command : comands){
                    commands.add(Command.valueOf(command.toUpperCase()));
                }
                return commands;
            }catch(Exception ex){
                return null;
            }
        }else{
            return null;
        }
    }
    
}
