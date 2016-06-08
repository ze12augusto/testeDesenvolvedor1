package br.com.zup.testedesenvolvedor1;



/**
 *
 * @author ze12augusto
 */
public class Coordinate {
    private Integer x;
    private Integer y;
    private Direction heading;
    private Map map;

    public Coordinate(Integer x, Integer y, Direction heading, Map map) {
        this.x = x;
        this.y = y;
        this.heading = heading;
        this.map = map;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Direction getHeading() {
        return heading;
    }

    public void setHeading(Direction heading) {
        this.heading = heading;
    }
    
    private void incrementY(Direction direction){
        if( y >= map.getMaxY() ){
            System.out.println("Cannot move to " + direction.name() + " anymore, i'm on the end.");
        }else{
            y++;
        }
    }
    
    private void decrementY(Direction direction){
        if( y <= map.getMinY() ){
            System.out.println("Cannot move to " + direction.name() + " anymore, i'm on the end.");
        }else{
            y--;
        }
    }
    
    private void incrementX(Direction direction){
        if( x >= map.getMaxX() ){
            System.out.println("Cannot move to " + direction.name() + " anymore, i'm on the end.");
        }else{
            x++;
        }
    }
    
    private void decrementX(Direction direction){
        if( x <= map.getMinX() ){
            System.out.println("Cannot move to " + direction.name() + " anymore, i'm on the end.");
        }else{
            x--;
        }
    }
    
    public void moveToDirection(Direction direction){
        if( direction == Direction.N ){
            incrementY(direction);
        }else if( direction == Direction.S ){
            decrementY(direction);
        }else if( direction == Direction.W ){
            decrementX(direction);
        }else if( direction == Direction.E ){
            incrementX(direction);
        }
        heading = direction;
    }
}
