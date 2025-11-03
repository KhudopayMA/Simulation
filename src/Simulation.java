import world.Actions;
import presentation.Render;
import world.WorldMap;

public class Simulation {

    // todo остановка симуляции по нажатию p
    public void startSimulation(){
        WorldMap worldMap = new WorldMap();
        Actions actions = new Actions(worldMap);
        Render render = new Render();
        actions.initActions();
        while (true){
            render.renderMap(worldMap);
            nextTurn(actions);
        }
    }

    public void pauseSimulation(){
        // todo пауза через потоки
    }

    public void nextTurn(Actions actions){
        actions.turnActions();
    }



}
