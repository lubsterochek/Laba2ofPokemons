package moves;

import ru.ifmo.se.pokemon.*;

public class Thunder extends SpecialMove {

    public Thunder(){
        type = Type.ELECTRIC;
        power = 110;
        accuracy = 70;
        priority = 10;
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random()<=0.3) {
            Effect.paralyze(p);
        }
    }

    @Override
    protected String describe() {
        return "действует атакой Thunder";
    }
}
