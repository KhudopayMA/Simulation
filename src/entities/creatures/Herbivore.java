package entities.creatures;

import entities.Grass;
import world.WorldMap;

import java.util.Objects;

public class Herbivore extends Creature{
    // todo рочитать подробно про рефлексию в java
    // private static final Class<Grass> targetType = Grass.class;

    public Herbivore(int hp, int speed) {
        super(hp, speed);
    }

    public void makeMove(WorldMap worldMap){
        // todo вызывает метод поиска bfs а карте и ищет ближайшую траву
    }

    // todo override Creature class method or create another,
    //  where Herbivore scan map and try to reach the closest grass
}
