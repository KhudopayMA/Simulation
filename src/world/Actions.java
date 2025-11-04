package world;

import entities.Entity;
import entities.Grass;
import entities.Rock;
import entities.Tree;
import entities.creatures.Creature;
import entities.creatures.Herbivore;
import entities.creatures.Predator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Actions {
    private final WorldMap WORLDMAP;

    public Actions(WorldMap worldMap){
        this.WORLDMAP = worldMap;
    }

    public void initActions(){
        Herbivore herbivore1 = new Herbivore(5, 10);
        Herbivore herbivore2 = new Herbivore(5, 10);
        Grass grass1 = new Grass();
        Grass grass2 = new Grass();
        Predator predator = new Predator(10, 2);
        Tree tree = new Tree();
        Rock rock  = new Rock();
        this.WORLDMAP.getEntities().put(new Cell(2, 3),herbivore1);
        this.WORLDMAP.getEntities().put(new Cell(1, 1),herbivore2);
        this.WORLDMAP.getEntities().put(new Cell(0, 0),grass1);
        this.WORLDMAP.getEntities().put(new Cell(3, 1),grass2);
        this.WORLDMAP.getEntities().put(new Cell(0, 1),predator);
        this.WORLDMAP.getEntities().put(new Cell(2, 2),tree);
        this.WORLDMAP.getEntities().put(new Cell(3, 2),rock);
    }

    public void turnActions(){
        List<Map.Entry<Cell, Entity>> herbivores = new ArrayList<>();
        List<Map.Entry<Cell, Entity>> predators = new ArrayList<>();
        for (Map.Entry<Cell, Entity> entity: WORLDMAP.getEntities().entrySet()){
            if (entity.getValue() instanceof Herbivore){
                herbivores.add(entity);
            } else if (entity.getValue() instanceof Predator){
                predators.add(entity);
            }
        }
        for (Map.Entry<Cell, Entity> herbivore: herbivores){
            List<Cell> path = Pathfinder.findPath(WORLDMAP, herbivore.getKey(), (Creature)herbivore.getValue());
            ((Creature) herbivore.getValue()).makeMove(WORLDMAP, herbivore.getKey(), path);
        }
        for (Map.Entry<Cell, Entity> predator: predators){
            List<Cell> path = Pathfinder.findPath(WORLDMAP, predator.getKey(), (Creature)predator.getValue());
            ((Creature) predator.getValue()).makeMove(WORLDMAP, predator.getKey(), path);
        }
    }
}
