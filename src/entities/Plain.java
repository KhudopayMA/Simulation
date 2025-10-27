package entities;

public class Plain extends Entity{
    private static final Plain PLAIN = new Plain();

    private Plain(){

    }

    public static Plain getInstance(){
        return PLAIN;
    }

}
