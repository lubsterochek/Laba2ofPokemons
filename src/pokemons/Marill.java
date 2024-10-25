package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Marill extends Azurill{

    public Marill(String name, int level){
        super(name, level);

        setType(Type.WATER, Type.FAIRY);
        setStats(70, 20, 50, 20, 50, 40);

        MuddyWater muddyWater = new MuddyWater();

        addMove(muddyWater);
    }
}
