package world;

import entities.Grass;
import entities.creatures.Herbivore;

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
//        this.worldMap.getCells().
    }
}
