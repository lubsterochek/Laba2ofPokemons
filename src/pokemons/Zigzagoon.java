package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Zigzagoon extends Pokemon{

    public Zigzagoon(String name, int level){
        super(name, level);

        setType(Type.NORMAL);
        setStats(38, 30, 41, 30, 41, 60);

        ShadowBall shadowBall = new ShadowBall();
        Thunder thunder = new Thunder();
        Headbutt headbutt = new Headbutt();

        setMove(shadowBall, thunder, headbutt);
    }

}
