package moves;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {

    public Rest(){
        type = Type.PSYCHIC;
        power = 0;
        accuracy = 100;
        priority = 10;
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        p.addEffect(new Effect().condition(Status.SLEEP).turns(2));
        p.addEffect(new Effect().stat(Stat.HP, (int)p.getStat(Stat.HP)));
    }

    @Override
    protected  String describe(){
        return "применяет на себя Rest";
    }
}
