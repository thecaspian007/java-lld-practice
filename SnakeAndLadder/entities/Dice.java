package SnakeAndLadder.entities;

public class Dice {
    public final int minValue;
    public final int maxValue;

    public Dice(int minValue, int maxValue){
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    public int roll() {
        return (int) (Math.random() * (maxValue - minValue + 1) + minValue);
    }
}
