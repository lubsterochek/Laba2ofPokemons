package moves;

import ru.ifmo.se.pokemon.*;

public class Confide extends StatusMove {

    public Confide(){
        type = Type.NORMAL;
        power = 0;
        accuracy = 100;
        priority = 20;
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        p.addEffect(new Effect().chance(1).stat(Stat.SPECIAL_ATTACK, -1));
        System.out.println("У " + p + " 1 уровня специальной атаки.");
    }

    @Override
    protected String describe() {
        return "применяет Confide";
    }
}
