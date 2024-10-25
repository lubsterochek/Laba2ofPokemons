package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Azurill extends Pokemon {

    public Azurill(String name, int level){
        super(name, level);

        setType(Type.NORMAL, Type.FAIRY);
        setStats(50, 20, 40, 20, 40,20);

        Scald scald = new Scald();
        WorkUp workUp = new WorkUp();

        setMove(scald, workUp);
    }

}
