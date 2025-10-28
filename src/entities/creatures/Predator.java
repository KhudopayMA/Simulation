package entities.creatures;

import java.util.Objects;

public class Predator extends Creature{
    private int attackDamage;

    public Predator(int hp, int speed) {
        super(hp, speed);
        this.attackDamage = 5;
    }

}
