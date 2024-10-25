package moves;

import ru.ifmo.se.pokemon.*;

public class WorkUp extends StatusMove {

    public WorkUp() {
        type = Type.NORMAL;
        power = 0;
        accuracy = 100;
        priority = 30;
    }

    @Override
    protected  void applySelfEffects(Pokemon p) {
        p.addEffect(new Effect().chance(1).stat(Stat.ATTACK, 1).stat(Stat.SPECIAL_ATTACK, 1));
        System.out.println(p + " повышает свои атаки на 1 уровень.");
    }

    @Override
    protected String describe() {
        return "начинает жестко Work Up-аться";
    }
}
