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
    private WorldMap worldMap;

    public Actions(WorldMap worldMap){
        this.worldMap = worldMap;
    }

    public void initActions(){
        Herbivore herbivore1 = new Herbivore(5, 1);
        Herbivore herbivore2 = new Herbivore(5, 1);
        Grass grass = new Grass();
        Predator predator = new Predator(10, 2);
        Tree tree = new Tree();
        Rock rock  = new Rock();
        this.worldMap.getEntities().put(new Cell(2, 3),herbivore1);
        this.worldMap.getEntities().put(new Cell(1, 1),herbivore2);
        this.worldMap.getEntities().put(new Cell(0, 0),grass);
        this.worldMap.getEntities().put(new Cell(0, 1),predator);
        this.worldMap.getEntities().put(new Cell(2, 2),tree);
        this.worldMap.getEntities().put(new Cell(3, 2),rock);
    }

    public void turnActions(){
        List<Map.Entry<Cell, Entity>> herbivores = new ArrayList<>();
        List<Map.Entry<Cell, Entity>> predators = new ArrayList<>();
        for (Map.Entry<Cell, Entity> entity: worldMap.getEntities().entrySet()){
            if (entity.getValue() instanceof Herbivore){
                herbivores.add(entity);
            } else if (entity.getValue() instanceof Predator){
                predators.add(entity);
            }
//                if (entity.getValue() instanceof Creature) {
//                    // todo подумать над решением ConcurrentModificationException. например можно создавать список сущест и по очереди раблтать с ними
//                    // не итерироваться про карте а вытащитьс ущности с дейсвием в отдлеьные списки, по чоереди читать списки  и вносить изменеия нак карту тогда карта будет актуальна для каждого дейсвия существа
//                    List<Cell> path = Pathfinder.findPath(worldMap, entity.getKey(), (Creature)entity.getValue());
//                    ((Creature) entity.getValue()).makeMove(worldMap, entity.getKey(), path);
//                }
        }
        for (Map.Entry<Cell, Entity> herbivore: herbivores){
            List<Cell> path = Pathfinder.findPath(worldMap, herbivore.getKey(), (Creature)herbivore.getValue());
            ((Creature) herbivore.getValue()).makeMove(worldMap, herbivore.getKey(), path);
        }
        for (Map.Entry<Cell, Entity> predator: predators){
            List<Cell> path = Pathfinder.findPath(worldMap, predator.getKey(), (Creature)predator.getValue());
            ((Creature) predator.getValue()).makeMove(worldMap, predator.getKey(), path);
        }
    }
}
