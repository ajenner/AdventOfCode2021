package Submarine;

public class Instruction {

    private String direction;
    private int impulse;

    public Instruction(String direction, int impulse) {
        this.direction = direction;
        this.impulse = impulse;
    }

    public String getDirection() {
        return this.direction;
    }

    public int getImpulse() {
        return this.impulse;
    }
}