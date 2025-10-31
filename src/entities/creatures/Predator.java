package entities.creatures;

import java.util.Objects;

public class Predator extends Creature{
    private final int attackDamage;
    private final int attackRange;

    public Predator(int hp, int speed) {
        super(hp, speed);
        this.attackDamage = 5;
        this.attackRange = 2;
    }

}
