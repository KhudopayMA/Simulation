package entities.creatures;

import entities.Grass;
import world.Cell;
import world.WorldMap;

import java.util.List;
import java.util.Objects;

public class Herbivore extends Creature{
    // todo рочитать подробно про рефлексию в java
    // private static final Class<Grass> targetType = Grass.class;

    public Herbivore(int hp, int speed) {
        super(hp, speed, Grass.class);
    }

    @Override
    public void makeMove(WorldMap worldMap, Cell currentCell,  List<Cell> path){
        if (!path.isEmpty()){
            Cell newCell = path.get(speed);
            worldMap.removeCell(currentCell);
            worldMap.addEntity(newCell, this);
        }
        System.out.println(path);
        // todo вызывает метод поиска bfs а карте и ищет ближайшую траву
    }

    // todo override Creature class method or create another,
    //  where Herbivore scan map and try to reach the closest grass
}
