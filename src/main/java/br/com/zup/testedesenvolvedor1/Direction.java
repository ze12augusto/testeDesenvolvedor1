package br.com.zup.testedesenvolvedor1;

/**
 *
 * @author ze12augusto
 */
public enum Direction {
    N, E, S, W;
    
    public static Direction turnToCommandDirection(Direction direction, Command command){
        if(command == Command.R){
            if(direction == N){
                return E;
            }else if(direction == E){
                return S;
            }else if(direction == S){
                return W;
            }else if(direction == W){
                return N;
            }
        }else if(command == Command.L){
            if(direction == N){
                return W;
            }else if(direction == E){
                return N;
            }else if(direction == S){
                return E;
            }else if(direction == W){
                return S;
            }
        }
        return direction;
    }
}
