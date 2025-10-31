package entities.creatures;

import entities.Entity;
import world.WorldMap;

import java.util.Objects;

public abstract class Creature extends Entity {
    protected int hp;
    protected final int speed;

    public Creature(int hp, int speed){
        this.hp = hp;
        this.speed = speed;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Creature creature)) return false;
        return speed == creature.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(speed);
    }

    public int getSpeed(){
        return speed;
    }

    public int getHP(){
        return speed;
    }

    public void setHP(int hp){
        this.hp = hp;
    }

    public void makeMove(WorldMap worldMap){
        // todo про методы в абстрактных классах
        // todo pass in method position from map or something like that
    }
}
