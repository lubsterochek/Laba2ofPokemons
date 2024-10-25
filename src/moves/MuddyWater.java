package moves;

import ru.ifmo.se.pokemon.*;

public class MuddyWater extends SpecialMove{

    public MuddyWater(){
        type = Type.WATER;
        power = 90;
        accuracy = 85;
        priority = 10;
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        p.addEffect(new Effect().chance(0.3).stat(Stat.ACCURACY, -1));
        System.out.println("У " + p + " понижена точность на 1 уровень!");
    }

    @Override
    protected String describe() {
        return "действует атакой Muddy Water";
    }
}
