package moves;

import ru.ifmo.se.pokemon.*;

public class ShadowBall extends SpecialMove {

    public ShadowBall(){
        type = Type.GHOST;
        power = 80;
        accuracy = 100;
        priority = 15;
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        p.addEffect(new Effect().chance(0.2).stat(Stat.SPECIAL_DEFENSE, -1));
        System.out.println("У " + p + " понижена специальная защита на 1 уровень!");
    }

    @Override
    protected String describe() {
        return "кидает Shadow Ball";
    }
}
