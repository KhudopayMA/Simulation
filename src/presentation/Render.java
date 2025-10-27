package presentation;

import entities.*;
import entities.creatures.Herbivore;
import entities.creatures.Predator;
import world.Cell;
import world.WorldMap;

import java.util.Set;

public class Render {
    public void renderMap(WorldMap worldMap){
        System.out.println();
        for (int x = 0; x < worldMap.getWidth(); x++){
            for (int y = 0; y < worldMap.getHeight(); y++){
                Entity entity = worldMap.getEntity(x, y);
                Emoji emoji = getEmojiForEntity(entity);
                System.out.print(emoji);
            }
            System.out.println();
        }
        //todo рендер карты
    }

    private Emoji getEmojiForEntity(Entity entity){
        if (entity instanceof Plain){
            return Emoji.PLAIN;
        } else if (entity instanceof Grass){
            return Emoji.GRASS;
        } else if (entity instanceof Predator){
            return Emoji.PREDATOR;
        } else if (entity instanceof Herbivore){
            return Emoji.HERBIVORE;
        } else if (entity instanceof Tree){
            return Emoji.TREE;
        } else if (entity instanceof Rock){
            return Emoji.ROCK;
        }
        return null;
    }
}
