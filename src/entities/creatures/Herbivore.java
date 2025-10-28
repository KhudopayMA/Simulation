package entities.creatures;

import java.util.Objects;

public class Herbivore extends Creature{
    public Herbivore(int hp, int speed) {
        super(hp, speed);
    }
    

    // todo override Creature class method or create another,
    //  where Herbivore scan map and try to reach the closest grass
}
