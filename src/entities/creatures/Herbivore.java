package entities.creatures;

import java.util.Objects;

public class Herbivore extends Creature{
    public Herbivore(int hp, int speed) {
        super(hp, speed);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Herbivore herbivore)) return false;
        return speed == herbivore.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(speed);
    }


    // todo override Creature class method or create another,
    //  where Herbivore scan map and try to reach the closest grass
}
