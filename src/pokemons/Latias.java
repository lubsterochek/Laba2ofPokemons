package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Latias extends Pokemon{

    public Latias(String name, int level){
        super(name, level);

        setType(Type.DRAGON, Type.PSYCHIC);
        setStats(80, 80, 90, 110, 130, 110);

        Confide confide = new Confide();
        Refresh refresh = new Refresh();
        Rest rest = new Rest();
        Swagger swagger = new Swagger();

        setMove(confide, refresh, rest, swagger);
    }

}
