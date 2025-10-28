package world;

import entities.Entity;
import entities.Grass;
import entities.creatures.Herbivore;

import java.util.HashMap;
import java.util.Map;

public class WorldMap {
    private final int width;
    private final int height;
    private final Map<Cell, Entity> cells;

    public WorldMap(int width, int height){
        this.width = width;
        this.height = height;
        this.cells = new HashMap<>();
    }

    public WorldMap(){
        this.width = 5;
        this.height = 5;
        this.cells = new HashMap<>();
//        Random random = new Random();
    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }

    public Entity getEntityByCoordinates(int x, int y){
        return cells.get(new Cell(x, y));
    }
    public Map<Cell, Entity> getCells(){
        return cells;
    }



}
