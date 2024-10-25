package moves;

import ru.ifmo.se.pokemon.*;

public class Scald extends SpecialMove {

    public Scald() {
        type = Type.WATER;
        power = 80;
        accuracy = 100;
        priority = 15;
    }

    @Override
    protected  void applyOppEffects(Pokemon p){
        if (Math.random()<=0.3){
            Effect.burn(p);
        }
    }

    @Override
    protected String describe() {
        return "применяет атаку Scald";
    }
}
