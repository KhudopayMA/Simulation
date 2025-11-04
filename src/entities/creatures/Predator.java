package entities.creatures;

import world.Cell;
import world.WorldMap;

import java.util.List;
import java.util.Objects;

public class Predator extends Creature{
    private final int attackDamage;
    private final int attackRange;

    public Predator(int hp, int speed) {
        super(hp, speed, Herbivore.class);
        this.attackDamage = 5;
        this.attackRange = 2;
    }

//    @Override
//    public void makeMove(WorldMap worldMap, Cell currentCell, List<Cell> path) {
//        if (!path.isEmpty()){
//            Cell newCell;
//            if (path.size() <= speed){
//                newCell = path.get(path.size()-1);
//            } else {
//                newCell = path.get(speed-1);
//            }
//            worldMap.removeCell(currentCell);
//            worldMap.addEntity(newCell, this);
//        }
//    }
}
