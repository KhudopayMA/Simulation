package world;

import entities.Entity;
import entities.Grass;
import entities.creatures.Creature;
import entities.creatures.Herbivore;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Actions {
    private WorldMap worldMap;

    public Actions(WorldMap worldMap){
        this.worldMap = worldMap;
    }

    public void initActions(){
        Herbivore herbivore = new Herbivore(5, 1);
        Grass grass = new Grass();
        this.worldMap.getCells().put(new Cell(2, 3),herbivore);
        this.worldMap.getCells().put(new Cell(0, 0),grass);
    }

    public void turnActions(){
        for (Map.Entry<Cell, Entity> entity: worldMap.entities.entrySet()){
                if (entity.getValue() instanceof Creature) {
                    List<Cell> path = Pathfinder.findPath(worldMap, entity.getKey(), (Creature)entity.getValue());
                    ((Creature) entity.getValue()).makeMove(worldMap, entity.getKey(), path);
                }
        }
    }
}
