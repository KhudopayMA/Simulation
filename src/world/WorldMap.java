package world;

import entities.Entity;
import entities.Grass;
import entities.creatures.Herbivore;

import java.util.HashMap;
import java.util.Map;

public class WorldMap {
    public final int width;
    public final int height;
    public final Map<Cell, Entity> entities;

    public WorldMap(int width, int height){
        this.width = width;
        this.height = height;
        this.entities = new HashMap<>();
    }

    public WorldMap(){
        this.width = 5;
        this.height = 5;
        this.entities = new HashMap<>();
//        Random random = new Random();
    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }

    public Entity getEntityByCoordinates(int x, int y){
        return entities.get(new Cell(x, y));
    }
    public Map<Cell, Entity> getCells(){
        return entities;
    }



}
