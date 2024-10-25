package moves;

import ru.ifmo.se.pokemon.*;

public class Refresh extends StatusMove {

    public Refresh(){
        type = Type.NORMAL;
        power = 0;
        accuracy = 100;
        priority = 20;
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        Status negativeEffect = p.getCondition();
        if (negativeEffect == Status.BURN || negativeEffect == Status.POISON || negativeEffect == Status.PARALYZE){
            p.setCondition(new Effect().condition(Status.NORMAL));
            System.out.println(p+ " убирает с себя негатиевные эффекты.");
        }
    }

    @Override
    protected String describe(){
        return "применяет на себя Refresh";
    }
}
