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

    @Override
    public void makeMove(WorldMap worldMap, Cell currentCell, List<Cell> path) {

    }
}
