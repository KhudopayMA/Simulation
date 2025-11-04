package world;

import entities.Entity;
import entities.Grass;
import entities.creatures.Herbivore;

import java.util.HashMap;
import java.util.Map;

public class WorldMap {
    private final int width;
    private final int height;
    private final Map<Cell, Entity> entities;

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

    public Entity getEntityByCell(Cell cell){
        return entities.get(cell);
    }

    public void addEntity(Cell cell, Entity entity){
        entities.put(cell, entity);
    }

    public void removeCell(Cell cell){
        entities.remove(cell);
    }

    public Map<Cell, Entity> getEntities(){
        return entities;
    }



}
