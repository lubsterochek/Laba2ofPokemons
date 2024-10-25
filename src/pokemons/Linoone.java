package pokemons;

import moves.*;

public class Linoone extends Zigzagoon{

    public Linoone(String name, int level){
        super(name, level);

        setStats(78, 70, 61, 50, 61, 100);

        PlayRough playRough = new PlayRough();

        addMove(playRough);
    }

}
