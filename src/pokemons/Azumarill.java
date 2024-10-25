package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Azumarill extends Marill{

    public Azumarill(String name, int level) {
        super(name, level);

        setType(Type.WATER, Type.FAIRY);
        setStats(100, 50, 80, 60, 80, 50);

        Swagger swagger = new Swagger();

        addMove(swagger);
    }
}
