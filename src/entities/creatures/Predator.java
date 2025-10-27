package entities.creatures;

import java.util.Objects;

public class Predator extends Creature{
    private int attackDamage;

    public Predator(int hp, int speed) {
        super(hp, speed);
        this.attackDamage = 5;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Predator predator)) return false;
        return attackDamage == predator.attackDamage && speed == predator.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode());
    }
}
