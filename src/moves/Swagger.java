package moves;
import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {

    public Swagger(){
        type = Type.NORMAL;
        power = 0;
        accuracy = 85;
        priority = 15;
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        Effect.confuse(p);
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        p.addEffect(new Effect().stat(Stat.ATTACK, 2));
    }

    @Override
    protected String describe(){
        return "применяет атаку Swagger";
    }
}
