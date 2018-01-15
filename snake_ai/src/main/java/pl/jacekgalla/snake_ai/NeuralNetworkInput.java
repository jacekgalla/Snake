package pl.jacekgalla.snake_ai;

/**
 * Created by Jacek on 2018-01-13.
 */

public class NeuralNetworkInput {

    static final int UP = 1;
    static final int DOWN = 2;
    static final int LEFT = 3;
    static final int RIGHT = 4;

    static final int WALL = 100;
    static final int SNAKE = 101;
    static final int FOOD = 200;

    private int direction;
    private int object;
    private int distance;

    NeuralNetworkInput(int diretion, int object, int distance){
        this.direction = diretion;
        this.object = object;
        this.distance = distance;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public int getObject() {
        return object;
    }

    public void setObject(int object) {
        this.object = object;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
