package world;

import entities.Entity;
import entities.Rock;
import entities.Tree;
import entities.creatures.Creature;

import java.util.*;

public class Pathfinder {
    public static List<Cell> findPath(WorldMap worldMap, Cell entityLocation, Creature targetEntity) {
        Deque<Cell> queue = new LinkedList<>();
        Map<Cell, List<Cell>> pathsToTheCells = new HashMap<>();
        Set<Cell> visitedCells = new HashSet<>();
        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        Class<? extends Entity> target = targetEntity.getTargetType();
        queue.add(entityLocation);
        pathsToTheCells.put(entityLocation, new LinkedList<>());
        visitedCells.add(entityLocation);
        while (!queue.isEmpty()) {
            Cell cell = queue.poll();

            if (target.isInstance(worldMap.entities.get(cell))) {
                List<Cell> path = pathsToTheCells.get(cell);
                path.add(cell);
                return path;
            }

            for (int[] direction : directions) {
                int x = cell.x + direction[0];
                int y = cell.y + direction[1];
                if (!(x < worldMap.width) && (y < worldMap.height)) continue;
                Cell neighbor = new Cell(x, y);
                Entity neighborEntity = worldMap.entities.get(neighbor);
                if (neighborEntity instanceof Rock || neighborEntity instanceof Tree) continue;
                if (!visitedCells.contains(neighbor)){
                    List<Cell> pathToNeighbor = new ArrayList<>(pathsToTheCells.get(cell));
                    pathToNeighbor.add(cell);
                    pathsToTheCells.put(neighbor, pathToNeighbor);
                    queue.add(neighbor);
                    visitedCells.add(neighbor);
                }

            }
        }
        return new LinkedList<>();
    }
}
